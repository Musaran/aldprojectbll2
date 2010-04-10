package dao.hibernate;

import java.util.ArrayList;

import metier.Personne;
import metier.Recompense;
import metier.RecompensePersonne;
import metier.TypeRecompensePersonne;

import org.hibernate.Session;

import dao.DAORecompensePersonne;

public class DAOHibernateRecompensePersonne extends DAOHibernate implements DAORecompensePersonne{

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.createQuery("DELETE RecompensePersonne").executeUpdate();
		close(session);	
	}

	@Override
	public RecompensePersonne get(Personne personne, Recompense recompense,
			TypeRecompensePersonne typeRecompense, int annee) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		RecompensePersonne f=(RecompensePersonne) session.createQuery(
				"from RecompensePersonne as rec where " 
				+"rec.Personne = '"+personne.getIdPersonne()
				+"' and rec.recompense = '"+recompense.getIdRecompense()
				+"' and rec.typeRecompense = '"+typeRecompense.getIdTypeRecompensePersonne()
				+"' and rec.annee = '"+annee
				+"'")
				.uniqueResult();
		
		close(session);	
		return f;
	}

	@Override
	public ArrayList<RecompensePersonne> loadAll() throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		ArrayList<RecompensePersonne>  set=(ArrayList<RecompensePersonne> ) session.createQuery(
				"FROM RecompensePersonne").list();	
		close(session);	
		return set;
	}

	@Override
	public void remove(RecompensePersonne recompensePersonne) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.delete(recompensePersonne);
		close(session);	
	}

	@Override
	public void save(RecompensePersonne recompensePersonne) throws Exception {
		// TODO Auto-generated method stub
		Session	session = connect();
		session.save(recompensePersonne);
		close(session);	
	}

	@Override
	public void saveOrUpdate(RecompensePersonne recompensePersonne)
			throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		session.update(recompensePersonne);
		close(session);
	}

}
