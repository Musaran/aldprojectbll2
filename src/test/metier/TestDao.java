package test.metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import metier.Film;
import metier.Personne;
import dao.hibernate.DAOHibernateFilm;
import dao.hibernate.DAOHibernatePersonne;
import junit.framework.TestCase;

public class TestDao extends TestCase {

	public void test() throws Exception
	{
		DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date Ddate = dateFormat.parse( "2008-11-21" );

		
		 Film armaggeddon = new Film( "test", Ddate, 100, "lol", 10,"pas_de_photo");
		 Personne chuckNorris = new Personne(1, "test", "test", Ddate, "il tet fort", "no_photo", 10);//!\personne existant deja dans la bdd
		 
		 
		 armaggeddon.ajoutPersonneActeur(chuckNorris);
		 armaggeddon.ajoutPersonneProducteur(chuckNorris);
		 armaggeddon.ajoutPersonneRealisateur(chuckNorris);
		 DAOHibernateFilm daof= new DAOHibernateFilm();
		 DAOHibernatePersonne daop= new DAOHibernatePersonne();
		 
		 daop.save(chuckNorris);//avant de save le film avec sa nouvelle liste il faut s'assurer que l acteur a bien été enregistré
		 						//sinon synchronisation pb
		 daof.save(armaggeddon);
		 //Set<Film> set=daof.loadAll();
		 //Film temp = daof.get(7);
		 //System.out.println(temp.getDateSortie());
		 //System.out.println(daof.get(2).getTitre());
		 //Set<Film> set=daof.loadAll();
	}
}
