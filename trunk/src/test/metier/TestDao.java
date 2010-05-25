package test.metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import metier.Film;
import metier.Personne;
import metier.Professionnel;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.RoleActeur;
import metier.RoleProducteur;
import metier.RoleRealisateur;
import metier.Serveur;
import metier.TypeRecompenseFilm;
import metier.TypeRecompensePersonne;
import metier.Vote;
import dao.DAOProfessionnel;
import dao.DAORecompense;
import dao.DAORecompenseFilm;
import dao.DAORecompensePersonne;
import dao.DAORoleActeur;
import dao.DAORoleProducteur;
import dao.DAORoleRealisateur;
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
import dao.hibernate.DAOHibernateRoleActeur;
import dao.hibernate.DAOHibernateRoleProducteur;
import dao.hibernate.DAOHibernateRoleRealisateur;
import dao.hibernate.DAOHibernateServeur;
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
		DAORoleActeur daora= new DAOHibernateRoleActeur();
		DAORoleProducteur daorop= new DAOHibernateRoleProducteur();
		DAORoleRealisateur daoropr= new DAOHibernateRoleRealisateur();
		
		/*DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date Ddate = dateFormat.parse( "2008-11-21" );
		
		Film armaggeddon = new Film( "armaggedon", Ddate, 100, "film de science fiction", 10,"pas_de_photo");
		Film terminator = new Film( "terminator", Ddate, 200, "film d'action", 20,"no_photo");
		
		Personne christianBale = new Personne( "Christian", "Bale", Ddate, "c lui ki fait batman aussi", "no_photo_forever", 30);//!\personne existant deja dans la bdd
		Personne chuckNorris = new Personne( "Chuck", "Norris", Ddate, "il tet fort", "no_photo", 10);//!\personne existant deja dans la bdd
		
		Professionnel cinema = new Professionnel("cinema", "pass", Ddate, "kine", "polis", "123 fake street", Ddate);
		Professionnel cinema2 = new Professionnel("theatre", "pwd", Ddate, "le petit", "theatre", "dtc", Ddate);
		
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
		/*
		daof.save(armaggeddon);
		daof.save(terminator);
		
		daop.save(chuckNorris);
		daop.save(christianBale);
		
		RoleProducteur r1 = new RoleProducteur(chuckNorris, armaggeddon, 0);
		RoleRealisateur r2 =  new RoleRealisateur(chuckNorris, armaggeddon, 0);
		
		RoleActeur r3 = new RoleActeur(christianBale, armaggeddon, 0);
		RoleActeur r4 = new RoleActeur(christianBale, terminator, 0);
		 
		daopro.save(cinema);
		daopro.save(cinema2);
		
		daotrf.save(meilleurFilm);
		daotrp.save(meilleurActeur);
		
		daorec.save(cesar);
		daorec.save(oscar);
		
		daora.saveOrUpdate(r4);
		daora.saveOrUpdate(r3);
		daorop.saveOrUpdate(r1);
		daoropr.saveOrUpdate(r2);
		//terminator.setCout(399);
		
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
		
		Vote V=cinema.faitUnVote(armaggeddon, 6);
		//daovote.save(V);
		armaggeddon.calculNoteMoyenne(daovote.loadFilmVote(armaggeddon));
		//daof.saveOrUpdate(armaggeddon);

		
		Vote V2=cinema2.faitUnVote(armaggeddon, 9);
		//daovote.save(V2);
		armaggeddon.calculNoteMoyenne(daovote.loadFilmVote(armaggeddon));
		//daof.saveOrUpdate(armaggeddon);
		System.out.println(armaggeddon.getNoteMoyenne());*/
		/* FIN exemple de vote */
		//cinema = daopro.get(1);
		//armaggeddon = daof.get(1);
		
		//System.out.println("la note est de : "+daovote.get(armaggeddon, cinema).getNote());	 
		//daop.clear();
		/*
		System.out.println("il y a "+daora.loadActeurValide().size()+"acteurs valides");
		System.out.println("il y a "+daorop.loadProducteurValide().size()+"producteur valides");
		System.out.println("il y a "+daoropr.loadRealisateurValide().size()+"realisateur valides");
		
		Film f1 = daof.get(1);
		Personne p1 = daop.get(1);
		RoleActeur r5 = daora.get(p1, f1);
		if(r5==null)
			System.out.println(p1.getNom()+" n'a pas jouer dans "+f1.getTitre());
		
		f1 = daof.get(2);
		p1 = daop.get(2);
		r5 = daora.get(p1, f1);
		if(r5!=null && r5.getIsValidateRoleActeur()==0)
			System.out.println(p1.getNom()+" est en attente de valisation ou pas pour "+f1.getTitre());
		
		f1 = daof.get(1);
		p1 = daop.get(2);
		r5 = daora.get(p1, f1);
		r5.setIsValidateRoleActeur(1);
		daora.saveOrUpdate(r5);
		if(r5!=null && r5.getIsValidateRoleActeur()==1)
			System.out.println(p1.getNom()+" a jouer dans "+f1.getTitre());
		
		System.out.println("il y a "+daora.loadActeurValide().size()+" acteurs valides maintenants");
		daora.remove(r5);
		System.out.println("il y a "+daora.loadActeurValide().size()+"acteurs valides");
		f1 = daof.get(2);
		p1 = daop.get(2);
		System.out.println(p1.getNom()+" est susceptible d'avoir jouer dans "+p1.getFilmographieActeur().size()+" films ");
		System.out.println("il y a "+f1.getListDesActeurs().size()+" dans "+f1.getTitre());
		
		p1 = daop.get(1);
		r5 = new RoleActeur(p1,f1,0);
		daop.saveOrUpdate(p1);
		daof.saveOrUpdate(f1);
		daora.saveOrUpdate(r5);
		
				//daop.remove(chuckNorris);
		*/
		/* DELIRE des dates 
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);
		Date bonne = c.getTime();
		java.sql.Date jsqlD = new java.sql.Date( c.getTime().getTime() );

		
		System.out.println("Les inactifs sont :  "+daopro.loadInactif(jsqlD).size() );
		System.out.println(jsqlD);
		System.out.println(dateFormat.format(c.getTime()));
	
		System.out.println("Les nouveaux sont :  "+daopro.loadInscritDuMois().size() );*/
//		System.out.println("invalide "+daof.loadFilmInvalide().size());
//		System.out.println("valide "+daof.loadFilmValide().size());
//		
//		Film a = daof.get(3);
//		System.out.println(a.listeDesRealisateurs().size());
		
		DAOHibernateServeur test= new DAOHibernateServeur();
		Serveur huhu=new Serveur(0,"ca me gonfle severe");
//		test.save(huhu);
		System.out.println(test.load(0));
		
	}
}
