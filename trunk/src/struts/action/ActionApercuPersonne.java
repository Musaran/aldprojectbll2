package struts.action;

import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;
import metier.RecompensePersonne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOPersonne;

public class ActionApercuPersonne extends Action{
	private DAOPersonne daoPersonne=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Personne personne=null;
		ArrayList<Film> acteurs=null, realisateurs=null, producteurs=null;
		Set<RecompensePersonne> recompenses;
		try {
			personne=daoPersonne.get(Integer.valueOf(request.getParameter("code")));
			acteurs=personne.listeDesFilmActeur();
			realisateurs=personne.listeDesFilmRealisateur();
			producteurs=personne.listeDesFilmProducteur();
			recompenses=personne.getListeRecompense();
			request.getSession().setAttribute("PERSONNE", personne);
			request.getSession().setAttribute("RECOMPENSES", recompenses);
			request.getSession().setAttribute("ACTEUR", acteurs);
			request.getSession().setAttribute("PRODUCTEUR",producteurs );
			request.getSession().setAttribute("REALISATEUR",realisateurs );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueApercuPersonne");
		
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	


}
