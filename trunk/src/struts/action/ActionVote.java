package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Professionnel;
import metier.Vote;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOFilm;
import dao.DAOProfessionnel;
import dao.DAOVote;

import struts.actionForm.ActionFormVote;

public class ActionVote extends Action {
	
	private DAOFilm daofilm =null;
	private DAOProfessionnel daopro = null;
	private DAOVote daovote = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		
		if(request.getSession().getAttribute("login")!=null)
		{
			try{
			ActionFormVote formulaire = (ActionFormVote) form;
			int note = Integer.parseInt(formulaire.getNote());
			int idf = formulaire.getCodeFilm();
			Film film = daofilm.get(idf);
			Professionnel pro = daopro.get((String) request.getSession().getAttribute("login"));
			Vote v = pro.faitUnVote(film, note);
			daovote.save(v);
			film.calculNoteMoyenne(daovote.loadFilmVote(film));
			daofilm.saveOrUpdate(film);
			return mapping.findForward("VoteEffectue");
			}catch(Exception e)
			{
				return mapping.findForward("VoteImpossible");
			}
			
			
		}else
		{
		return mapping.findForward("VoteImpossible");
		}
	}

	public DAOFilm getDaofilm() {
		return daofilm;
	}

	public void setDaofilm(DAOFilm daofilm) {
		this.daofilm = daofilm;
	}

	public DAOProfessionnel getDaopro() {
		return daopro;
	}

	public void setDaopro(DAOProfessionnel daopro) {
		this.daopro = daopro;
	}

	public DAOVote getDaovote() {
		return daovote;
	}

	public void setDaovote(DAOVote daovote) {
		this.daovote = daovote;
	}

	public ActionVote() {
		super();
	}
	
	
	

}
