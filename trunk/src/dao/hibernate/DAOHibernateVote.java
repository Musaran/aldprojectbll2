package dao.hibernate;

import java.util.Set;

import metier.Film;
import metier.Professionnel;
import metier.Vote;
import dao.DAOVote;

public class DAOHibernateVote extends DAOHibernate implements DAOVote {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vote get(Film film, Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Vote> loadAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
