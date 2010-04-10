package dao.hibernate;

import java.util.ArrayList;
import java.util.Set;

import org.hibernate.Session;

import metier.Film;
import metier.Personne;
import dao.DAOPersonne;

public class DAOHibernatePersonne extends DAOHibernate implements DAOPersonne {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE Personne").executeUpdate();
		close(session);	
	}

	@Override
	public Personne get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Personne p=(Personne) session.get(Personne.class, id);
		close(session);	
		return p;
	}

	@Override
	public ArrayList<Personne> load(String key) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Personne> liste=(ArrayList<Personne>) session.createQuery(
				"FROM Personne as pers WHERE pers.nom LIKE '%"+key+"%'").list();	

		close(session);	
		return liste;
	}

	@Override
	public ArrayList<Personne> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Personne> set=(ArrayList<Personne>) session.createQuery(
				"FROM Personne").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(personne);	
		close(session);	
	}
	/// suppression d'un film d'après son id
	@Override
	public void remove(int idfilm) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(get(idfilm));	
		close(session);	
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
