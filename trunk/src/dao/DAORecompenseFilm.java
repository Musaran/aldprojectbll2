package dao;

import java.util.Set;

import metier.Film;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.TypeRecompenseFilm;
/**
 * 
 * @author Matthieu
 * DAO de RecompenseFilm.   
 *
 */
public interface DAORecompenseFilm {

	RecompenseFilm			get(Film film, Recompense recompense,
			TypeRecompenseFilm typeRecompense, int annee)				throws Exception;

	/// liste de toutes les RecompenseFilms 
	Set<RecompenseFilm>		loadAll()									throws Exception;
	void					save(RecompenseFilm recompenseFilm)			throws Exception;
	void					saveOrUpdate(RecompenseFilm recompenseFilm)	throws Exception;
	void					remove(RecompenseFilm recompenseFilm)		throws Exception;
	void 					clear()										throws Exception;
}
