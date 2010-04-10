package dao;

import java.util.ArrayList;
import metier.Professionnel;

/**
 * 
 * @author Matthieu
 * DAO de Professionnel.
 *
 */

public interface DAOProfessionnel {

	Professionnel		get(int id)								throws Exception;
	/// liste des Professionnel ayant pour nom le param�tre donn�
	ArrayList<Professionnel>	load(String nom)							throws Exception;
	/// liste de toutes les Professionnels 
	ArrayList<Professionnel>	loadAll()									throws Exception;
	void				save(Professionnel professionnel)			throws Exception;
	void				saveOrUpdate(Professionnel professionnel)	throws Exception;
	void				remove(Professionnel professionnel)			throws Exception;
	void 				clear()										throws Exception;
}