package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import dao.DAOProfessionnel;

public class ActionFormInscription extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String adresse;
	private String confpass;
	
	public ActionFormInscription(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(login.trim().equals(""))
			erreurs.add("login",new ActionMessage("Erreur.champ.vide","login"));
		if(nom.trim().equals(""))
			erreurs.add("nom",new ActionMessage("Erreur.champ.vide","nom"));
		if(prenom.trim().equals(""))
			erreurs.add("prenom",new ActionMessage("Erreur.champ.vide","prenom"));
		if(adresse.trim().equals(""))
			erreurs.add("adresse",new ActionMessage("Erreur.champ.vide","adresse"));
		if(password.trim().equals(""))
			erreurs.add("password",new ActionMessage("Erreur.champ.vide","password"));
		else if(!password.equals(confpass))
			erreurs.add("confirmation mot de passe",new ActionMessage("Erreur.champ.incorrect","confirmation mot de passe"));
		
		return erreurs;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getConfpass() {
		return confpass;
	}

	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}
	
	



}
