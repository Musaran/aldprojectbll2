package test.metier;

import java.util.ArrayList;
import java.util.Set;

import junit.framework.TestCase;
import metier.Film;
import metier.Personne;
import metier.Professionnel;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.TypeRecompenseFilm;
import metier.TypeRecompensePersonne;
import dao.hibernate.DAOHibernateFilm;

public class Test extends TestCase {

	
	public void test() throws Exception
	{
		/**
		 * On test tous les constructeurs 
		 */
	Recompense oscar = new Recompense(1, "oscar");
	 assertEquals("Recompense [idRecompense=1, nomRecompense=oscar]", oscar.toString());
	 
	 TypeRecompenseFilm meilleurFilm= new TypeRecompenseFilm(1, "meilleur film"); 
	 assertEquals("TypeRecompenseFilm [idTypeRecompenseFilm=1, nomTypeRecompenseFilm=meilleur film]", meilleurFilm.toString());
	 
	 TypeRecompensePersonne meilleurActeur= new TypeRecompensePersonne(1, "meilleur acteur"); 
	 assertEquals("TypeRecompensePersonne [idTypeRecompensePersonne=1, nomTypeRecompensePersonne=meilleur acteur]", meilleurActeur.toString());
	 
	 Personne chuckNorris = new Personne(1, "norris", "chuck", null, "il est fort", null, 10);
	 assertEquals("Personne [biographie=il est fort, dateDeNaissance=null, filmographieActeur=[], filmographieProducteur=[], filmographieRealisateur=[]," +
	 		" idPersonne=1, isValidatePersonne=0, listeRecompense=[], nom=norris, nombreRequetes=10, photo=null, prenom=chuck]", 
			 chuckNorris.toString());
	 
	 Film armaggeddon = new Film(1, "armaggeddon", null, 100, "lol", 10);
	 Film lol = new Film(4, "lol", null, 100, "lol", 10);
	 assertEquals("Film [cout=100.0, dateSortie=null, idFilm=1, isValidateFilm=0, listDesActeurs=[], listeDesProducteurs=[], listeDesRealisateurs=[], listeRecompense=[], nombreRequetes=10, noteMoyenne=0.0," +
	 		" synopsis=lol, titre=armaggeddon]", armaggeddon.toString()); 
	 
	 Professionnel cinema = new Professionnel(1, "cinema", "pass", null, "kine", "polis", "123 fake street");
	 assertEquals("Professionnel [adresse=123 fake street, derniereConnexion=null, " +
	 		"idProfessionnel=1, login=cinema, nom=kine, password=pass, prenom=polis]",cinema.toString());
	 
	 RecompenseFilm recfilm = new RecompenseFilm(armaggeddon, oscar, meilleurFilm, 2010);
	 assertEquals("RecompenseFilm [annee=2010, film="+recfilm.getFilm().toString()+", isValidateRecompense=0," +
	 		" recompense="+recfilm.getRecompense().toString()+", typeRecompense="+recfilm.getTypeRecompense().toString()+"]",recfilm.toString());
	 
	 RecompensePersonne recpersonne = new RecompensePersonne(chuckNorris, oscar, meilleurActeur, 2010);
	 assertEquals("RecompensePersonne [annee=2010, isValidateRecompense=0, personne="+recpersonne.getPersonne().toString()+
			 ", recompense="+recpersonne.getRecompense().toString()+", typeRecompense="+recpersonne.getTypeRecompense().toString()+"]",recpersonne.toString());
	 
	 //Vote vote = new Vote(armaggeddon, cinema, 7);
	// assertEquals("Vote [film="+vote.getFilm().toString()+", note=7, professionel="+vote.getProfessionnel().toString()+"]",vote.toString());
	 /**
	  * les constructeurs sont ok, on test maintenant la persistance des objets
	  */
	//la j'ai testé les fonction ajout acteur/prod/real
	 // j ai laissé que une fonction mais elle fonctionne toute normalement
	 // Si un acteur est deja acteur ds un film on peut pas le rajouter une nouvelle fois
	  armaggeddon.ajoutPersonneProducteur(chuckNorris);
	  chuckNorris.ajoutFilmProducteur(armaggeddon);
	  
	 assertEquals(armaggeddon.getListeDesProducteurs().size(),1);
	 assertEquals(chuckNorris.getFilmographieProducteur().size(),1);
	 
	 // test des votes
	 
	 cinema.faitUnVote(armaggeddon, 7);


	 cinema.faitUnVote(lol, 7);
	 cinema.faitUnVote(lol, 7);
	 
	 assertEquals(cinema.getVotes().size(),2);


	 DAOHibernateFilm daof= new DAOHibernateFilm();
	 //Set<Film> set=daof.loadAll();
	 Film temp = daof.get(7);
	 //System.out.println(temp.getDateSortie());
	 //System.out.println(daof.get(2).getTitre());
	 //Set<Film> set=daof.loadAll();
	}
}
