package dao;

import java.util.ArrayList;

import metier.Film;
import metier.Professionnel;

/**
 * 
 * @author Matthieu
 * DAO de Professionnel.
 *
 */

public interface DAOProfessionnel {

	Professionnel	get(String nom)							throws Exception;
	/// liste de toutes les Professionnels 
	ArrayList<Professionnel>	loadAll()									throws Exception;
	void				save(Professionnel professionnel)			throws Exception;
	void				saveOrUpdate(Professionnel professionnel)	throws Exception;
	void				remove(Professionnel professionnel)			throws Exception;
	void 				clear()										throws Exception;
}