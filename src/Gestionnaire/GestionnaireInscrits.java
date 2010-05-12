package Gestionnaire;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import dao.DAOProfessionnel;
import dao.hibernate.DAOHibernateProfessionnel;

import metier.Film;
import metier.Professionnel;

public class GestionnaireInscrits {
	
	DAOProfessionnel dao;
	
	public GestionnaireInscrits()
	{
		dao = new DAOHibernateProfessionnel();
	}

	public void supprime(ArrayList<Professionnel> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				Professionnel temp = dao.get(liste.get(i).getLogin());
				dao.remove(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}

	public void supprimeAll() {
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -1);
			java.sql.Date jsqlD = new java.sql.Date( c.getTime().getTime() );
			ArrayList<Professionnel> liste = dao.loadInactif(jsqlD);
			
			for(int i=0;i<liste.size();i++)
			{
			
				dao.remove(liste.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh();	
		
	}

	public void accept(ArrayList<Professionnel> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				Professionnel temp = dao.get(liste.get(i).getLogin());
				Calendar c = Calendar.getInstance();
				java.sql.Date jsqlD = new java.sql.Date( c.getTime().getTime() );
				temp.setDerniereConnexion(jsqlD);
				dao.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}

	public void acceptAll() {
		// TODO Auto-generated method stub
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -1);
			java.sql.Date jsqlD = new java.sql.Date( c.getTime().getTime() );
			ArrayList<Professionnel> liste = dao.loadInactif(jsqlD);
			
			for(int i=0;i<liste.size();i++)
			{
				c.add(Calendar.MONTH, +1);
				 jsqlD = new java.sql.Date( c.getTime().getTime() );
				liste.get(i).setDerniereConnexion(jsqlD);
				dao.saveOrUpdate(liste.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh();	
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		Vector <Professionnel> liste = new Vector <Professionnel>();
		ArrayList<Professionnel> temp= new ArrayList<Professionnel>();
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -1);
			Date bonne = c.getTime();
			java.sql.Date jsqlD = new java.sql.Date( c.getTime().getTime() );
			temp = dao.loadInactif(jsqlD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreInscrit().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeInscrit().setListData(liste);
		
		 liste = new Vector <Professionnel>();
		 temp= new ArrayList<Professionnel>();
		try {
		temp = dao.loadInscritDuMois();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		AffichageGestionnaire.getInstance().getLabelNouveauxInscritNombre().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeNouveauxInscrit().setListData(liste);
		
	}

}
