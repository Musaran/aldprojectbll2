package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormRecherche extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String keywords;
	private String type;
	
	public ActionFormRecherche(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(keywords.trim().equals(""))
			erreurs.add("keywords", new ActionMessage("Erreur.champ.vide", "Recherche"));
		
		return erreurs;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
