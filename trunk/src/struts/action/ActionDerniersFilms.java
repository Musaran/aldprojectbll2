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

public class ActionDerniersFilms extends Action{
	private DAOFilm daof=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
			try {
				ArrayList<Film> derniersFilms=daof.loadLasts(1);
				request.setAttribute("DERNIERSFILMS", derniersFilms);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return mapping.findForward("VueListeDerniersFilms");
		
	}
}
