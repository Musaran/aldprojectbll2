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

	TypeRecompenseFilm		get(int id)												throws Exception;
	/// liste de toutes les RecompenseFilms 
	Set<TypeRecompenseFilm>	loadAll()													throws Exception;
	void						save(TypeRecompenseFilm typeRecompenseFilm)			throws Exception;
	void						saveOrUpdate(TypeRecompenseFilm typeRecompenseFilm)	throws Exception;
	void						remove(TypeRecompenseFilm typeRecompenseFilm)		throws Exception;
	void 						clear()														throws Exception;
}
