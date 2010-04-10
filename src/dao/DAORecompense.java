package dao;

import java.util.ArrayList;
import java.util.Set;

import metier.Recompense;
/**
 * 
 * @author Matthieu
 * DAO de Recompense.   
 *
 */
public interface DAORecompense {

	Recompense			get(int id)						throws Exception;
	/// liste des Recompense ayant pour titre le paramètre donné
	ArrayList<Recompense>		load(String nomRecompense)			throws Exception;
	/// liste de toutes les Recompenses 
	ArrayList<Recompense>		loadAll()							throws Exception;
	void				save(Recompense recompense)			throws Exception;
	void				saveOrUpdate(Recompense recompense)	throws Exception;
	void				remove(Recompense recompense)		throws Exception;
	void 				clear()								throws Exception;
}
