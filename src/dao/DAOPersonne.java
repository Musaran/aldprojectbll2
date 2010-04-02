package dao;

import java.util.ArrayList;
import java.util.Set;

import metier.Personne;

/**
 * 
 * @author Matthieu
 * DAO de personne.   personne != professionel !!
 *
 */

public interface DAOPersonne {

	Personne			get(int id)					throws Exception;
	/// liste des personne ayant pour nom le paramètre donné
	ArrayList<Personne>		load(String key)				throws Exception;
	/// liste de toutes les personnes 
	ArrayList<Personne>		loadAll()						throws Exception;
	void				save(Personne personne)			throws Exception;
	void				saveOrUpdate(Personne personne)	throws Exception;
	void				remove(Personne personne)		throws Exception;
	void 				remove(int idfilm) 				throws Exception;
	void 				clear()							throws Exception;
	
}
