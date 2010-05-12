package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormConnexion extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String motDePasse;
	
	public ActionFormConnexion(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		
		if(login.trim().equals(""))
			erreurs.add("login",new ActionMessage("Erreur.champ.vide","login"));
		if(motDePasse.trim().equals(""))
			erreurs.add("mot de passe",new ActionMessage("Erreur.champ.vide","mot de passe"));
		return erreurs;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

}
