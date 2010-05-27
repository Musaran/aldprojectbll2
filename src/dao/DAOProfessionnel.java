package dao;

import java.util.ArrayList;
import java.util.Date;

import metier.Professionnel;

/**
 * 
 * @author Matthieu
 * DAO de Professionnel.
 *
 */

public interface DAOProfessionnel {

	Professionnel	get(String login)										throws Exception;
	Professionnel	get(String login,String pass)						throws Exception;
	/// liste de toutes les Professionnels 
	ArrayList<Professionnel>	loadAll()									throws Exception;
	void				save(Professionnel professionnel)			throws Exception;
	void				saveOrUpdate(Professionnel professionnel)	throws Exception;
	void 				update(Professionnel professionnel) throws Exception;
	void				remove(Professionnel professionnel)			throws Exception;
	void 				clear()										throws Exception;
	ArrayList<Professionnel>	loadInactif(Date d)							throws Exception;
	ArrayList<Professionnel>	loadInscritDuMois()throws Exception;
	
}