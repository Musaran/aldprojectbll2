package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

public class ActionFormModificationFilm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titre;
	private String dateSortie;
	private double cout;
	private String synopsis;
	private FormFile file;//nouvelle affiche à uploader
	private String affiche;//ancienne affiche
	private int idFilm;
	private String urlAffiche;
	
	public ActionFormModificationFilm(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(titre.trim().equals(""))
			erreurs.add("titre",new ActionMessage("Erreur.champ.vide","titre"));
		if(dateSortie==null)
			erreurs.add("dateSortie",new ActionMessage("Erreur.champ.vide","date de sortie"));
		if(cout==0)
			erreurs.add("cout",new ActionMessage("Erreur.champ.vide","coût"));
		if(synopsis.trim().equals(""))
			erreurs.add("synopsis",new ActionMessage("Erreur.champ.vide","synopsis"));
		return erreurs;
	}

	

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public FormFile getFile() {
		return file;
	}

	public void setFile(FormFile file) {
		this.file = file;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public int getIdFilm() {
		return idFilm;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	public String getAffiche() {
		return affiche;
	}

	public String getUrlAffiche() {
		return urlAffiche;
	}

	public void setUrlAffiche(String urlAffiche) {
		this.urlAffiche = urlAffiche;
	}

}
