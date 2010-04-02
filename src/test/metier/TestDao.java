package test.metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import metier.Film;
import metier.Personne;
import metier.Professionnel;
import dao.DAOProfessionnel;
import dao.hibernate.DAOHibernateFilm;
import dao.hibernate.DAOHibernatePersonne;
import dao.hibernate.DAOHibernateProfessionnel;
import junit.framework.TestCase;

public class TestDao extends TestCase {

	public void test() throws Exception
	{
		DAOHibernateFilm daof= new DAOHibernateFilm();
		DAOHibernatePersonne daop= new DAOHibernatePersonne();
		DAOProfessionnel daopro= new DAOHibernateProfessionnel();
		
		DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date Ddate = dateFormat.parse( "2008-11-21" );
		
		
		Film armaggeddon = new Film( "armaggedon", Ddate, 100, "film d escience fiction", 10,"pas_de_photo");
		Personne chuckNorris = new Personne( "Chuck", "Norris", Ddate, "il tet fort", "no_photo", 10);//!\personne existant deja dans la bdd
		 Professionnel cinema = new Professionnel( "cinema", "pass", Ddate, "kine", "polis", "123 fake street");

		 
		daof.save(armaggeddon);
		//daop.save(chuckNorris);
		//chuckNorris.setPhoto("c'est pas chuck norris qui est pris en photo..");
		//armaggeddon.setTitre("jesuisunkikoulol");
		 
		//chuckNorris.ajoutFilmProducteur(armaggeddon);
		//armaggeddon.ajoutPersonneActeur(chuckNorris);
		 
		//daof.saveOrUpdate(armaggeddon);
		//System.out.println(daop.load("Chuck").get(0).getPhoto());
		//daop.saveOrUpdate(chuckNorris);//avant de save le film avec sa nouvelle liste 
		 								//il faut s'assurer que l acteur a bien été enregistré
		 								//sinon synchronisation pb
		//System.out.println(daop.load("Chuck").get(0).getPhoto());
		//System.out.println(chuckNorris.getIdPersonne());
		//ArrayList<Film> set=(ArrayList<Film>) daof.load("o");
		//assertEquals(set.size(),2);
		
		//daop.remove(chuckNorris);
		//daop.clear();
		//daof.clear();
		//Film temp = daof.get(7);
		//System.out.println(set.get(1).getTitre());
		//System.out.println(daof.get(2).getTitre());
		//Set<Film> set=daof.loadAll();
		
		
		cinema.faitUnVote(armaggeddon, 6);
		daopro.save(cinema);
		 Professionnel lepro = daopro.get(1);
		 System.out.println(lepro.getAdresse());
	}
}
