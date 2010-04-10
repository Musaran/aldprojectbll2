package dao.hibernate;

import java.util.ArrayList;

import metier.Professionnel;

import org.hibernate.Session;

import dao.DAOProfessionnel;

public class DAOHibernateProfessionnel extends DAOHibernate implements DAOProfessionnel {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE Professionnel").executeUpdate();
		close(session);	
	}

	@Override
	public Professionnel get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Professionnel p=(Professionnel) session.get(Professionnel.class, id);
		close(session);	
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Professionnel> load(String nom) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Professionnel> liste=(ArrayList<Professionnel>) session.createQuery(
				"FROM Professionnel as pro WHERE pro.nom LIKE '%"+nom+"%'").list();	

		close(session);	
		return liste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Professionnel> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Professionnel> set=(ArrayList<Professionnel>) session.createQuery(
				"FROM Professionnel").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(professionnel);	
		close(session);	
	}

	@Override
	public void save(Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(professionnel);
		close(session);
		
	}

	@Override
	public void saveOrUpdate(Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(professionnel);
		close(session);
	}

}
