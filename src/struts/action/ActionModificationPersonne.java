package struts.action;



import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;
import metier.Serveur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import struts.actionForm.ActionFormModificationPersonne;
import dao.DAOPersonne;
import dao.DAOServeur;

public class ActionModificationPersonne extends Action{
	private DAOPersonne daoPersonne=null;
	private DAOServeur daoServeur=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormModificationPersonne formPersonne=(ActionFormModificationPersonne)form;
		Personne personne=null;
		Serveur serv=new Serveur();
		String photo=formPersonne.getPhoto();
		String url;//=formPersonne.getUrlPhoto();
		try {
			personne=new Personne(formPersonne.getNom().replaceFirst(".",(formPersonne.getNom().charAt(0)+"").toUpperCase())
						,formPersonne.getPrenom().replaceFirst(".",(formPersonne.getPrenom().charAt(0)+"").toUpperCase())
						,Date.valueOf(formPersonne.getDateDeNaissance())
						,formPersonne.getBiographie()
						,photo,0);	
			personne.setIsValidatePersonne(formPersonne.getIdPersonne());	
			daoPersonne.save(personne);
			
			int code=personne.getIdPersonne();
			
			FormFile file=formPersonne.getFile();
			
			String contentType = file.getContentType();
			String[] format=contentType.split("/");
			String type=format[0];
			String extension=format[1];
	        String fileName    = file.getFileName();
	        //int fileSize       = file.getFileSize();
	        //byte[] fileData    = file.getFileData();
	        
	        String dossier="images/personnes/";
	        
	        fileName=formPersonne.getIdPersonne()+"."+extension;
	        String filePath = getServlet().getServletContext().getRealPath("/").replace('\\','/') +dossier;
	        
			if(!fileName.equals("") && type.equals("image"))
			{  
				fileName=code+"."+extension;
//				photo=filePath+fileName;
				url=getServlet().getServletContext().getRealPath("/").replace('\\','/');
				photo="../images/personnes/"+fileName;
				personne.setPhoto(photo);
				serv.setUrl(url);
				daoServeur.save(serv);
				daoPersonne.saveOrUpdate(personne);
				
				System.out.println("Server path:" +filePath);
				//Create file
				File fileToCreate = new File(filePath, fileName);
				//If file does not exists create file                      
				if(!fileToCreate.exists()){
					FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
					fileOutStream.write(file.getFileData());
					fileOutStream.flush();
					fileOutStream.close();
				}		
			}  
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("ModificationPersonneEffectue");
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public DAOServeur getDaoServeur() {
		return daoServeur;
	}

	public void setDaoServeur(DAOServeur daoServeur) {
		this.daoServeur = daoServeur;
	}


}
