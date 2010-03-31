package dao;

import java.util.Set;

import metier.TypeRecompenseFilm;
/**
 * 
 * @author Matthieu
 * DAO de TypeRecompenseFilm.   
 *
 */
public interface DAOTypeRecompenseFilm {

	TypeRecompenseFilm		get(int code)												throws Exception;
	/// liste des RecompenseFilm ayant pour titre le paramètre donné
	Set<TypeRecompenseFilm>	load(String titre)											throws Exception;
	/// liste de toutes les RecompenseFilms 
	Set<TypeRecompenseFilm>	loadAll()													throws Exception;
	void						save(TypeRecompenseFilm typeRecompenseFilm)			throws Exception;
	void						saveOrUpdate(TypeRecompenseFilm typeRecompenseFilm)	throws Exception;
	void						remove(TypeRecompenseFilm typeRecompenseFilm)		throws Exception;
	void 						clear()														throws Exception;
}
