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
 * Le nom de la classe parle d'elle même./!\ Pro != Personne
 *
 */

public class Personne implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///données propre a la personnne
	private int idPersonne;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String biographie;
	private String photo;
	private int nombreRequetes;
	///listes de ces boulots
	private Set<RoleActeur> filmographieActeur = new HashSet<RoleActeur>();
	private Set<RoleProducteur> filmographieProducteur = new HashSet<RoleProducteur>();
	private Set<RoleRealisateur> filmographieRealisateur = new HashSet<RoleRealisateur>();
	/// listes des recompenses
	private Set<RecompensePersonne> listeRecompense = new HashSet<RecompensePersonne>();
	/// données concernant l acceptation
	private int isValidatePersonne=0;

	
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructeur avec tous les paramêtres
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param biographie
	 * @param photo
	 * @param nombreRequetes
	 */
	public Personne(int idPersonne, String nom, String prenom,
			Date dateDeNaissance, String biographie, String photo,
			int nombreRequetes) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.biographie = biographie;
		this.photo = photo;
		this.nombreRequetes = nombreRequetes;
	}
	
	
	/**
	 * Constructeur sans l'id
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param biographie
	 * @param photo
	 * @param nombreRequetes
	 */
	public Personne(String nom, String prenom, Date dateDeNaissance,
			String biographie, String photo, int nombreRequetes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.biographie = biographie;
		this.photo = photo;
		this.nombreRequetes = nombreRequetes;
	}
	
	/**
	 * Les personnes sont égales si elles ont le même id
	 */
	public boolean	equals(Object o)
	{
		System.out.println("ils ne sont pas égaux");

		if (o instanceof Personne) {
			Personne p = (Personne) o;
			return this.idPersonne == p.idPersonne;
		}
		else
			return false;
	}
	
	@Override
	/**
	 * Methode de conversion de l'objet en string
	 */
	public String toString() {
		return nom+" "+prenom+" date de naissance "+ dateDeNaissance+" biographie "+biographie+" nb requete "+nombreRequetes+ " valide : " +isValidatePersonne+ "photo:" +photo;
	}
	

	
	/**
	 * fonction qui recherche un film dans une liste
	 * @param film recherché
	 * @param liste de recherche
	 * @return boolean true si trouve false sinon
	 */
	public boolean rechercheFilm(Film f, Set<Film> liste)
	{
		Iterator<Film> i=liste.iterator();
		while(i.hasNext())
		{
			if(i.equals(f))
				return true;
			i.next();
		}
		return false;
	}
	
	/**
	 * permet d'ajouter une recompense
	 * @param r la recompense (oscar)
	 * @param t le type de la recompense(meilleur acteur)
	 * @param annee
	 */
	public void ajoutRecompense(Recompense r, TypeRecompensePersonne t, int annee)
	{
		RecompensePersonne temp= new RecompensePersonne(this, r, t, annee);
		this.listeRecompense.add(temp);
	}
	
	public ArrayList<Film> listeDesFilmActeur()
	{
		ArrayList<Film> tab = new ArrayList<Film>();
		Iterator<RoleActeur> i=this.filmographieActeur.iterator();
		while(i.hasNext())
		{
			RoleActeur a = i.next();
			if(a.getIsValidateRoleActeur()==-1)
				tab.add(a.getFilm());
			
		}
		return tab;
	}
	
	public ArrayList<Film> listeDesFilmRealisateur()
	{
		ArrayList<Film> tab = new ArrayList<Film>();
		Iterator<RoleRealisateur> i=this.filmographieRealisateur.iterator();
		while(i.hasNext())
		{
			RoleRealisateur a = i.next();
			if(a.getIsValidateRoleRealisateur()==-1)
				tab.add(a.getFilm());
			
		}
		return tab;
	}
	
	public ArrayList<Film> listeDesFilmProducteur()
	{
		ArrayList<Film> tab = new ArrayList<Film>();
		Iterator<RoleProducteur> i=this.filmographieProducteur.iterator();
		while(i.hasNext())
		{
			RoleProducteur a = i.next();
			if(a.getIsValidateRoleProducteur()==-1)
				tab.add(a.getFilm());
			
		}
		return tab;
	}


	/*
	 * Getters and setters
	 */
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getBiographie() {
		return biographie;
	}
	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getNombreRequetes() {
		return nombreRequetes;
	}
	public void setNombreRequetes(int nombreRequetes) {
		this.nombreRequetes = nombreRequetes;
	}
	public Set<RoleActeur> getFilmographieActeur() {
		return filmographieActeur;
	}
	public void setFilmographieActeur(Set<RoleActeur> filmographieActeur) {
		this.filmographieActeur = filmographieActeur;
	}
	public Set<RoleProducteur> getFilmographieProducteur() {
		return filmographieProducteur;
	}
	public void setFilmographieProducteur(Set<RoleProducteur> filmographieProducteur) {
		this.filmographieProducteur = filmographieProducteur;
	}
	public Set<RoleRealisateur> getFilmographieRealisateur() {
		return filmographieRealisateur;
	}
	public void setFilmographieRealisateur(Set<RoleRealisateur> filmographieRealisateur) {
		this.filmographieRealisateur = filmographieRealisateur;
	}
	public Set<RecompensePersonne> getListeRecompense() {
		return listeRecompense;
	}
	public void setListeRecompense(Set<RecompensePersonne> listeRecompense) {
		this.listeRecompense = listeRecompense;
	}
	public int getIsValidatePersonne() {
		return isValidatePersonne;
	}
	public void setIsValidatePersonne(int isValidatePersonne) {
		this.isValidatePersonne = isValidatePersonne;
	}

}
