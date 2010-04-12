package dao.hibernate;

import java.util.ArrayList;

import metier.Film;
import metier.Professionnel;
import metier.Vote;

import org.hibernate.Session;

import dao.DAOVote;

public class DAOHibernateVote extends DAOHibernate implements DAOVote {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE Vote").executeUpdate();
		close(session);	
		
	}

	@Override
	public Vote get(Film film, Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Vote f=(Vote) session.createQuery("from Vote as vote where vote.film = '"+film.getIdFilm()+"' and vote.professionnel = '"+professionnel.getLogin()+"'").uniqueResult();
		close(session);	
		return f;
	}


	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Vote> loadAll() throws Exception {
		Session	session = connect();
		ArrayList<Vote> set=(ArrayList<Vote>) session.createQuery("FROM Vote").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		if(vote !=null)
			session.save(vote);
		close(session);
		
	}

	@Override
	public void saveOrUpdate(Vote vote) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
