package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.TypeRecompensePersonne;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanTypeRecompensePersonne extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TypeRecompensePersonne TrecP = null;
	
	public TypeRecompensePersonne getTypeRecompensePersonne() {
		return TrecP;
	}

	public String getNomTypeRecompensePersonne() {
		return TrecP.getNomTypeRecompensePersonne();
	}

	public void setNomTypeRecompensePersonne(String nomTypeRecompensePersonne) {
		TrecP.setNomTypeRecompensePersonne(nomTypeRecompensePersonne);
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getNomTypeRecompensePersonne() == null || this.getNomTypeRecompensePersonne().trim().equals("")) {
			erreurs.add("Le nom de la recompense est requis", new ActionMessage("BeanTypeRecompensePersonne.erreur.nom.requis"));
		}
		
		return erreurs;
	}

}
