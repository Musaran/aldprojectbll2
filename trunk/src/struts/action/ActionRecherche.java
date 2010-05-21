package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormRecherche;
import dao.DAOFilm;
import dao.DAOPersonne;

public class ActionRecherche extends Action{
	private DAOFilm daoFilm=null;
	private DAOPersonne daoPersonne=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormRecherche recherche=(ActionFormRecherche)form;
		ArrayList<Film> films = null;
		ArrayList<Personne> personnes = null;
		try {
			System.out.println(recherche.getType());
			if(recherche.getType().equals("personne"))
			{
				personnes = daoPersonne.loadValidePersonne(recherche.getKeywords());
				request.getSession().setAttribute("RECHERCHEPERSONNE", personnes);
				request.getSession().removeAttribute("RECHERCHEFILM");
			}
			else if(recherche.getType().equals("film"))
			{
				films = daoFilm.loadFilmValide(recherche.getKeywords());
				request.getSession().setAttribute("RECHERCHEFILM", films);
				request.getSession().removeAttribute("RECHERCHEPERSONNE");
			}
			else if(recherche.getType().equals("tous"))
			{
				personnes = daoPersonne.load(recherche.getKeywords());
				request.getSession().setAttribute("RECHERCHEPERSONNE", personnes);
				films = daoFilm.loadFilmValide(recherche.getKeywords());
				request.getSession().setAttribute("RECHERCHEFILM", films);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueListeRecherche");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}
}
