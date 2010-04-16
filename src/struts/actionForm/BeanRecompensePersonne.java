package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.Personne;
import metier.Recompense;
import metier.RecompensePersonne;
import metier.TypeRecompensePersonne;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanRecompensePersonne extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecompensePersonne recp = null;
	
	public RecompensePersonne getRecompensePersonne() {
		return recp;
	}

	public int getAnnee() {
		return recp.getAnnee();
	}

	public Personne getPersonne() {
		return recp.getPersonne();
	}

	public Recompense getRecompense() {
		return recp.getRecompense();
	}

	public TypeRecompensePersonne getTypeRecompense() {
		return recp.getTypeRecompense();
	}

	public void setAnnee(int annee) {
		recp.setAnnee(annee);
	}

	public void setPersonne(Personne personne) {
		recp.setPersonne(personne);
	}

	public void setRecompense(Recompense recompense) {
		recp.setRecompense(recompense);
	}

	public void setTypeRecompense(TypeRecompensePersonne typeRecompense) {
		recp.setTypeRecompense(typeRecompense);
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getAnnee() <=0) {
			erreurs.add("Une année valide est requise", new ActionMessage("BeanRecompensePersonne.erreur.annee.requise"));
		}
		if (this.getPersonne() == null || this.getPersonne().equals("")) {
			erreurs.add("Une personne est requise", new ActionMessage("BeanRecompensePersonne.erreur.personne.requise"));
		}
		if (this.getRecompense()==null || this.getRecompense().equals("")) {
			erreurs.add("Une recompense est requise", new ActionMessage("BeanRecompensePersonne.erreur.recompense.requise"));
		}
		if (this.getTypeRecompense() == null || this.getTypeRecompense().equals("")) {
			erreurs.add("Un type de recompense est requis", new ActionMessage("BeanRecompensePersonne.erreur.typerecompense.requis"));
		}
		return erreurs;
	}
}
