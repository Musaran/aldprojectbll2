package dao;

import java.util.Set;

import metier.Personne;

/**
 * 
 * @author Matthieu
 * DAO de personne.   personne != professionel !!
 *
 */

public interface DAOPersonne {

	Personne			get(int code)					throws Exception;
	/// liste des personne ayant pour nom le paramètre donné
	Set<Personne>		load(String nom)				throws Exception;
	/// liste de toutes les personnes 
	Set<Personne>		loadAll()						throws Exception;
	void				save(Personne personne)			throws Exception;
	void				saveOrUpdate(Personne personne)	throws Exception;
	void				remove(Personne personne)		throws Exception;
	void 				clear()							throws Exception;
}
