package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOProfessionnel;

public class ActionDeconnexion extends Action{
	private DAOProfessionnel daoPro=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		try {
			HttpSession session=request.getSession();

				session.invalidate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("DeconnexionImpossible"); 
		}
		return mapping.findForward("DeconnexionEffectue");
		
	}

	public DAOProfessionnel getDaoPro() {
		return daoPro;
	}

	public void setDaoPro(DAOProfessionnel daoPro) {
		this.daoPro = daoPro;
	}
}
