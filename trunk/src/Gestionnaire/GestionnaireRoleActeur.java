package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import metier.RoleActeur;

import dao.DAORoleActeur;
import dao.hibernate.DAOHibernateRoleActeur;
/**
 * Classe qui a pour role l'acces à la BDD pour supprimer ou validé les choix de l'admin
 * @author jerome
 *
 */
public class GestionnaireRoleActeur {

	private DAORoleActeur dao;
	public GestionnaireRoleActeur()
	{
		dao= new DAOHibernateRoleActeur();
	}
	
	/**
	 * Fonction qui va supprimer les role acteurs selectionnées 
	 * 
	 * @param liste récupéré par le listener et qui vient de la jlist.
	 */
	public void supprimeRole(ArrayList<RoleActeur> liste)
	{
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleActeur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
				dao.remove(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		refresh();
	}
	
	
	/**
	 * Fonction qui accepte définitevement tous les acteurs
	 */
	public void acceptAll() {
		// TODO Auto-generated method stub
		try {
			ArrayList<RoleActeur> liste = dao.loadActeurInvalide();
			for(int i=0;i<liste.size();i++)
			{
				liste.get(i).setIsValidateRoleActeur(1);
				dao.saveOrUpdate(liste.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refresh();		
	}
	/**
	 * Fonction qui accepte les roles dans la liste
	 * @param liste passé en parametre recup du listener qui lui la recup de la form
	 */
	public void acceptRole(ArrayList<RoleActeur> liste) {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++)
		{
			try {
				RoleActeur temp = dao.get(liste.get(i).getPersonne(), liste.get(i).getFilm());
				temp.setIsValidateRoleActeur(1);
				dao.saveOrUpdate(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		refresh();
		
	}
	/**
	 * Fonction qui supprime toutes les MAJ
	 */
	public void supprimeAll() {
		// TODO Auto-generated method stub
		try {
			ArrayList<RoleActeur> liste = dao.loadActeurInvalide();
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
	
	/**
	 * Fonction qui remplit la liste des acteurs et le nombre de requete a son appel ou a chaque
	 * changement d'onglet
	 */
	public  void refresh() 
	{
		int nombreRequete=0;
		Vector <RoleActeur> liste = new Vector <RoleActeur>();
		ArrayList<RoleActeur> temp= new ArrayList<RoleActeur>();
		try {
			temp = dao.loadActeurInvalide();
			nombreRequete = temp.size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreActeur().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeActeur().setListData(liste);

	}
}
