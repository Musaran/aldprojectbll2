package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import metier.Professionnel;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanProfessionnel extends ActionForm{

	private Professionnel pro = null;
	
	public Professionnel getProfessionnel() {
		return pro;
	}

	public String getAdresse() {
		return pro.getAdresse();
	}

	public String getLogin() {
		return pro.getLogin();
	}

	public String getNom() {
		return pro.getNom();
	}

	public String getPrenom() {
		return pro.getPrenom();
	}

	public void setAdresse(String adresse) {
		pro.setAdresse(adresse);
	}

	public void setLogin(String login) {
		pro.setLogin(login);
	}

	public void setNom(String nom) {
		pro.setNom(nom);
	}

	public void setPrenom(String prenom) {
		pro.setPrenom(prenom);
	}
	
	public String getPassword() {
		return pro.getPassword();
	}

	public void setPassword(String password) {
		pro.setPassword(password);
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getAdresse() == null || this.getAdresse().trim().equals("")) {
			erreurs.add("L'adresse est requise", new ActionMessage("BeanProfessionnel.erreur.adresse.requise"));
		}
		if (this.getLogin() == null || this.getLogin().trim().equals("")) {
			erreurs.add("Un nom d'utilisateur est requis", new ActionMessage("BeanProfessionnel.erreur.login.requise"));
		}
		if (this.getPassword() == null || this.getPassword().trim().equals("")) {
			erreurs.add("Un mot de passe est requis", new ActionMessage("BeanProfessionnel.erreur.pass.requise"));
		}
		if (this.getNom() == null || this.getNom().trim().equals("")) {
			erreurs.add("Un nom est requis", new ActionMessage("BeanProfessionnel.erreur.nom.requis"));
		}
		if (this.getPrenom() == null || this.getPrenom().trim().equals("")) {
			erreurs.add("Un prenom est requis", new ActionMessage("BeanProfessionnel.erreur.prenom.requis"));
		}
		return erreurs;
	}
	
}
