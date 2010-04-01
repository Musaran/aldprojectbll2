package dao.hibernate;

import java.util.ArrayList;
import java.util.Set;

import metier.Film;

import org.hibernate.Session;

import dao.DAOFilm;
/**
 * 
 * @author Matthieu
 * DAO Hibernate de film.   
 *
 */
public class DAOHibernateFilm extends DAOHibernate implements DAOFilm{

	///suppression de tous les films
	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}
	/// retourne un film d'après son id passé en paramètre
	@Override
	public Film get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Film f=(Film) session.get(Film.class, id);
		close(session);	
		return f;
	}
	/// retourne les films qui contiennent dans leur titre le mot key
	@Override
	public Set<Film> load(String key) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Set<Film> set=(Set<Film>) session.createQuery("FROM film WHERE titre LIKE '%"+key+"%'").list();	

		close(session);	
		return set;
	}
	/// liste de tous les films
	@Override
	public Set<Film> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Set<Film> set=(Set<Film>) session.createQuery("FROM film").list();	
		close(session);	
		return set;
	}

	/// suppression d'un film
	@Override
	public void remove(Film film) throws Exception {
		// TODO Auto-generated method stub
		
	}
	/// enregistrement d'un film
	@Override
	public void save(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.save(film);
		
		close(session);	
	}
	/// enregistrement ou mise à jour d'un film
	@Override
	public void saveOrUpdate(Film film) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
