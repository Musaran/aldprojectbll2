package dao.hibernate;

import java.util.ArrayList;

import metier.Recompense;

import org.hibernate.Session;

import dao.DAORecompense;

public class DAOHibernateRecompense extends DAOHibernate implements DAORecompense {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE Recompense").executeUpdate();
		close(session);	
	}

	@Override
	public Recompense get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Recompense f=(Recompense) session.get(Recompense.class, id);
		close(session);	
		return f;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Recompense> load(String nomRecompense) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Recompense> liste=(ArrayList<Recompense>) session.createQuery(
				"FROM Recompense as rec WHERE rec.nomRecompense " +
				"LIKE '%"+nomRecompense+"%'").list();
		close(session);	
		return liste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Recompense>loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Recompense>  set=(ArrayList<Recompense> ) session.createQuery(
				"FROM Recompense").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(recompense);	
		close(session);	
	}

	@Override
	public void save(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(recompense);
		close(session);		
	}

	@Override
	public void saveOrUpdate(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(recompense);
		close(session);
	}

}
