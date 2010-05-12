package dao.hibernate;

import java.util.ArrayList;
import java.util.Date;

import metier.Film;
import metier.Professionnel;

import org.hibernate.Query;
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
	public Professionnel get(String nom) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Professionnel p=(Professionnel) session.get(Professionnel.class, nom);
		close(session);	
		return p;
	}

	@Override
	public Professionnel get(String login, String pass) throws Exception {
		// TODO Auto-generated method stub
		Professionnel pro=null;
		Session	session = connect();
		 Query req = session.createQuery(
				"FROM Professionnel WHERE login ='"+login+"' AND password='"+pass+"'");
		 pro=(Professionnel) req.uniqueResult();
		close(session);	
		return pro;
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
		session.saveOrUpdate(professionnel);
		close(session);
		
	}

	@Override
	public void saveOrUpdate(Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(professionnel);
		close(session);
	}

	@Override
	public ArrayList<Professionnel> loadInactif(Date d) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		 Query req = session.createQuery(
				"FROM Professionnel WHERE derniereConnexion < '"+d+"'");
		 //req.setDate(0,d);
		 ArrayList<Professionnel> set=(ArrayList<Professionnel>) req.list();
		close(session);	
		return set;
	}

	@Override
	public ArrayList<Professionnel> loadInscritDuMois() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		 Query req = session.createQuery(
				"FROM Professionnel WHERE month(dateInscription) = month(now()) AND year(now()) = year(dateInscription)");
		 //req.setDate(0,d);
		 ArrayList<Professionnel> set=(ArrayList<Professionnel>) req.list();
		close(session);	
		return set;
	}

	

	

}
