package struts.action;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RedirectingActionForward;


public class ActionChangementLangue extends Action 
{
   public ActionForward execute(ActionMapping mapping, 
                                                 ActionForm form, 
                                                 HttpServletRequest request, 
                                                 HttpServletResponse response)
      throws IOException, ServletException 
   {
      //r�cup�ration des param�tres pass�s et de l'url du referer
      String country = request.getParameter("cty");
      String language = request.getParameter("lang");
      String referer = request.getHeader("referer");
      HttpSession session = request.getSession();
      ActionForward forward = null;
   
      // d�finition de la locale
      setLocale( request, new Locale( language, country ) );

      // redirection vers une page d�finie par d�faut
      if( referer==null )
      {
         forward = (mapping.findForward("success"));
      }
      // redirection vers l'url du referrer.
      else 
      {
         forward = new RedirectingActionForward();
         forward.setPath( referer );
      }

      return forward;
   }
}

