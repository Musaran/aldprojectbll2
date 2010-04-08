package dao.hibernate;

import java.util.ArrayList;
import java.util.Set;

import org.hibernate.Session;

import metier.Recompense;
import metier.TypeRecompenseFilm;
import dao.DAORecompense;

public class DAOHibernateRecompense extends DAOHibernate implements DAORecompense {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recompense get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Recompense f=(Recompense) session.get(Recompense.class, id);
		close(session);	
		return f;
	}

	@Override
	public Set<Recompense> load(String nomRecompense) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Recompense>loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<Recompense>  set=(ArrayList<Recompense> ) session.createQuery("FROM Recompense").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(recompense);
		close(session);		
	}

	@Override
	public void saveOrUpdate(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
