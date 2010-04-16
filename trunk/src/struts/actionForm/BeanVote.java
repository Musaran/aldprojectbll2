package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.Film;
import metier.Professionnel;
import metier.Vote;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanVote extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Vote v = null;
	
	public Vote getVote() {
		return v;
	}

	public Film getFilm() {
		return v.getFilm();
	}

	public int getNote() {
		return v.getNote();
	}

	public Professionnel getProfessionnel() {
		return v.getProfessionnel();
	}

	public void setFilm(Film film) {
		v.setFilm(film);
	}

	public void setNote(int note) {
		v.setNote(note);
	}

	public void setProfessionnel(Professionnel professionel) {
		v.setProfessionnel(professionel);
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getFilm() == null || this.getFilm().equals("")) {
			erreurs.add("Un film est requis pour etre voté", new ActionMessage("BeanVote.erreur.film.requis"));
		}
		if (this.getNote() <=0 /* || >=? */) {
			erreurs.add("Une note est requise", new ActionMessage("BeanVote.erreur.note.requise"));
		}
		if (this.getProfessionnel() == null || this.getProfessionnel().equals("")) {
			erreurs.add("Un professionnel est requis pour voter", new ActionMessage("BeanVote.erreur.professionnel.requis"));
		}
		return erreurs;
	}
}
