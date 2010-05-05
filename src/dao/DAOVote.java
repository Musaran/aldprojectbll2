package dao;

import java.util.ArrayList;

import metier.Film;
import metier.Professionnel;
import metier.Vote;
/**
 * 
 * @author Matthieu
 * DAO de vote d'un professionnel.   
 *
 */
public interface DAOVote {

	Vote			get(Film film, Professionnel professionnel)	throws Exception;
	/// liste des Votes pour un Film
	ArrayList<Vote>		loadFilmVote(Film film)					throws Exception;
	/// liste des Votes d'un professionnel
	ArrayList<Vote>		loadProVote(Professionnel professionnel)throws Exception;
	/// liste de toutes les Votes 
	ArrayList<Vote>		loadAll()								throws Exception;
	void			save(Vote vote)								throws Exception;
	void			saveOrUpdate(Vote vote)						throws Exception;
	void			remove(Vote vote)							throws Exception;
	void 			clear()										throws Exception;
	ArrayList<Film> loadFilmNonVote(Professionnel p)throws Exception;
}
