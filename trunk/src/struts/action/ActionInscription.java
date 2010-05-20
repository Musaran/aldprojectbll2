package struts.action;

import java.util.Date;

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

public class ActionInscription extends Action{
	private DAOProfessionnel daoPro=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormInscription formPro=(ActionFormInscription)form;
		try {
			Professionnel pro=new Professionnel(formPro.getLogin(), formPro.getPassword(), new Date(), 
					formPro.getNom(), formPro.getPrenom(), formPro.getAdresse(), new Date());
			
			//sauvegarde dans Bdd
			daoPro.save(pro);
			
			// + connexion
			HttpSession session=request.getSession();
			session.setAttribute("login", pro.getLogin());
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("InscriptionEffectue");
		
	}

	public DAOProfessionnel getDaoPro() {
		return daoPro;
	}

	public void setDaoPro(DAOProfessionnel daoPro) {
		this.daoPro = daoPro;
	}
}
