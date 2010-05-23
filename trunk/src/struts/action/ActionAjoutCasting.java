package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;
import metier.RoleActeur;
import metier.RoleProducteur;
import metier.RoleRealisateur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormAjoutCasting;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAORoleActeur;
import dao.DAORoleProducteur;
import dao.DAORoleRealisateur;

public class ActionAjoutCasting extends Action{
	private DAOFilm daoFilm=null;
	private DAOPersonne daoPersonne=null;
	private DAORoleActeur daoActeur=null;
	private DAORoleProducteur daoProducteur=null;
	private DAORoleRealisateur daoRealisateur=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormAjoutCasting formAjout=(ActionFormAjoutCasting)form;
		
		Film film=null;
		Personne personne=null;
		String role=formAjout.getRole();
		try {
			film=daoFilm.get(formAjout.getIdFilm());
			personne=daoPersonne.get(formAjout.getCodePersonne());
			System.out.println(role+" "+film.getTitre()+" "+personne.getNom());
			if(role.equals("acteur"))
			{
				daoActeur.save(new RoleActeur(personne,film,0));
			}
			else if(role.equals("producteur"))
			{
				daoProducteur.save(new RoleProducteur(personne,film,0));
			}else if(role.equals("realisateur"))
			{
				daoRealisateur.save(new RoleRealisateur(personne,film,0));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("AjoutCastingEffectue");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public DAORoleActeur getDaoActeur() {
		return daoActeur;
	}

	public void setDaoActeur(DAORoleActeur daoActeur) {
		this.daoActeur = daoActeur;
	}

	public DAORoleProducteur getDaoProducteur() {
		return daoProducteur;
	}

	public void setDaoProducteur(DAORoleProducteur daoProducteur) {
		this.daoProducteur = daoProducteur;
	}

	public DAORoleRealisateur getDaoRealisateur() {
		return daoRealisateur;
	}

	public void setDaoRealisateur(DAORoleRealisateur daoRealisateur) {
		this.daoRealisateur = daoRealisateur;
	}


}
