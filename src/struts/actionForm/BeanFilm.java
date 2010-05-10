package struts.actionForm;

import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;



import metier.Film;
import metier.Personne;
import metier.RecompenseFilm;
import metier.RoleActeur;
import metier.RoleProducteur;
import metier.RoleRealisateur;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;



public class BeanFilm extends ActionForm{
	
	
	private static final long serialVersionUID = 1L;
	private Film f= null;
	
	public Film getFilm() {
		return f;
	}

	public String getAffiche() {
		return f.getAffiche();
	}

	public double getCout() {
		return f.getCout();
	}

	public Date getDateSortie() {
		return f.getDateSortie();
	}

	public int getIdFilm() {
		return f.getIdFilm();
	}

	public int getIsValidateFilm() {
		return f.getIsValidateFilm();
	}

	public Set<RecompenseFilm> getListeRecompense() {
		return f.getListeRecompense();
	}

	public int getNombreRequetes() {
		return f.getNombreRequetes();
	}

	public double getNoteMoyenne() {
		return f.getNoteMoyenne();
	}

	public String getSynopsis() {
		return f.getSynopsis();
	}

	public String getTitre() {
		return f.getTitre();
	}

	public void setAffiche(String affiche) {
		f.setAffiche(affiche);
	}

	public void setCout(double cout) {
		f.setCout(cout);
	}

	public void setDateSortie(Date dateSortie) {
		f.setDateSortie(dateSortie);
	}

	public void setIdFilm(int idFilm) {
		f.setIdFilm(idFilm);
	}

	public void setIsValidateFilm(int isValidateFilm) {
		f.setIsValidateFilm(isValidateFilm);
	}

	public Set<RoleActeur> getListDesActeurs() {
		return f.getListDesActeurs();
	}

	public Set<RoleProducteur> getListeDesProducteurs() {
		return f.getListeDesProducteurs();
	}

	public Set<RoleRealisateur> getListeDesRealisateurs() {
		return f.getListeDesRealisateurs();
	}

	public void setListDesActeurs(Set<RoleActeur> listDesActeurs) {
		f.setListDesActeurs(listDesActeurs);
	}

	public void setListeDesProducteurs(Set<RoleProducteur> listeDesProducteurs) {
		f.setListeDesProducteurs(listeDesProducteurs);
	}

	public void setListeDesRealisateurs(
			Set<RoleRealisateur> listeDesRealisateurs) {
		f.setListeDesRealisateurs(listeDesRealisateurs);
	}

	public void setListeRecompense(Set<RecompenseFilm> listeRecompense) {
		f.setListeRecompense(listeRecompense);
	}

	public void setNoteMoyenne(double noteMoyenne) {
		f.setNoteMoyenne(noteMoyenne);
	}

	public void setSynopsis(String synopsis) {
		f.setSynopsis(synopsis);
	}

	public void setTitre(String titre) {
		f.setTitre(titre);
	}
	
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		
		ActionErrors erreurs = new ActionErrors();
				
		if(this.getDateSortie()== null || this.getDateSortie().equals("")) {
			erreurs.add("Une date de sortie est requise", new ActionMessage("BeanFilm.erreur.date.requise"));			
		}
		if(this.getSynopsis()== null || this.getSynopsis().trim().equals("")) {
			erreurs.add("Une synopsis est requis", new ActionMessage("BeanFilm.erreur.synopsis.requis"));			
		}
		if(this.getTitre()== null || this.getTitre().trim().equals("")) {
			erreurs.add("Une titre est requis", new ActionMessage("BeanFilm.erreur.titre.requis"));			
		}
		if(this.getAffiche()== null || this.getAffiche().trim().equals("")) {
			erreurs.add("Une affiche de film est requise", new ActionMessage("BeanFilm.erreur.affiche.requise"));			
		}
		if(this.getCout()<= 0) {
			erreurs.add("Le cout du film est requis", new ActionMessage("BeanFilm.erreur.cout.requis"));			
		}
		
		
		return erreurs;
	}
	

}
