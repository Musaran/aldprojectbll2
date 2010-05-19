package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import dao.DAORecompensePersonne;
import dao.hibernate.DAOHibernateRecompensePersonne;

import metier.RecompenseFilm;
import metier.RecompensePersonne;

public class GestionnaireRecompensePersonne {

	DAORecompensePersonne dao;
	
	public GestionnaireRecompensePersonne()
	{
		dao = new DAOHibernateRecompensePersonne();
	}
	
	public void supprimeRole(ArrayList<RecompensePersonne> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				RecompensePersonne temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getRecompense(),liste.get(i).getTypeRecompense(), liste.get(i).getAnnee() );
				
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
			ArrayList<RecompensePersonne> liste = dao.loadInvalideRecompensePersonne();
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

	public void acceptRole(ArrayList<RecompensePersonne> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				RecompensePersonne temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getRecompense(),liste.get(i).getTypeRecompense(), liste.get(i).getAnnee() );
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
		// TODO Auto-generated method stub
		try {
			ArrayList<RecompensePersonne> liste = dao.loadInvalideRecompensePersonne();
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
		Vector <RecompensePersonne> liste = new Vector <RecompensePersonne>();
		ArrayList<RecompensePersonne> temp= new ArrayList<RecompensePersonne>();
		try {
			temp = dao.loadInvalideRecompensePersonne();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreRecompensePersonne().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeRecompensePersonne().setListData(liste);
		
	}

}
