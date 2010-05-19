package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import metier.RecompenseFilm;
import metier.RoleActeur;
import dao.DAORecompenseFilm;
import dao.hibernate.DAOHibernateRecompenseFilm;

public class GestionnaireRecompenseFilm {

	DAORecompenseFilm dao;
	
	public GestionnaireRecompenseFilm()
	{
		dao = new DAOHibernateRecompenseFilm();
	}

	public void supprimeRole(ArrayList<RecompenseFilm> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				RecompenseFilm temp = dao.get(liste.get(i).getFilm(), liste.get(i).getRecompense(),liste.get(i).getTypeRecompense(), liste.get(i).getAnnee() );
				
				dao.remove(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}

	public void supprimeAll() {
		// TODO Auto-generated method stub
		try {
			ArrayList<RecompenseFilm> liste = dao.loadInvalideRecompenseFilm();
			for(int i=0;i<liste.size();i++)
			{
			
				dao.remove(liste.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refresh();	
		
	}

	public void acceptRole(ArrayList<RecompenseFilm> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				RecompenseFilm temp = dao.get(liste.get(i).getFilm(), liste.get(i).getRecompense(),liste.get(i).getTypeRecompense(), liste.get(i).getAnnee() );
				temp.setIsValidateRecompense(-1);
				dao.saveOrUpdate(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}

	public void acceptAll() {
		try {
			ArrayList<RecompenseFilm> liste = dao.loadInvalideRecompenseFilm();
			for(int i=0;i<liste.size();i++)
			{
				liste.get(i).setIsValidateRecompense(-1);
				dao.saveOrUpdate(liste.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refresh();	
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		Vector <RecompenseFilm> liste = new Vector <RecompenseFilm>();
		ArrayList<RecompenseFilm> temp= new ArrayList<RecompenseFilm>();
		try {
			temp = dao.loadInvalideRecompenseFilm();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreRecompenseFilm().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeRecompenseFilm().setListData(liste);
		
	}
}
