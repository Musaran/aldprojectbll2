package dao;

import java.util.Set;

import metier.Professionnel;

/**
 * 
 * @author Matthieu
 * DAO de Professionnel.
 *
 */

public interface DAOProfessionnel {

	Professionnel		get(int id)								throws Exception;
	/// liste des Professionnel ayant pour nom le paramètre donné
	Set<Professionnel>	load(String nom)							throws Exception;
	/// liste de toutes les Professionnels 
	Set<Professionnel>	loadAll()									throws Exception;
	void				save(Professionnel professionnel)			throws Exception;
	void				saveOrUpdate(Professionnel professionnel)	throws Exception;
	void				remove(Professionnel professionnel)			throws Exception;
	void 				clear()										throws Exception;
}