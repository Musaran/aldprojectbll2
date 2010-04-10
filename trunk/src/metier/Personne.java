package metier;

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

public class Personne {
	
	///données propre a la personnne
	private int idPersonne;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String biographie;
	private String photo;
	private int nombreRequetes;
	///listes de ces boulots
	private Set<Film> filmographieActeur = new HashSet<Film>();
	private Set<Film> filmographieProducteur = new HashSet<Film>();
	private Set<Film> filmographieRealisateur = new HashSet<Film>();
	/// listes des recompenses
	private Set<RecompensePersonne> listeRecompense = new HashSet<RecompensePersonne>();
	/// données concernant l acceptation
	private int isValidatePersonne;
	
	
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
		if (o instanceof Personne) {
			Personne p = (Personne) o;
			return this.idPersonne == p.idPersonne;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Personne [biographie=" + biographie + ", dateDeNaissance="
				+ dateDeNaissance + ", filmographieActeur="
				+ filmographieActeur + ", filmographieProducteur="
				+ filmographieProducteur + ", filmographieRealisateur="
				+ filmographieRealisateur + ", idPersonne=" + idPersonne
				+ ", isValidatePersonne=" + isValidatePersonne
				+ ", listeRecompense=" + listeRecompense + ", nom=" + nom
				+ ", nombreRequetes=" + nombreRequetes + ", photo=" + photo
				+ ", prenom=" + prenom + "]";
	}
	
	/**
	 * fonction qui ajoute un film auquel la personne aurait participé en tant qu'acteur
	 * @param film
	 */
	public void ajoutFilmActeur(Film f)
	{
		if(!this.rechercheFilm(f, this.filmographieActeur))
			this.filmographieActeur.add(f);
		if(!f.recherchePersonne(this, f.getListDesActeurs()))
			f.getListDesActeurs().add(this);
		
	}
	/**
	 * fonction qui ajoute un film auquel la personne aurait participé en tant que realisateur
	 * @param film
	 */
	public void ajoutFilmRealisateur(Film f)
	{
		if(!this.rechercheFilm(f, this.filmographieRealisateur))
			this.filmographieRealisateur.add(f);
		if(!f.recherchePersonne(this, f.getListeDesRealisateurs()))
			f.getListeDesRealisateurs().add(this);
	}
	/**
	 * fonction qui ajoute un film auquel la personne aurait participé en tant que producteur
	 * @param film
	 */
	public void ajoutFilmProducteur(Film f)
	{
		if(!this.rechercheFilm(f, this.filmographieProducteur))
			this.filmographieProducteur.add(f);
		if(!f.recherchePersonne(this, f.getListeDesProducteurs()))
			f.getListeDesProducteurs().add(this);
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
	public Set<Film> getFilmographieActeur() {
		return filmographieActeur;
	}
	public void setFilmographieActeur(Set<Film> filmographieActeur) {
		this.filmographieActeur = filmographieActeur;
	}
	public Set<Film> getFilmographieProducteur() {
		return filmographieProducteur;
	}
	public void setFilmographieProducteur(Set<Film> filmographieProducteur) {
		this.filmographieProducteur = filmographieProducteur;
	}
	public Set<Film> getFilmographieRealisateur() {
		return filmographieRealisateur;
	}
	public void setFilmographieRealisateur(Set<Film> filmographieRealisateur) {
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
