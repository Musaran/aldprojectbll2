package dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Matthieu
 * DAO pour la connexion avec le framework de bdd Hibernate   
 *
 */
public class DAOHibernate {

	private static SessionFactory	sessionFactory = null;
	/// connexion à la base de données
	public Session connect() throws Exception {
		if (sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return session;
	}
	/// annule la transaction en cours et ferme la session
	public void cancel(Session session){
		session.getTransaction().rollback();
		session.close();
	}
	/// fermeture de la session
	public void close(Session session) throws Exception {
		session.getTransaction().commit();
		session.close();
	}
}