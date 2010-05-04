package dao.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Film;
import metier.Personne;
import metier.RoleActeur;
import metier.RoleProducteur;
import dao.DAORoleProducteur;

public class DAOHibernateRoleProducteur extends DAOHibernate implements DAORoleProducteur {

	@Override
	public RoleProducteur get(Personne p, Film f) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		RoleProducteur v=(RoleProducteur) session.createQuery("from RoleProducteur  where film = '"+f.getIdFilm()+"' and personne = '"+p.getIdPersonne()+"'").uniqueResult();
		close(session);	
		return v;
	}

	@Override
	public ArrayList<RoleProducteur> loadProducteurInvalide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RoleProducteur> set=(ArrayList<RoleProducteur>) session.createQuery("FROM RoleProducteur WHERE isValidateRoleProducteur=0").list();	
		close(session);	
		return set;
	}

	@Override
	public ArrayList<RoleProducteur> loadProducteurValide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RoleProducteur> set=(ArrayList<RoleProducteur>) session.createQuery("FROM RoleProducteur WHERE isValidateRoleProducteur=1").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(RoleProducteur role) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(role);
		close(session);	
		
	}

	@Override
	public void save(RoleProducteur role) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(role);
		close(session);
	}

	@Override
	public void saveOrUpdate(RoleProducteur r) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.saveOrUpdate(r);
		close(session);	
		
	}





}
