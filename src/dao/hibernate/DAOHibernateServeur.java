package dao.hibernate;

import java.util.ArrayList;

import metier.Film;
import metier.Serveur;

import org.hibernate.Session;

import dao.DAOServeur;

public class DAOHibernateServeur extends DAOHibernate implements DAOServeur {

	public Serveur load(int id) throws Exception {
		Session	session = connect();
		Serveur s= (Serveur) session.get(Serveur.class, id);
		close(session);	
		return s;
	}

	@Override
	public void save(Serveur s) throws Exception {
		Session	session = connect();
		session.saveOrUpdate(s);
		close(session);	
	}

	

}
