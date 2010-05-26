package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;
import metier.Recompense;
import metier.TypeRecompensePersonne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOPersonne;
import dao.DAORecompense;
import dao.DAOTypeRecompensePersonne;

public class ActionLienAjoutRecompensePersonne extends Action{
	private DAOPersonne daoPersonne=null;
	private DAORecompense daoRecompense=null;
	private DAOTypeRecompensePersonne daoTypeRecompense=null;
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Personne personne=null;
		ArrayList<Recompense> recompenses=null;
		ArrayList<TypeRecompensePersonne> typeRecompenses=null;
		try {
			personne=daoPersonne.get(Integer.valueOf(request.getParameter("code")));
			recompenses=daoRecompense.loadAll();
			typeRecompenses=daoTypeRecompense.loadAll();
			request.getSession().setAttribute("PERSONNE", personne);
			request.getSession().setAttribute("RECOMPENSES", recompenses);
			request.getSession().setAttribute("TYPERECOMPENSES", typeRecompenses);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueAjoutRecompensePersonne");
		
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


}
