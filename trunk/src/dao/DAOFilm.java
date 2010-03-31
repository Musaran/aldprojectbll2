package dao;

import java.util.Set;

import metier.Film;
/**
 * 
 * @author Matthieu
 * DAO de film.   
 *
 */
public interface DAOFilm {

	Film			get(int code)				throws Exception;
	/// liste des Film ayant pour titre le paramètre donné
	Set<Film>		load(String titre)			throws Exception;
	/// liste de toutes les Films 
	Set<Film>		loadAll()					throws Exception;
	void			save(Film film)				throws Exception;
	void			saveOrUpdate(Film film)		throws Exception;
	void			remove(Film film)			throws Exception;
	void 			clear()						throws Exception;
}
