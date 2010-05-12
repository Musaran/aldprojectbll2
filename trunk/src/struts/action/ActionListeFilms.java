package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOFilm;

public class ActionListeFilms extends Action{
	private DAOFilm daoFilm=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ArrayList<Film> films=null;
		try {
			films=daoFilm.loadAll();
			System.out.println("films "+films.size());
			request.setAttribute("LISTEFILMS", films);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			films.add(new Film());
			request.setAttribute("LISTEFILMS", films);
		}
		return mapping.findForward("VueListeFilms");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}


}
