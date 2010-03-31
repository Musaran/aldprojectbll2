package dao;

import java.util.Set;

import metier.RecompensePersonne;
/**
 * 
 * @author Matthieu
 * DAO de RecompensePersonne.   
 *
 */
public interface DAORecompensePersonne {

	//RecompensePersonne			get(int code)										throws Exception;
	/// liste de toutes les RecompensePersonne
	Set<RecompensePersonne>		loadAll()											throws Exception;
	void						save(RecompensePersonne recompensePersonne)			throws Exception;
	void						saveOrUpdate(RecompensePersonne recompensePersonne)	throws Exception;
	void						remove(RecompensePersonne recompensePersonne)		throws Exception;
	void 						clear()												throws Exception;
}
