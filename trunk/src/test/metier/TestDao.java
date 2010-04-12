package test.metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;
import metier.Film;
import metier.Personne;
import metier.Professionnel;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.TypeRecompenseFilm;
import metier.TypeRecompensePersonne;
import metier.Vote;
import dao.DAOProfessionnel;
import dao.DAORecompense;
import dao.DAORecompenseFilm;
import dao.DAORecompensePersonne;
import dao.DAOTypeRecompenseFilm;
import dao.DAOTypeRecompensePersonne;
import dao.DAOVote;
import dao.hibernate.DAOHibernate;
import dao.hibernate.DAOHibernateFilm;
import dao.hibernate.DAOHibernatePersonne;
import dao.hibernate.DAOHibernateProfessionnel;
import dao.hibernate.DAOHibernateRecompense;
import dao.hibernate.DAOHibernateRecompenseFilm;
import dao.hibernate.DAOHibernateRecompensePersonne;
import dao.hibernate.DAOHibernateTypeRecompenseFilm;
import dao.hibernate.DAOHibernateTypeRecompensePersonne;
import dao.hibernate.DAOHibernateVote;

public class TestDao extends TestCase {

	public void test() throws Exception
	{
		DAOHibernateFilm daof= new DAOHibernateFilm();
		DAOHibernatePersonne daop= new DAOHibernatePersonne();
		DAOProfessionnel daopro= new DAOHibernateProfessionnel();
		DAORecompense daorec = new DAOHibernateRecompense();
		DAORecompenseFilm daorf=new DAOHibernateRecompenseFilm();
		DAORecompensePersonne daorp=new DAOHibernateRecompensePersonne();
		DAOTypeRecompenseFilm daotrf= new DAOHibernateTypeRecompenseFilm();
		DAOTypeRecompensePersonne daotrp = new DAOHibernateTypeRecompensePersonne();
		DAOVote daovote= new DAOHibernateVote();
		
		DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date Ddate = dateFormat.parse( "2008-11-21" );
		
		Film armaggeddon = new Film( "armaggedon", Ddate, 100, "film de science fiction", 10,"pas_de_photo");
		Film terminator = new Film( "terminator", Ddate, 200, "film d'action", 20,"no_photo");
		
		Personne christianBale = new Personne( "Christian", "Bale", Ddate, "c lui ki fait batman aussi", "no_photo_forever", 30);//!\personne existant deja dans la bdd
		Personne chuckNorris = new Personne( "Chuck", "Norris", Ddate, "il tet fort", "no_photo", 10);//!\personne existant deja dans la bdd
		
		Professionnel cinema = new Professionnel( "cinema", "pass", Ddate, "kine", "polis", "123 fake street");
		Professionnel cinema2 = new Professionnel( "theatre", "pwd", Ddate, "le petit", "theatre", "dtc");
		
		TypeRecompenseFilm meilleurFilm= new TypeRecompenseFilm("meilleur film"); 
		TypeRecompensePersonne meilleurActeur= new TypeRecompensePersonne("meilleur acteur");
		
		Recompense oscar = new Recompense("oscar");
		Recompense cesar = new Recompense("césar");
		 
		RecompenseFilm recf2=new RecompenseFilm(armaggeddon, cesar, meilleurFilm, 1998);
		RecompenseFilm recf1=new RecompenseFilm(terminator, oscar, meilleurFilm, 2005);
		
		RecompensePersonne recp1=new RecompensePersonne(christianBale, oscar, meilleurActeur, 2006);
		
		//Exemple de base de données
		//DAOHibernate.Nettoyage();
		/*daof.clear();
		daop.clear();
		daopro.clear();
		daotrf.clear();
		daotrp.clear();
		daorec.clear();*/
		
		daof.save(armaggeddon);
		daof.save(terminator);
		
		daop.save(chuckNorris);
		daop.save(christianBale);
		 
		chuckNorris.ajoutFilmProducteur(armaggeddon);
		armaggeddon.ajoutPersonneActeur(chuckNorris);
		
		terminator.ajoutPersonneActeur(christianBale);
		terminator.ajoutPersonneActeur(chuckNorris);
		 
		daopro.save(cinema);
		daopro.save(cinema2);
		
		daotrf.save(meilleurFilm);
		daotrp.save(meilleurActeur);
		
		daorec.save(cesar);
		daorec.save(oscar);
		
		
		
		terminator.ajoutRecompense(oscar, meilleurFilm, 1998);
		chuckNorris.ajoutRecompense(cesar, meilleurActeur, 2002);
		daop.saveOrUpdate(chuckNorris);
		daop.saveOrUpdate(christianBale);
		daof.saveOrUpdate(terminator);
		daof.saveOrUpdate(armaggeddon);
		
		//daorf.save(recf1);
		//daorf.save(recf2);
		//daorp.save(recp1);
		
		//fin exemple de base de données
		
		
		// exemple de vote 
		 ArrayList<Vote> listeDesVotes=new ArrayList<Vote>();
		
		Vote V=cinema.faitUnVote(armaggeddon, 6);
		daovote.save(V);
		listeDesVotes = daovote.loadAll();
		Vote.calculNoteMoyenne(armaggeddon, listeDesVotes);
		daof.saveOrUpdate(armaggeddon);

		
		Vote V2=cinema2.faitUnVote(armaggeddon, 9);
		daovote.save(V2);
		listeDesVotes = daovote.loadAll();
		Vote.calculNoteMoyenne(armaggeddon, listeDesVotes);
		daof.saveOrUpdate(armaggeddon);
		System.out.println(armaggeddon.getNoteMoyenne());
		/* FIN exemple de vote */
		//cinema = daopro.get(1);
		//armaggeddon = daof.get(1);
		
		//System.out.println("la note est de : "+daovote.get(armaggeddon, cinema).getNote());	 
	}
}
