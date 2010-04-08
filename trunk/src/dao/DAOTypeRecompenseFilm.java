package dao;

import java.util.ArrayList;
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
	ArrayList<TypeRecompenseFilm>	loadAll()													throws Exception;
	void						save(TypeRecompenseFilm typeRecompenseFilm)			throws Exception;
	void						saveOrUpdate(TypeRecompenseFilm typeRecompenseFilm)	throws Exception;
	void						remove(TypeRecompenseFilm typeRecompenseFilm)		throws Exception;
	void 						clear()														throws Exception;
}
