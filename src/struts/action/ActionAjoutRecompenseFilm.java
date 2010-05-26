package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.TypeRecompenseFilm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionForm.ActionFormAjoutRecompenseFilm;
import dao.DAOFilm;
import dao.DAORecompense;
import dao.DAORecompenseFilm;
import dao.DAOTypeRecompenseFilm;

public class ActionAjoutRecompenseFilm extends Action{
	private DAOFilm daoFilm=null;
	private DAORecompense daoRecompense=null;
	private DAOTypeRecompenseFilm daoTypeRecompense=null;
	private DAORecompenseFilm daoRecompenseFilm=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
		ActionFormAjoutRecompenseFilm formAjout=(ActionFormAjoutRecompenseFilm)form;
		Film film=null;
		Recompense recompense=null;
		TypeRecompenseFilm typeRecompense=null;
		try {
			film=daoFilm.get(formAjout.getIdFilm());
			recompense=daoRecompense.get(formAjout.getCodeRecompense());
			typeRecompense=daoTypeRecompense.get(formAjout.getCodeTypeRecompense());
			daoRecompenseFilm.save(new RecompenseFilm(film, recompense, typeRecompense, formAjout.getAnnee()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("ErreurServeur");
		}
		return mapping.findForward("AjoutRecompenseFilmEffectue");
		
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

	public DAORecompenseFilm getDaoRecompenseFilm() {
		return daoRecompenseFilm;
	}

	public void setDaoRecompenseFilm(DAORecompenseFilm daoRecompenseFilm) {
		this.daoRecompenseFilm = daoRecompenseFilm;
	}


}
