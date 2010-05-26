package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Professionnel;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOProfessionnel;

public class ActionLienEspacePro extends Action{
	private DAOProfessionnel daoPro=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		Professionnel pro=null;
		try {
			pro=daoPro.get((String)request.getSession().getAttribute("login"));
			request.getSession().setAttribute("PRO", pro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("VueEspacePro");
		
	}

	public DAOProfessionnel getDaoPro() {
		return daoPro;
	}

	public void setDaoPro(DAOProfessionnel daoPro) {
		this.daoPro = daoPro;
	}
}
