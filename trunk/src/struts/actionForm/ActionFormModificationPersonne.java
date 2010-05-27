package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

public class ActionFormModificationPersonne extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String biographie;
	private FormFile file;//nouvelle affiche à uploader
	private String photo;//ancienne affiche
	private int idPersonne;
	
	public ActionFormModificationPersonne(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		
		if(nom.trim().equals(""))
			erreurs.add("nom",new ActionMessage("Erreur.champ.vide","nom"));
		else if(!nom.matches("^([a-zA-Z]| |-)+$"))
			erreurs.add("nom",new ActionMessage("Erreur.champ.incorrect","nom"));
		
		if(prenom.trim().equals(""))
			erreurs.add("prenom",new ActionMessage("Erreur.champ.vide","prenom"));
		else if(!prenom.matches("^([a-zA-Z]| |-)+$"))
			erreurs.add("prenom",new ActionMessage("Erreur.champ.incorrect","prenom"));
		
		if(dateDeNaissance.trim().equals(""))
			erreurs.add("date naissance",new ActionMessage("Erreur.champ.vide","date naissance"));
		else if(!dateDeNaissance.matches("([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|30|31)"))
			erreurs.add("dateDeNaissance",new ActionMessage("Erreur.champ.incorrect","date naissance"));
		
		if(biographie.trim().equals(""))
			erreurs.add("biographie",new ActionMessage("Erreur.champ.vide","biographie"));
		return erreurs;
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

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getBiographie() {
		return biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	public FormFile getFile() {
		return file;
	}

	public void setFile(FormFile file) {
		this.file = file;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
}
