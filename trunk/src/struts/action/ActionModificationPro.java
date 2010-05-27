package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Professionnel;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormInscription;
import dao.DAOProfessionnel;

public class ActionModificationPro extends Action{
	private DAOProfessionnel daoPro=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormInscription formPro=(ActionFormInscription)form;
		try {
			Professionnel pro=daoPro.get((String)request.getSession().getAttribute("login"));
			pro.setAdresse(formPro.getAdresse());
			pro.setNom(formPro.getNom());
			pro.setPassword(formPro.getPassword());
			pro.setPrenom(formPro.getPrenom());
			//update dans Bdd
			daoPro.update(pro);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("ModificationProEffectue");
		
	}

	public DAOProfessionnel getDaoPro() {
		return daoPro;
	}

	public void setDaoPro(DAOProfessionnel daoPro) {
		this.daoPro = daoPro;
	}
}
