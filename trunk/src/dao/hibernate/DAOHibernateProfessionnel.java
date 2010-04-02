package dao.hibernate;

import java.util.Set;

import org.hibernate.Session;

import metier.Personne;
import metier.Professionnel;
import dao.DAOProfessionnel;

public class DAOHibernateProfessionnel extends DAOHibernate implements DAOProfessionnel {

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Professionnel get(int id) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		Professionnel p=(Professionnel) session.get(Professionnel.class, id);
		close(session);	
		return p;
	}

	@Override
	public Set<Professionnel> load(String nom) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Professionnel> loadAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Professionnel professionnel) throws Exception {
		// TODO Auto-generated method stub
		
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
		
	}

}
