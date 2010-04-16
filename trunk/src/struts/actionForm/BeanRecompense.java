package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.Recompense;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanRecompense extends ActionForm{
	
	private Recompense rec = null;

	public String getNomRecompense() {
		return rec.getNomRecompense();
	}

	public void setNomRecompense(String nomRecompense) {
		rec.setNomRecompense(nomRecompense);
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getNomRecompense() == null || this.getNomRecompense().trim().equals("")) {
			erreurs.add("Un nom de recompense est requis", new ActionMessage("BeanRecompense.erreur.nomrecompense.requis"));
		}
		return erreurs;
	}

}
