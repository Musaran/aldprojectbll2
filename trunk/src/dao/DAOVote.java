package dao;

import java.util.Set;

import metier.Vote;
/**
 * 
 * @author Matthieu
 * DAO de vote d'un professionnel.   
 *
 */
public interface DAOVote {

	Vote			get(int code)				throws Exception;
	/// liste des Vote ayant pour titre le paramètre donné
	Set<Vote>		load(String titre)			throws Exception;
	/// liste de toutes les Votes 
	Set<Vote>		loadAll()					throws Exception;
	void			save(Vote vote)				throws Exception;
	void			saveOrUpdate(Vote vote)		throws Exception;
	void			remove(Vote vote)			throws Exception;
	void 			clear()						throws Exception;
}
