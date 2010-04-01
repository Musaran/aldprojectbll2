package test.metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import metier.Film;
import metier.Personne;
import dao.hibernate.DAOHibernateFilm;
import dao.hibernate.DAOHibernatePersonne;
import junit.framework.TestCase;

public class TestDao extends TestCase {

	public void test() throws Exception
	{
		DAOHibernateFilm daof= new DAOHibernateFilm();
		 DAOHibernatePersonne daop= new DAOHibernatePersonne();
		
		DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date Ddate = dateFormat.parse( "2008-11-21" );

		
		 Film armaggeddon = new Film( "test3", Ddate, 100, "lol2", 10,"pas_de_photo");
		 Personne chuckNorris = new Personne( "testlevrai10", "test2", Ddate, "il tet fort", "no_photo", 10);//!\personne existant deja dans la bdd
		// daof.save(armaggeddon);
		// daop.save(chuckNorris);
		 chuckNorris.setPhoto("c'est pas chuck norris qui est pris en photo..");
		 armaggeddon.setTitre("jesuisunkikoulol");
		 
		 chuckNorris.ajoutFilmProducteur(armaggeddon);
		 armaggeddon.ajoutPersonneActeur(chuckNorris);
		 
		 // daof.saveOrUpdate(armaggeddon);
		 //daop.saveOrUpdate(chuckNorris);//avant de save le film avec sa nouvelle liste il faut s'assurer que l acteur a bien �t� enregistr�
		 						//sinon synchronisation pb
		
		 ArrayList<Film> set=daof.loadAll();
		 assertEquals(set.size(),2);
		 //Film temp = daof.get(7);
		 //System.out.println(temp.getDateSortie());
		 //System.out.println(daof.get(2).getTitre());
		 //Set<Film> set=daof.loadAll();
	}
}
