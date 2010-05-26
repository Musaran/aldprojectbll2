package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;
import metier.Recompense;
import metier.RecompensePersonne;
import metier.TypeRecompensePersonne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormAjoutRecompensePersonne;
import dao.DAOPersonne;
import dao.DAORecompense;
import dao.DAORecompensePersonne;
import dao.DAOTypeRecompensePersonne;

public class ActionAjoutRecompensePersonne extends Action{
	private DAOPersonne daoPersonne=null;
	private DAORecompense daoRecompense=null;
	private DAOTypeRecompensePersonne daoTypeRecompense=null;
	private DAORecompensePersonne daoRecompensePersonne=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormAjoutRecompensePersonne formAjout=(ActionFormAjoutRecompensePersonne)form;
		Personne personne=null;
		Recompense recompense=null;
		TypeRecompensePersonne typeRecompense=null;
		try {
			personne=daoPersonne.get(formAjout.getIdPersonne());
			recompense=daoRecompense.get(formAjout.getCodeRecompense());
			typeRecompense=daoTypeRecompense.get(formAjout.getCodeTypeRecompense());
			daoRecompensePersonne.save(new RecompensePersonne(personne, recompense, typeRecompense, formAjout.getAnnee()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("AjoutRecompensePersonneEffectue");
		
	}


	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}


	public DAORecompense getDaoRecompense() {
		return daoRecompense;
	}


	public void setDaoRecompense(DAORecompense daoRecompense) {
		this.daoRecompense = daoRecompense;
	}


	public DAOTypeRecompensePersonne getDaoTypeRecompense() {
		return daoTypeRecompense;
	}


	public void setDaoTypeRecompense(DAOTypeRecompensePersonne daoTypeRecompense) {
		this.daoTypeRecompense = daoTypeRecompense;
	}


	public DAORecompensePersonne getDaoRecompensePersonne() {
		return daoRecompensePersonne;
	}


	public void setDaoRecompensePersonne(DAORecompensePersonne daoRecompensePersonne) {
		this.daoRecompensePersonne = daoRecompensePersonne;
	}


}
