package dao.hibernate;

import java.util.ArrayList;
import java.util.Set;

import org.hibernate.Session;

import metier.TypeRecompenseFilm;
import metier.TypeRecompensePersonne;
import dao.DAOTypeRecompensePersonne;

public class DAOHibernateTypeRecompensePersonne extends DAOHibernate implements DAOTypeRecompensePersonne {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeRecompensePersonne get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		TypeRecompensePersonne f=(TypeRecompensePersonne) session.get(TypeRecompensePersonne.class, id);
		close(session);	
		return f;
	}

	@Override
	public ArrayList<TypeRecompensePersonne> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<TypeRecompensePersonne>  set=(ArrayList<TypeRecompensePersonne> ) session.createQuery("FROM TypeRecompensePersonne").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(TypeRecompensePersonne typeRecompensePersonne)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(TypeRecompensePersonne typeRecompensePersonne)
			throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.save(typeRecompensePersonne);
		close(session);	
		
	}

	@Override
	public void saveOrUpdate(TypeRecompensePersonne typeRecompensePersonne)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
