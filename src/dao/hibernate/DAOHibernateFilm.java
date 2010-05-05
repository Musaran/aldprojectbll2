package dao.hibernate;

import java.util.ArrayList;

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
		Session	session = connect();
		session.createQuery("DELETE Film").executeUpdate();
		close(session);	
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
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Film> load(String key) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Film> liste=(ArrayList<Film>) session.createQuery(
				"FROM Film as film WHERE film.titre LIKE '%"+key+"%'").list();	

		close(session);	
		return liste;
	}
	/// liste de tous les films
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Film> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Film> set=(ArrayList<Film>) session.createQuery("FROM Film").list();	
		close(session);	
		return set;
	}

	/// suppression d'un film
	@Override
	public void remove(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(film);
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
	/// enregistrement d'un film
	@Override
	public void save(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.saveOrUpdate(film);
		
		
		close(session);	
	}
	/// enregistrement ou mise à jour d'un film
	@Override
	public void saveOrUpdate(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(film);
		close(session);
		
	}
	@Override
	public ArrayList<Film> loadFilmInvalide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Film> set=(ArrayList<Film>) session.createQuery("FROM Film WHERE isValidateFilm=0").list();	
		close(session);	
		return set;
	}
	@Override
	public ArrayList<Film> loadFilmValide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Film> set=(ArrayList<Film>) session.createQuery("FROM Film WHERE isValidateFilm=1").list();	
		close(session);	
		return set;
	}

}
