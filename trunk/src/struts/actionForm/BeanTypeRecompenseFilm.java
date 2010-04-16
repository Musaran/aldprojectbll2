package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.TypeRecompenseFilm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanTypeRecompenseFilm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TypeRecompenseFilm TrecF = null;
	
	public TypeRecompenseFilm getTypeRecompenseFilm() {
		return TrecF;
	}

	public String getNomTypeRecompenseFilm() {
		return TrecF.getNomTypeRecompenseFilm();
	}

	public void setNomTypeRecompenseFilm(String nomTypeRecompenseFilm) {
		TrecF.setNomTypeRecompenseFilm(nomTypeRecompenseFilm);
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getNomTypeRecompenseFilm() == null || this.getNomTypeRecompenseFilm().trim().equals("")) {
			erreurs.add("Le nom de la recompense est requis", new ActionMessage("BeanTypeRecompenseFilm.erreur.nom.requis"));
		}
		
		return erreurs;
	}

}
