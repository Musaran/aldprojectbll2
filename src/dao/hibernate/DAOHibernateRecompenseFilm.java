package dao.hibernate;

import java.util.ArrayList;

import metier.Film;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.TypeRecompenseFilm;

import org.hibernate.Session;

import dao.DAORecompenseFilm;

public class DAOHibernateRecompenseFilm extends DAOHibernate implements DAORecompenseFilm{

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE RecompenseFilm").executeUpdate();
		close(session);	
	}

	@Override
	public RecompenseFilm get(Film film, Recompense recompense,
			TypeRecompenseFilm typeRecompense, int annee) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		RecompenseFilm f=(RecompenseFilm) session.createQuery(
				"from RecompenseFilm as rec where " 
				+"rec.film = '"+film.getIdFilm()
				+"' and rec.recompense = '"+recompense.getIdRecompense()
				+"' and rec.typeRecompense = '"+typeRecompense.getIdTypeRecompenseFilm()
				+"' and rec.annee = '"+annee
				+"'")
				.uniqueResult();
		
		close(session);	
		return f;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<RecompenseFilm> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RecompenseFilm>  set=(ArrayList<RecompenseFilm> ) session.createQuery(
				"FROM RecompenseFilm").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(RecompenseFilm recompenseFilm) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(recompenseFilm);
		close(session);	
	}

	@Override
	public void save(RecompenseFilm recompenseFilm) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.saveOrUpdate(recompenseFilm);
		close(session);	
	}

	@Override
	public void saveOrUpdate(RecompenseFilm recompenseFilm)
			throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.saveOrUpdate(recompenseFilm);
		close(session);
	}

	@Override
	public ArrayList<RecompenseFilm> loadInvalideRecompenseFilm()
			throws Exception {
		Session	session = connect();
		ArrayList<RecompenseFilm>  set=(ArrayList<RecompenseFilm> ) session.createQuery("FROM RecompenseFilm WHERE isValidateRecompense=0").list();	
		close(session);	
		return set;
	}

	@Override
	public ArrayList<RecompenseFilm> loadValideRecompenseFilm()
			throws Exception {
		Session	session = connect();
		ArrayList<RecompenseFilm>  set=(ArrayList<RecompenseFilm> ) session.createQuery("FROM RecompenseFilm WHERE isValidateRecompense=1").list();	
		close(session);	
		return set;
	}

}
