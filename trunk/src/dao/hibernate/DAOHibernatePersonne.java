package dao.hibernate;

import java.util.Set;

import org.hibernate.Session;

import metier.Personne;
import dao.DAOPersonne;

public class DAOHibernatePersonne extends DAOHibernate implements DAOPersonne {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personne get(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Personne> load(String nom) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Personne> loadAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		Session session =  connect();
		session.save(personne);
		close(session);
		
		
	}

	@Override
	public void saveOrUpdate(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(personne);
		close(session);
		
	}

}
