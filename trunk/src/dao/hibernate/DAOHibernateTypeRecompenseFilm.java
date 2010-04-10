package dao.hibernate;

import java.util.ArrayList;
import java.util.Set;

import org.hibernate.Session;

import metier.Film;
import metier.TypeRecompenseFilm;
import dao.DAOTypeRecompenseFilm;

public class DAOHibernateTypeRecompenseFilm extends DAOHibernate implements DAOTypeRecompenseFilm{

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE TypeRecompenseFilm").executeUpdate();
		close(session);	
	}

	@Override
	public TypeRecompenseFilm get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		TypeRecompenseFilm f=(TypeRecompenseFilm) session.get(TypeRecompenseFilm.class, id);
		close(session);	
		return f;
	}

	@Override
	public ArrayList<TypeRecompenseFilm> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<TypeRecompenseFilm>  set=(ArrayList<TypeRecompenseFilm> ) session.createQuery("FROM TypeRecompenseFilm").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(TypeRecompenseFilm typeRecompenseFilm) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(typeRecompenseFilm);
		close(session);	
	}

	@Override
	public void save(TypeRecompenseFilm typeRecompenseFilm) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.save(typeRecompenseFilm);
		close(session);	
	}

	@Override
	public void saveOrUpdate(TypeRecompenseFilm typeRecompenseFilm)
			throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(typeRecompenseFilm);
		close(session);
	}

}
