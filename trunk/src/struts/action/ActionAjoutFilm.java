package struts.action;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Serveur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import struts.actionForm.ActionFormAjoutFilm;
import dao.DAOFilm;
import dao.DAOServeur;

public class ActionAjoutFilm extends Action{
	private DAOFilm daoFilm=null;
	private DAOServeur daoServeur=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormAjoutFilm formFilm=(ActionFormAjoutFilm)form;
		Film film=null;
		Serveur serv=new Serveur();
		String affiche="aucune_photo";
		String url;
		try {
			film=new Film(formFilm.getTitre().replaceFirst(".",(formFilm.getTitre().charAt(0)+"").toUpperCase()),
					Date.valueOf(formFilm.getDateSortie()),
					formFilm.getCout(),
					formFilm.getSynopsis(),
					0,
					affiche);	
			daoFilm.save(film);
			
			int code=film.getIdFilm();
			
			FormFile file=formFilm.getFile();
			
			String contentType = file.getContentType();
			String[] format=contentType.split("/");
			String type=format[0];
			String extension=format[1];
	        String fileName    = file.getFileName();
	        //int fileSize       = file.getFileSize();
	        //byte[] fileData    = file.getFileData();
	        String dossier="images/films/";
	        
			
	        String filePath = getServlet().getServletContext().getRealPath("/").replace('\\','/')+dossier;
	        
			if(!fileName.equals("") && type.equals("image"))
			{  
				fileName=code+"."+extension;
				url=getServlet().getServletContext().getRealPath("/").replace('\\','/');
				affiche="../images/films/"+fileName;
				film.setAffiche(affiche);
				serv.setUrl(url);
				daoFilm.saveOrUpdate(film);
				daoServeur.save(serv);
				
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
			else
			{
				System.out.println("problème nom ou extension fichier");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("AjoutFilmEffectue");
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}

	public DAOServeur getDaoServeur() {
		return daoServeur;
	}

	public void setDaoServeur(DAOServeur daoServeur) {
		this.daoServeur = daoServeur;
	}

	

}
