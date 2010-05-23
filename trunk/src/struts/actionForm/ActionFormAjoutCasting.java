package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ActionFormAjoutCasting extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String role;
	private int codePersonne;//ancienne affiche
	private int idFilm;
	
	public ActionFormAjoutCasting(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		return erreurs;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCodePersonne() {
		return codePersonne;
	}

	public void setCodePersonne(int codePersonne) {
		this.codePersonne = codePersonne;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public int getIdFilm() {
		return idFilm;
	}


}
