package struts.actionForm;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormModificationFilm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titre;
	private String dateSortie;
	private double cout;
	private String synopsis;
	private String file;
	private int idFilm;
	
	public ActionFormModificationFilm(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(titre.trim().equals(""))
			erreurs.add("login",new ActionMessage("Erreur.champ.vide","titre"));
		if(dateSortie==null)
			erreurs.add("nom",new ActionMessage("Erreur.champ.vide","date de sortie"));
		if(cout==0)
			erreurs.add("prenom",new ActionMessage("Erreur.champ.vide","co�t"));
		if(synopsis.trim().equals(""))
			erreurs.add("adresse",new ActionMessage("Erreur.champ.vide","synopsis"));
		return erreurs;
	}

	

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
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

}
