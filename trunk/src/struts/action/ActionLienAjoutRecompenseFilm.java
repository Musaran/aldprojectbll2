package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Recompense;
import metier.TypeRecompenseFilm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOFilm;
import dao.DAORecompense;
import dao.DAOTypeRecompenseFilm;

public class ActionLienAjoutRecompenseFilm extends Action{
	private DAOFilm daoFilm=null;
	private DAORecompense daoRecompense=null;
	private DAOTypeRecompenseFilm daoTypeRecompense=null;
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Film film=null;
		ArrayList<Recompense> recompenses=null;
		ArrayList<TypeRecompenseFilm> typeRecompenses=null;
		try {
			film=daoFilm.get(Integer.valueOf(request.getParameter("code")));
			recompenses=daoRecompense.loadAll();
			typeRecompenses=daoTypeRecompense.loadAll();
			request.getSession().setAttribute("FILM", film);
			request.getSession().setAttribute("RECOMPENSES", recompenses);
			request.getSession().setAttribute("TYPERECOMPENSES", typeRecompenses);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueAjoutRecompenseFilm");
		
	}

	public DAOFilm getDaoFilm() {
		return daoFilm;
	}

	public void setDaoFilm(DAOFilm daoFilm) {
		this.daoFilm = daoFilm;
	}

	public DAORecompense getDaoRecompense() {
		return daoRecompense;
	}

	public void setDaoRecompense(DAORecompense daoRecompense) {
		this.daoRecompense = daoRecompense;
	}

	public DAOTypeRecompenseFilm getDaoTypeRecompense() {
		return daoTypeRecompense;
	}

	public void setDaoTypeRecompense(DAOTypeRecompenseFilm daoTypeRecompense) {
		this.daoTypeRecompense = daoTypeRecompense;
	}




}
