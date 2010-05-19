package struts.action;



import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.*;

import struts.actionForm.ActionFormModificationFilm;
import dao.DAOFilm;

public class ActionModificationFilm extends Action{
	private DAOFilm daoFilm=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormModificationFilm formFilm=(ActionFormModificationFilm)form;
		Film film=null;
		String affiche=formFilm.getAffiche();
		try {
			FormFile file=formFilm.getFile();
			
			String contentType = file.getContentType();
	        String fileName    = file.getFileName();
	        int fileSize       = file.getFileSize();
	        byte[] fileData    = file.getFileData();
	        
	        String dossierTemp="imagestemp";
	        
	        String filePath = getServlet().getServletContext().getRealPath("/") +dossierTemp;

			if(!fileName.equals(""))
			{  
				System.out.println("Server path:" +filePath);
				//Create file
				File fileToCreate = new File(filePath, fileName);
				//If file does not exists create file                      
				if(!fileToCreate.exists()){
					FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
					fileOutStream.write(file.getFileData());
					fileOutStream.flush();
					fileOutStream.close();
					affiche="../"+dossierTemp+"/"+fileName;
				}
					
			}  
			film=new Film(formFilm.getTitre(),Date.valueOf(formFilm.getDateSortie()),formFilm.getCout(),formFilm.getSynopsis(),0,affiche);	
			//film.setIsValidateFilm(formFilm.getIdFilm());	
			daoFilm.save(film);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("ModificationFilmEffectue");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}


}
