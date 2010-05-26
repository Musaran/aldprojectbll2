package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormAjoutRecompensePersonne extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int annee;
	private int codeRecompense;
	private int codeTypeRecompense;
	private int idPersonne;
	
	public ActionFormAjoutRecompensePersonne(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors erreurs=new ActionErrors();
		if(annee==0)
			erreurs.add("annee",new ActionMessage("Erreur.champ.vide","annee"));
		return erreurs;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getCodeRecompense() {
		return codeRecompense;
	}

	public void setCodeRecompense(int codeRecompense) {
		this.codeRecompense = codeRecompense;
	}

	public int getCodeTypeRecompense() {
		return codeTypeRecompense;
	}

	public void setCodeTypeRecompense(int codeTypeRecompense) {
		this.codeTypeRecompense = codeTypeRecompense;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}


}
