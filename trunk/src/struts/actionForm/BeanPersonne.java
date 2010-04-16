package struts.actionForm;

import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import metier.Personne;
import metier.RecompensePersonne;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BeanPersonne extends ActionForm{

	
	private static final long serialVersionUID = 1L;
	private Personne p = null;
	
	public Personne getPersonne() {
		return p;
	}

	public String getBiographie() {
		return p.getBiographie();
	}

	public Date getDateDeNaissance() {
		return p.getDateDeNaissance();
	}

	public Set<RecompensePersonne> getListeRecompense() {
		return p.getListeRecompense();
	}

	public String getNom() {
		return p.getNom();
	}

	public String getPhoto() {
		return p.getPhoto();
	}

	public String getPrenom() {
		return p.getPrenom();
	}

	public void setBiographie(String biographie) {
		p.setBiographie(biographie);
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		p.setDateDeNaissance(dateDeNaissance);
	}

	public void setNom(String nom) {
		p.setNom(nom);
	}

	public void setPhoto(String photo) {
		p.setPhoto(photo);
	}

	public void setPrenom(String prenom) {
		p.setPrenom(prenom);
	}
	

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors erreurs = new ActionErrors();

		if (this.getBiographie() == null || this.getBiographie().trim().equals("")) {
			erreurs.add("Une biographie de la personne est requise", new ActionMessage("BeanPersonne.erreur.biographie.requise"));
		}
		if (this.getDateDeNaissance() == null || this.getDateDeNaissance().equals("")) {
			erreurs.add("Une date de naissance est requise", new ActionMessage("BeanPersonne.erreur.date.requise"));
		}
		if (this.getNom() == null || this.getNom().trim().equals("")) {
			erreurs.add("Un nom est requis", new ActionMessage("BeanPersonne.erreur.nom.requis"));
		}
		if (this.getPrenom() == null || this.getPrenom().trim().equals("")) {
			erreurs.add("Un prenom est requis", new ActionMessage("BeanPersonne.erreur.prenom.requis"));
		}
		if (this.getPhoto() == null || this.getPhoto().trim().equals("")) {
			erreurs.add("Une photo est requise", new ActionMessage("BeanPersonne.erreur.photo.requise"));
		}
		return erreurs;
	}
	
}
