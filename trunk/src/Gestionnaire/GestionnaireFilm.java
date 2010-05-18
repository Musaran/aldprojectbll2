package Gestionnaire;

import java.util.ArrayList;
import java.util.Vector;

import dao.DAOFilm;
import dao.hibernate.DAOHibernateFilm;
import metier.Film;


public class GestionnaireFilm {
	private DAOFilm dao;
	
	public GestionnaireFilm()
	{
		dao= new DAOHibernateFilm();
	}
	
	/**
	 * Fonction qui va supprimer les films selectionnées 
	 * 
	 * @param liste récupéré par le listener et qui vient de la jlist.
	 */
	public void supprime(ArrayList<Film> liste)
	{
		for(int i=0;i<liste.size();i++)
		{
			try {
				Film temp = dao.get(liste.get(i).getIdFilm());
				dao.remove(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		refresh();
	}
	
	
	/**
	 * Fonction qui accepte définitevement tous les films
	 */
	public void acceptAll() {
		try {
			ArrayList<Film> liste = dao.loadFilmInvalide();
			for(int i=0;i<liste.size();i++)
			{
				if(liste.get(i).getIsValidateFilm()!=0)
				{
					int leModfier = liste.get(i).getIsValidateFilm();
					Film film = dao.get(leModfier);
					film.setAffiche(liste.get(i).getAffiche());
					film.setCout(liste.get(i).getCout());
					film.setDateSortie(liste.get(i).getDateSortie());
					film.setSynopsis(liste.get(i).getSynopsis());
					film.setTitre(liste.get(i).getTitre());
					dao.saveOrUpdate(film);
					dao.remove(liste.get(i));
				}
				else
				{
					liste.get(i).setIsValidateFilm(-1);
					dao.saveOrUpdate(liste.get(i));
				}
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
	public void accept(ArrayList<Film> liste) {
		try {
			for(int i=0;i<liste.size();i++)
			{
				if(liste.get(i).getIsValidateFilm()!=0)
				{
					int leModfier = liste.get(i).getIsValidateFilm();
					Film film = dao.get(leModfier);
					film.setAffiche(liste.get(i).getAffiche());
					film.setCout(liste.get(i).getCout());
					film.setDateSortie(liste.get(i).getDateSortie());
					film.setSynopsis(liste.get(i).getSynopsis());
					film.setTitre(liste.get(i).getTitre());
					dao.saveOrUpdate(film);
					dao.remove(liste.get(i));
				}
				else
				{
					liste.get(i).setIsValidateFilm(-1);
					dao.saveOrUpdate(liste.get(i));
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
			ArrayList<Film> liste = dao.loadFilmInvalide();
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
	 * Fonction qui remplit la liste des films et le nombre de requete a son appel ou a chaque
	 * changement d'onglet
	 */
	public  void refresh() 
	{
		int nombreRequete =0;
		Vector <Film> liste = new Vector <Film>();
		ArrayList<Film> temp= new ArrayList<Film>();
		try {
			temp = dao.loadFilmInvalide();
			nombreRequete = temp.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0; i<temp.size();i++)
			liste.add(temp.get(i));
		
		AffichageGestionnaire.getInstance().getLabelNombreChiffreFilm().setText(Integer.toString(liste.size()) );
		AffichageGestionnaire.getInstance().getListeFilm().setListData(liste);

	}
	
	
}
