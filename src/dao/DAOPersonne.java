package dao;

import java.util.ArrayList;

import metier.Personne;

/**
 * 
 * @author Matthieu
 * DAO de personne.   personne != professionel !!
 *
 */

public interface DAOPersonne {

	Personne			get(int id)					throws Exception;
	/// liste des personne ayant pour nom le param�tre donn�
	ArrayList<Personne>		load(String key)				throws Exception;
	/// liste de toutes les personnes 
	ArrayList<Personne>		loadAll()						throws Exception;
	void				save(Personne personne)			throws Exception;
	void				saveOrUpdate(Personne personne)	throws Exception;
	void				remove(Personne personne)		throws Exception;
	void 				clear()							throws Exception;
	ArrayList<Personne> loadInvalidePersonne() throws Exception;
	ArrayList<Personne> loadValidePersonne() throws Exception;
	ArrayList<Personne> loadValidePersonne(String key) throws Exception;
	
}
