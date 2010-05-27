package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

public class ActionFormAjoutFilm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titre;
	private String dateSortie;
	private double cout;
	private String synopsis;
	private FormFile file;//nouvelle affiche à uploader
	
	public ActionFormAjoutFilm(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(titre.trim().equals(""))
			erreurs.add("titre",new ActionMessage("Erreur.champ.vide","titre"));
		
		if(dateSortie.trim().equals(""))
			erreurs.add("dateSortie",new ActionMessage("Erreur.champ.vide","date de sortie"));
		else if(!dateSortie.matches("([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|30|31)"))
			erreurs.add("dateSortie",new ActionMessage("Erreur.champ.incorrect","date de sortie"));
		
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

}
