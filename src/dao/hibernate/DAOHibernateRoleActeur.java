package dao.hibernate;

import java.util.ArrayList;

import javax.management.relation.Role;

import org.hibernate.Session;

import metier.Film;
import metier.Personne;
import metier.RoleActeur;
import metier.Vote;
import dao.DAORoleActeur;

public class DAOHibernateRoleActeur extends DAOHibernate implements DAORoleActeur {

	@Override
	public ArrayList<RoleActeur> loadActeurInvalide() throws Exception {
		Session	session = connect();
		ArrayList<RoleActeur> set=(ArrayList<RoleActeur>) session.createQuery("FROM RoleActeur WHERE isValidateRoleActeur=0").list();	
		close(session);	
		return set;
		
	}

	@Override
	public ArrayList<RoleActeur> loadActeurValide() throws Exception {
		Session	session = connect();
		ArrayList<RoleActeur> set=(ArrayList<RoleActeur>) session.createQuery("FROM RoleActeur WHERE isValidateRoleActeur=1").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(RoleActeur role) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(role);
		close(session);		
	}

	@Override
	public void save(RoleActeur role) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(role);
		close(session);
	}

	@Override
	public RoleActeur get(Personne p, Film f) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		RoleActeur v=(RoleActeur) session.createQuery("from RoleActeur  where film = '"+f.getIdFilm()+"' and personne = '"+p.getIdPersonne()+"'").uniqueResult();
		close(session);	
		return v;
	}

	@Override
	public void saveOrUpdate(RoleActeur r) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.saveOrUpdate(r);
		close(session);	
		
	}

}
