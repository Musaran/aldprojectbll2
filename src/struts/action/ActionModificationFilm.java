package struts.action;



import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormModificationFilm;
import dao.DAOFilm;

public class ActionModificationFilm extends Action{
	private DAOFilm daoFilm=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormModificationFilm formFilm=(ActionFormModificationFilm)form;
		Film film=null;
		try {
			System.out.println(Date.valueOf(formFilm.getDateSortie()));
			
			film=new Film(formFilm.getTitre(),Date.valueOf(formFilm.getDateSortie()),formFilm.getCout(),formFilm.getSynopsis(),0,formFilm.getFile());
			if(formFilm.getFile().equals(""))
				
			film.setIsValidateFilm(formFilm.getIdFilm());
			
			System.out.println(film.toString());
			System.out.println(film.getAffiche());
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
