package dao.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Film;
import metier.Personne;
import metier.RoleRealisateur;
import dao.DAORoleRealisateur;

public class DAOHibernateRoleRealisateur extends DAOHibernate implements DAORoleRealisateur {

	@Override
	public RoleRealisateur get(Personne p, Film f) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		RoleRealisateur v=(RoleRealisateur) session.createQuery("from RoleRealisateur  where film = '"+f.getIdFilm()+"' and personne = '"+p.getIdPersonne()+"'").uniqueResult();
		close(session);	
		return v;
	}

	@Override
	public ArrayList<RoleRealisateur> loadRealisateurInvalide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RoleRealisateur> set=(ArrayList<RoleRealisateur>) session.createQuery("FROM RoleRealisateur WHERE isValidateRoleRealisateur=0").list();	
		close(session);	
		return set;
	}

	@Override
	public ArrayList<RoleRealisateur> loadRealisateurValide() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RoleRealisateur> set=(ArrayList<RoleRealisateur>) session.createQuery("FROM RoleRealisateur WHERE isValidateRoleRealisateur=1").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(RoleRealisateur role) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(role);
		close(session);
	}

	@Override
	public void save(RoleRealisateur role) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.save(role);
		close(session);
	}

	@Override
	public void saveOrUpdate(RoleRealisateur r) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.saveOrUpdate(r);
		close(session);	
	}

}
