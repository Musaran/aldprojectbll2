package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import metier.RoleActeur;

import dao.DAORoleActeur;
import dao.hibernate.DAOHibernateRoleActeur;

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
