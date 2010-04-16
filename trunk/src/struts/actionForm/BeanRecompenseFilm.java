package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.Film;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.TypeRecompenseFilm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanRecompenseFilm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecompenseFilm recf= null;

	public RecompenseFilm getRecompenseFilm() {
		return recf;
	}

	public int getAnnee() {
		return recf.getAnnee();
	}

	public Film getFilm() {
		return recf.getFilm();
	}

	public Recompense getRecompense() {
		return recf.getRecompense();
	}

	public TypeRecompenseFilm getTypeRecompense() {
		return recf.getTypeRecompense();
	}

	public void setAnnee(int annee) {
		recf.setAnnee(annee);
	}

	public void setFilm(Film film) {
		recf.setFilm(film);
	}

	public void setRecompense(Recompense recompense) {
		recf.setRecompense(recompense);
	}

	public void setTypeRecompense(TypeRecompenseFilm typeRecompense) {
		recf.setTypeRecompense(typeRecompense);
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getAnnee() <=0) {
			erreurs.add("Une année valide est requise", new ActionMessage("BeanRecompenseFilm.erreur.annee.requise"));
		}
		if (this.getFilm() == null || this.getFilm().equals("")) {
			erreurs.add("Un nom de film est requis", new ActionMessage("BeanRecompenseFilm.erreur.nomfilm.requis"));
		}
		if (this.getRecompense()==null || this.getRecompense().equals("")) {
			erreurs.add("Une recompense est requise", new ActionMessage("BeanRecompenseFilm.erreur.recompense.requise"));
		}
		if (this.getTypeRecompense() == null || this.getTypeRecompense().equals("")) {
			erreurs.add("Un type de recompense est requis", new ActionMessage("BeanRecompenseFilm.erreur.typerecompense.requis"));
		}
		return erreurs;
	}
	
}
