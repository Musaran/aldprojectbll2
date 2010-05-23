package struts.action;

import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;
import metier.RecompenseFilm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOFilm;

public class ActionApercuFilm extends Action{
	private DAOFilm daoFilm=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Film film=null;
		ArrayList<Personne> acteurs=null, realisateurs=null, producteurs=null;
		Set<RecompenseFilm> recompenses;
		try {
			film=daoFilm.get(Integer.valueOf(request.getParameter("code")));
			acteurs=film.listeDesActeurs();
			realisateurs=film.listeDesRealisateurs();
			producteurs=film.listeDesProducteurs();
			recompenses=film.getListeRecompense();
			request.getSession().setAttribute("FILM", film);
			request.getSession().setAttribute("RECOMPENSES", recompenses);
			request.getSession().setAttribute("ACTEURS", acteurs);
			request.getSession().setAttribute("PRODUCTEURS",producteurs );
			request.getSession().setAttribute("REALISATEURS",realisateurs );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueApercuFilm");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}


}
