package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOPersonne;

public class ActionLienModificationPersonne extends Action{
	private DAOPersonne daoPersonne=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Personne personne=null;
		try {
			personne=daoPersonne.get(Integer.valueOf(request.getParameter("code")));
			request.getSession().setAttribute("PERSONNE", personne);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueModificationPersonne");
		
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}



}
