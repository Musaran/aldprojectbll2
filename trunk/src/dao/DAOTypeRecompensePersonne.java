package dao;

import java.util.Set;

import metier.TypeRecompensePersonne;
/**
 * 
 * @author Matthieu
 * DAO de TypeRecompensePersonne.   
 *
 */
public interface DAOTypeRecompensePersonne {

	TypeRecompensePersonne		get(int code)												throws Exception;
	/// liste des RecompenseFilm ayant pour titre le paramètre donné
	Set<TypeRecompensePersonne>	load(String titre)											throws Exception;
	/// liste de toutes les RecompenseFilms 
	Set<TypeRecompensePersonne>	loadAll()													throws Exception;
	void						save(TypeRecompensePersonne typeRecompensePersonne)			throws Exception;
	void						saveOrUpdate(TypeRecompensePersonne typeRecompensePersonne)	throws Exception;
	void						remove(TypeRecompensePersonne typeRecompensePersonne)		throws Exception;
	void 						clear()														throws Exception;
}
