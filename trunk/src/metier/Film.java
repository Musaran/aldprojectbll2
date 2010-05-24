package metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author jerome
 * Le nom de la classe parle d'elle meme
 *
 */

public class Film implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Données membres
	 */
	
	/// données propre au film
	private int idFilm;
	private String titre;
	private Date dateSortie;
	private String affiche;
	private double cout;
	private String synopsis;
	private int nombreRequetes;
	/// données concernant les membres de l'équipe
	private Set<RoleActeur> listDesActeurs = new HashSet<RoleActeur>();
	private Set<RoleRealisateur> listeDesRealisateurs = new HashSet<RoleRealisateur>();
	private Set<RoleProducteur> listeDesProducteurs = new HashSet<RoleProducteur>();
	/// données concernant les recompense
	private Set<RecompenseFilm> listeRecompense = new HashSet<RecompenseFilm>();
	/// données concernant la note du film (moyenne de tous les votes)
	private double noteMoyenne;
	/// données concernant l acceptation
	private int isValidateFilm=0;
	private String urlAffiche;
	
	/**
	 * Constructeur par défaut
	 */
	public Film() {

	}

	/**
	 * Constructeur avec tous les champs
	 * @param id
	 * @param titre
	 * @param sortie
	 * @param cout
	 * @param synopsis
	 * @param requete
	 */
	public Film(int id, String titre, Date sortie, double cout, String synopsis, int requete)
	{
		this.idFilm = id;
		this.titre = titre;
		this.dateSortie = sortie;
		this.cout = cout;
		this.synopsis = synopsis;
		this.nombreRequetes = requete;
	}
	
	/**
	 * Constructeur sans l'id
	 * @param titre
	 * @param sortie
	 * @param cout
	 * @param synopsis
	 * @param requete
	 */
	public Film( String titre, Date sortie, double cout, String synopsis, int requete, String photo, String url)
	{
		this.titre = titre;
		this.dateSortie = sortie;
		this.cout = cout;
		this.synopsis = synopsis;
		this.nombreRequetes = requete;
		this.affiche = photo;
		this.urlAffiche=url;
		
	}
	
	/**
	 * Methode qui permet de transformer en chaine de caractere
	 */
	
	//methode toString plus lisible dans le client lourd
	@Override
	public String toString() {
		return this.getTitre()+" "+this.getDateSortie()+" (id="+this.getIdFilm()+")"+" Cout:"+
		this.getCout()+" Note moyenne: " + this.getNoteMoyenne() +" Nombre requetes: "+this.getNombreRequetes()+" valide: "+this.getIsValidateFilm()+" affiche: "+this.getAffiche();
		
	}
	
	/**
	 * Les films sont égaux s'ils ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Film) {
			Film p = (Film) o;
			return this.idFilm == p.idFilm;
			
		}
		else
			return false;
	}

	
	/**
	 * Fonction qui recherche une personne à partir d'une liste
	 * @param p personne a cherché
	 * @param liste liste de recherche
	 * @return boolean true si trouvé false sinon
	 */
	public boolean recherchePersonne(Personne p, Set<Personne>liste)
	{
		Iterator<Personne> i = liste.iterator();
		while(i.hasNext())
		{
			if(i.equals(p))
				return true;
			i.next();
		}
		return false;
	}
	
	/**
	 * permet d'ajouter une recompense
	 * @param r la recompense (oscar)
	 * @param t le type de la recompense(meilleur film)
	 * @param annee
	 */
	public void ajoutRecompense(Recompense r, TypeRecompenseFilm t, int annee)
	{
		RecompenseFilm temp= new RecompenseFilm(this, r, t, annee);
		this.listeRecompense.add(temp);
	}
	
	
	/**
	 * fonction qui calcule et attribu la note moyenne à un film
	 * @param film que le veut noter
	 * @param liste des notes
	 */
	
	public void calculNoteMoyenne(ArrayList<Vote> liste)
	{
		Iterator<Vote> i=liste.iterator();
		int note =0;
		int compteur=0;
		while(i.hasNext())
		{
			Vote v=i.next();
			if(v!=null)
			{
				if(v.getFilm().equals(this))
				{
					note+=v.getNote();	
					compteur++;
				}
			}
		}
		this.setNoteMoyenne((note*1.0/compteur*1.0));
	}
	
	public ArrayList<Personne> listeDesActeurs()
	{
		ArrayList<Personne> tab = new ArrayList<Personne>();
		Iterator<RoleActeur> i=this.listDesActeurs.iterator();
		while(i.hasNext())
		{
			RoleActeur a = i.next();
			if(a.getIsValidateRoleActeur()==-1)
				tab.add(a.getPersonne());
			
		}
		return tab;
	}
	
	public ArrayList<Personne> listeDesProducteurs()
	{
		ArrayList<Personne> tab = new ArrayList<Personne>();
		Iterator<RoleProducteur> i=this.listeDesProducteurs.iterator();
		while(i.hasNext())
		{
			RoleProducteur a = i.next();
			if(a.getIsValidateRoleProducteur()==-1)
				tab.add(a.getPersonne());
			
		}
		return tab;
	}
	
	public ArrayList<Personne> listeDesRealisateurs()
	{
		ArrayList<Personne> tab = new ArrayList<Personne>();
		Iterator<RoleRealisateur> i=this.listeDesRealisateurs.iterator();
		while(i.hasNext())
		{
			RoleRealisateur a = i.next();
			if(a.getIsValidateRoleRealisateur()==-1)
				tab.add(a.getPersonne());
			
		}
		return tab;
	}
	
	/*
	 * Getters and setters
	 */

	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getAffiche() {
		return affiche;
	}
	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public int getNombreRequetes() {
		return nombreRequetes;
	}
	public void setNombreRequetes(int nombreRequetes) {
		this.nombreRequetes = nombreRequetes;
	}
	public Set<RoleActeur> getListDesActeurs() {
		return listDesActeurs;
	}
	public void setListDesActeurs(Set<RoleActeur> listDesActeurs) {
		this.listDesActeurs = listDesActeurs;
	}
	public Set<RoleRealisateur> getListeDesRealisateurs() {
		return listeDesRealisateurs;
	}
	public void setListeDesRealisateurs(Set<RoleRealisateur> listeDesRealisateurs) {
		this.listeDesRealisateurs = listeDesRealisateurs;
	}
	public Set<RoleProducteur> getListeDesProducteurs() {
		return listeDesProducteurs;
	}
	public void setListeDesProducteurs(Set<RoleProducteur> listeDesProducteurs) {
		this.listeDesProducteurs = listeDesProducteurs;
	}
	public Set<RecompenseFilm> getListeRecompense() {
		return listeRecompense;
	}
	public void setListeRecompense(Set<RecompenseFilm> listeRecompense) {
		this.listeRecompense = listeRecompense;
	}
	public double getNoteMoyenne() {
		return noteMoyenne;
	}
	public void setNoteMoyenne(double noteMoyenne) {
		this.noteMoyenne = noteMoyenne;
	}
	public int getIsValidateFilm() {
		return isValidateFilm;
	}
	public void setIsValidateFilm(int isValidateFilm) {
		this.isValidateFilm = isValidateFilm;
	}

	public String getUrlAffiche() {
		return urlAffiche;
	}

	public void setUrlAffiche(String urlAffiche) {
		this.urlAffiche = urlAffiche;
	}
	
	
}
