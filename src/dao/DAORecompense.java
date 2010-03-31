package dao;

import java.util.Set;

import metier.Recompense;
/**
 * 
 * @author Matthieu
 * DAO de Recompense.   
 *
 */
public interface DAORecompense {

	Recompense			get(int code)						throws Exception;
	/// liste des Recompense ayant pour titre le paramètre donné
	Set<Recompense>		load(String titre)					throws Exception;
	/// liste de toutes les Recompenses 
	Set<Recompense>		loadAll()							throws Exception;
	void				save(Recompense recompense)			throws Exception;
	void				saveOrUpdate(Recompense recompense)	throws Exception;
	void				remove(Recompense recompense)		throws Exception;
	void 				clear()								throws Exception;
}
