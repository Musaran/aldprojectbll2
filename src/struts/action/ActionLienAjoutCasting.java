package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOFilm;
import dao.DAOPersonne;

public class ActionLienAjoutCasting extends Action{
	private DAOFilm daoFilm=null;
	private DAOPersonne daoPersonne=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Film film=null;
		ArrayList<Personne> personnes=null;
		try {
			film=daoFilm.get(Integer.valueOf(request.getParameter("code")));
			request.getSession().setAttribute("FILM", film);
			personnes=daoPersonne.loadValidePersonne();
			request.getSession().setAttribute("LISTEPERSONNES", personnes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueAjoutCasting");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}


}
