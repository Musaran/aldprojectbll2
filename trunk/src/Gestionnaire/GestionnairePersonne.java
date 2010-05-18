package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import metier.Personne;

import dao.DAOPersonne;
import dao.hibernate.DAOHibernatePersonne;

public class GestionnairePersonne {

	private DAOPersonne dao;
	public GestionnairePersonne()
	{
		dao= new DAOHibernatePersonne();
	}
	
	/**
	 * Fonction qui va supprimer les role acteurs selectionnées 
	 * 
	 * @param liste récupéré par le listener et qui vient de la jlist.
	 */
	public void supprime(ArrayList<Personne> liste)
	{
		for(int i=0;i<liste.size();i++)
		{
			try {
				Personne temp = dao.get(liste.get(i).getIdPersonne());
				dao.remove(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		refresh();
	}
	
	public void acceptAll() {
		try {
			ArrayList<Personne> liste = dao.loadInvalidePersonne();
			for(int i=0;i<liste.size();i++)
			{
				if(liste.get(i).getIsValidatePersonne()!=0)
				{
					int leModifier = liste.get(i).getIsValidatePersonne();
					Personne personne = dao.get(leModifier);
					personne.setBiographie(liste.get(i).getBiographie());
					personne.setNom(liste.get(i).getNom());
					personne.setPhoto(liste.get(i).getPhoto());
					personne.setPrenom(liste.get(i).getPrenom());
					personne.setDateDeNaissance(liste.get(i).getDateDeNaissance());
					dao.saveOrUpdate(personne);
					dao.remove(liste.get(i));
				}
				else
				{
					liste.get(i).setIsValidatePersonne(-1);
					dao.saveOrUpdate(liste.get(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh();		
	}

	public void accept(ArrayList<Personne> liste) {
		try {
			for(int i=0;i<liste.size();i++)
			{
				if(liste.get(i).getIsValidatePersonne()!=0)
				{
					int leModifier = liste.get(i).getIsValidatePersonne();
					Personne personne = dao.get(leModifier);
					personne.setBiographie(liste.get(i).getBiographie());
					personne.setNom(liste.get(i).getNom());
					personne.setPhoto(liste.get(i).getPhoto());
					personne.setPrenom(liste.get(i).getPrenom());
					personne.setDateDeNaissance(liste.get(i).getDateDeNaissance());
					
					dao.saveOrUpdate(personne);
					dao.remove(liste.get(i));
				}
				else
				{					
						Personne temp = dao.get(liste.get(i).getIdPersonne());
						temp.setIsValidatePersonne(1);
						dao.saveOrUpdate(temp);
				} 
			}
		}catch (Exception e) {
					e.printStackTrace();
			}
		
		refresh();
		
	}
	/**
	 * Fonction qui supprime toutes les MAJ
	 */
	public void supprimeAll() {
		try {
			ArrayList<Personne> liste = dao.loadInvalidePersonne();
			for(int i=0;i<liste.size();i++)
			{				
				dao.remove(liste.get(i));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		refresh();	
	}
	
	/**
	 * Fonction qui remplit la liste des acteurs et le nombre de requete a son appel ou a chaque
	 * changement d'onglet
	 */
	public  void refresh() 
	{
		int nombreRequete =0;
		Vector <Personne> liste = new Vector <Personne>();
		ArrayList<Personne> temp= new ArrayList<Personne>();
		try {
			temp = dao.loadInvalidePersonne();
			nombreRequete = temp.size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffrePersonne().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListePersonne().setListData(liste);

	}
}
