package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import dao.DAORoleProducteur;
import dao.hibernate.DAOHibernateRoleProducteur;
import metier.RoleProducteur;


public class GestionnaireRoleProducteur {
	private DAORoleProducteur dao;
	
	public GestionnaireRoleProducteur()
	{
		dao= new DAOHibernateRoleProducteur();
	}

	public void supprimeRole(ArrayList<RoleProducteur> liste)
	{
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleProducteur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
				dao.remove(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		refresh();
	}
	
	
	/**
	 * Fonction qui accepte définitevement tous les producteurs
	 */
	public void acceptAll() {
		try {
			ArrayList<RoleProducteur> liste = dao.loadProducteurInvalide();
			for(int i=0;i<liste.size();i++)
			{
				liste.get(i).setIsValidateRoleProducteur(-1);
				dao.saveOrUpdate(liste.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh();		
	}
	/**
	 * Fonction qui accepte les roles dans la liste
	 * @param liste passé en parametre recup du listener qui lui la recup de la form
	 */
	public void acceptRole(ArrayList<RoleProducteur> liste) {
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleProducteur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
				temp.setIsValidateRoleProducteur(-1);
				dao.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}
	/**
	 * Fonction qui supprime toutes les MAJ
	 */
	public void supprimeAll() {
		try {
			ArrayList<RoleProducteur> liste = dao.loadProducteurInvalide();
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
	 * Fonction qui remplit la liste des producteurs et le nombre de requete a son appel ou a chaque
	 * changement d'onglet
	 */
	public  void refresh() 
	{
		int nombreRequete =0;
		Vector <RoleProducteur> liste = new Vector <RoleProducteur>();
		ArrayList<RoleProducteur> temp= new ArrayList<RoleProducteur>();
		try {
			temp = dao.loadProducteurInvalide();
			nombreRequete = temp.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreProducteur().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeProducteur().setListData(liste);

	}
	
	
}
