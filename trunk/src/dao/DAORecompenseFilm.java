package dao;

import java.util.Set;

import metier.RecompenseFilm;
/**
 * 
 * @author Matthieu
 * DAO de RecompenseFilm.   
 *
 */
public interface DAORecompenseFilm {

	//RecompenseFilm			get(int code)								throws Exception;

	/// liste de toutes les RecompenseFilms 
	Set<RecompenseFilm>		loadAll()									throws Exception;
	void					save(RecompenseFilm recompenseFilm)			throws Exception;
	void					saveOrUpdate(RecompenseFilm recompenseFilm)	throws Exception;
	void					remove(RecompenseFilm recompenseFilm)		throws Exception;
	void 					clear()										throws Exception;
}
