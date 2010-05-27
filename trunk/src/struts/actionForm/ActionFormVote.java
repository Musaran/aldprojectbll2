package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormVote extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String note="";
	private int codeFilm;
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		 
		try{
			int chiffre=Integer.parseInt(note);
		 if(chiffre<0 || chiffre >10)
			erreurs.add("note", new ActionMessage("Erreur.champ.incorrect", "Note"));
		}catch(Exception e)
		{
			erreurs.add("note", new ActionMessage("Erreur.champ.incorrect", "Note"));
		}
		return erreurs;
	}
	
	
	
	


	public int getCodeFilm() {
		return codeFilm;
	}

	public void setCodeFilm(int codeFilm) {
		this.codeFilm = codeFilm;
	}

	public ActionFormVote() {
		super();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
