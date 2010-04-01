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

	Film			get(int id)				throws Exception;
	/// retourne les films qui contiennent dans leur titre le mot key
	Set<Film>		load(String key)			throws Exception;
	/// liste de toutes les Films 
	Set<Film>		loadAll()					throws Exception;
	void			save(Film film)				throws Exception;
	void			saveOrUpdate(Film film)		throws Exception;
	void			remove(Film film)			throws Exception;
	void 			clear()						throws Exception;
}
