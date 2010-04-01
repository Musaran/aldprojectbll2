package metier;

import java.awt.Image;
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

public class Film {

	/// données propre au film
	private int idFilm;
	private String titre;
	private Date dateSortie;
	private String affiche;
	private double cout;
	private String synopsis;
	private int nombreRequetes;
	/// données concernant les membres de l'équipe
	private Set<Personne> listeDesActeurs = new HashSet<Personne>();
	private Set<Personne> listeDesRealisateurs = new HashSet<Personne>();
	private Set<Personne> listeDesProducteurs = new HashSet<Personne>();
	/// données concernant les recompense
	private Set<RecompenseFilm> listeRecompense = new HashSet<RecompenseFilm>();
	/// données concernant la note du film (moyenne de tous les votes)
	private double noteMoyenne;
	/// données concernant l acceptation
	private int isValidateFilm;
	
	
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
	public Film( String titre, Date sortie, double cout, String synopsis, int requete)
	{
		this.titre = titre;
		this.dateSortie = sortie;
		this.cout = cout;
		this.synopsis = synopsis;
		this.nombreRequetes = requete;
	}
	
	@Override
	public String toString() {
		return "Film [cout=" + cout + ", dateSortie=" + dateSortie
				+ ", idFilm=" + idFilm + ", isValidateFilm=" + isValidateFilm
				+ ", listDesActeurs=" + listeDesActeurs
				+ ", listeDesProducteurs=" + listeDesProducteurs
				+ ", listeDesRealisateurs=" + listeDesRealisateurs
				+ ", listeRecompense=" + listeRecompense + ", nombreRequetes="
				+ nombreRequetes + ", noteMoyenne=" + noteMoyenne
				+ ", synopsis=" + synopsis + ", titre=" + titre + "]";
	}
	
	/**
	 * Les films sont égaux s'ils ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Film) {
			Film p = (Film) o;
			return (this.idFilm == p.idFilm);
		}
		else
			return false;
	}
	/**
	 * Permet d'ajouter un acteur à un film
	 * @param p personne à ajouter
	 */
	public void ajoutPersonneActeur(Personne p)
	{
		if(!this.recherchePersonne(p, this.listeDesActeurs))
			this.listeDesActeurs.add(p);
		if(!(p.rechercheFilm(this, p.getFilmographieActeur())))
			p.getFilmographieActeur().add(this);		
	}
	/**
	 * Permet d'ajouter un realisateur à un film
	 * @param p personne à ajouter
	 */
	public void ajoutPersonneRealisateur(Personne p)
	{
		if(!this.recherchePersonne(p, this.listeDesRealisateurs))
			this.listeDesRealisateurs.add(p);
		if(!(p.rechercheFilm(this, p.getFilmographieRealisateur())))
			p.getFilmographieRealisateur().add(this);		
	}
	/**
	 * Permet d'ajouter un producteur à un film
	 * @param p personne à ajouter
	 */
	public void ajoutPersonneProducteur(Personne p)
	{
		if(!this.recherchePersonne(p, this.listeDesProducteurs))
			this.listeDesProducteurs.add(p);
		if(!(p.rechercheFilm(this, p.getFilmographieProducteur())))
			p.getFilmographieProducteur().add(this);		
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
	public Set<Personne> getListDesActeurs() {
		return listeDesActeurs;
	}
	public void setListDesActeurs(Set<Personne> listDesActeurs) {
		this.listeDesActeurs = listDesActeurs;
	}
	public Set<Personne> getListeDesRealisateurs() {
		return listeDesRealisateurs;
	}
	public void setListeDesRealisateurs(Set<Personne> listeDesRealisateurs) {
		this.listeDesRealisateurs = listeDesRealisateurs;
	}
	public Set<Personne> getListeDesProducteurs() {
		return listeDesProducteurs;
	}
	public void setListeDesProducteurs(Set<Personne> listeDesProducteurs) {
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
	
	
}
