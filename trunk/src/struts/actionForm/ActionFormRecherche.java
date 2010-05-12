package struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ActionFormRecherche extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String keywords;
	
	public ActionFormRecherche(){
		
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		return null;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getKeywords() {
		return keywords;
	}
}
