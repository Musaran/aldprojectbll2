package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Professionnel;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormConnexion;

import dao.DAOProfessionnel;

public class ActionConnexion extends Action{
	private DAOProfessionnel daoPro=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormConnexion connexion=(ActionFormConnexion)form;
		try {
			Professionnel pro=daoPro.get(connexion.getLogin());
			HttpSession session=request.getSession(true);
			session.setAttribute("login", pro.getLogin());
			//request.setAttribute("SESSION", pro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapping.findForward("ConnexionEffectue");
		
	}

	public DAOProfessionnel getDaoPro() {
		return daoPro;
	}

	public void setDaoPro(DAOProfessionnel daoPro) {
		this.daoPro = daoPro;
	}
}
