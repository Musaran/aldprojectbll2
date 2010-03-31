package dao;

import java.util.Set;

import metier.Personne;
import metier.Recompense;
import metier.RecompensePersonne;
import metier.TypeRecompensePersonne;
/**
 * 
 * @author Matthieu
 * DAO de RecompensePersonne.   
 *
 */
public interface DAORecompensePersonne {

	RecompensePersonne			get(Personne personne, Recompense recompense,
			TypeRecompensePersonne typeRecompense, int annee)						throws Exception;
	/// liste de toutes les RecompensePersonne
	Set<RecompensePersonne>		loadAll()											throws Exception;
	void						save(RecompensePersonne recompensePersonne)			throws Exception;
	void						saveOrUpdate(RecompensePersonne recompensePersonne)	throws Exception;
	void						remove(RecompensePersonne recompensePersonne)		throws Exception;
	void 						clear()												throws Exception;
}
