package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import metier.RoleRealisateur;

import dao.DAORoleRealisateur;
import dao.hibernate.DAOHibernateRoleRealisateur;

public class GestionnaireRoleRealisateur {

	private DAORoleRealisateur dao;
	public GestionnaireRoleRealisateur()
	{
		dao= new DAOHibernateRoleRealisateur();
	}
	
	/**
	 * Fonction qui va supprimer les role acteurs selectionnées 
	 * 
	 * @param liste récupéré par le listener et qui vient de la jlist.
	 */
	public void supprimeRole(ArrayList<RoleRealisateur> liste)
	{
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleRealisateur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
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
			ArrayList<RoleRealisateur> liste = dao.loadRealisateurInvalide();
			for(int i=0;i<liste.size();i++)
			{
				liste.get(i).setIsValidateRoleRealisateur(-1);
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
	public void acceptRole(ArrayList<RoleRealisateur> liste) {
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleRealisateur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
				temp.setIsValidateRoleRealisateur(-1);
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
			ArrayList<RoleRealisateur> liste = dao.loadRealisateurInvalide();
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
		int nombreRequete=0;
		Vector <RoleRealisateur> liste = new Vector <RoleRealisateur>();
		ArrayList<RoleRealisateur> temp= new ArrayList<RoleRealisateur>();
		try {
			temp = dao.loadRealisateurInvalide();
			nombreRequete = temp.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreRealisateur().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeRealisateur().setListData(liste);

	}
}
