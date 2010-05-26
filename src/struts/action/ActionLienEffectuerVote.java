package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Professionnel;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOProfessionnel;
import dao.DAOVote;

public class ActionLienEffectuerVote extends Action {
	private DAOVote DAOVote;
	private DAOProfessionnel DAOProfessionnel;
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		
		if(request.getSession().getAttribute("login") !=	 null)
		{
			
			try
			{
				String log = (String) request.getSession().getAttribute("login");
				System.out.println(log);
				Professionnel pro = DAOProfessionnel.get(log);
				System.out.println(pro);
				ArrayList<Film> liste = DAOVote.loadFilmNonVote(pro);
				request.getSession().setAttribute("FILM_A_VOTER", liste);
			}
			catch (Exception e)
			{
				return mapping.findForward("ErreurServeur");
			}
		}else
		{
			return mapping.findForward("ErreurServeur");
		}
		
		
		 return mapping.findForward("FormVote");
	}


	public DAOVote getDAOVote() {
		return DAOVote;
	}


	public void setDAOVote(DAOVote dAOVote) {
		DAOVote = dAOVote;
	}


	public DAOProfessionnel getDAOProfessionnel() {
		return DAOProfessionnel;
	}


	public void setDAOProfessionnel(DAOProfessionnel dAOProfessionnel) {
		DAOProfessionnel = dAOProfessionnel;
	}
	
	

	
	
	

}
