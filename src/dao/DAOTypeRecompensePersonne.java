package dao;

import java.util.ArrayList;
import java.util.Set;

import metier.TypeRecompensePersonne;
/**
 * 
 * @author Matthieu
 * DAO de TypeRecompensePersonne.   
 *
 */
public interface DAOTypeRecompensePersonne {

	TypeRecompensePersonne		get(int id)													throws Exception;
	/// liste de toutes les RecompenseFilms 
	ArrayList<TypeRecompensePersonne>	loadAll()													throws Exception;
	void						save(TypeRecompensePersonne typeRecompensePersonne)			throws Exception;
	void						saveOrUpdate(TypeRecompensePersonne typeRecompensePersonne)	throws Exception;
	void						remove(TypeRecompensePersonne typeRecompensePersonne)		throws Exception;
	void 						clear()														throws Exception;
}
