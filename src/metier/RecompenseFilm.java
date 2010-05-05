package metier;

import java.io.Serializable;

/**
 * 
 * @author jerome
 * La classe qui fait la jointure entre la récompense et un film
 * Elle stocke la récompense qu'un film a obtenu
 *
 */

public class RecompenseFilm implements Serializable {


	/**
	 * Données membres
	 */
	private static final long serialVersionUID = 1L;
	///données concernant les recompenses d'un film
	private Film film;
	private Recompense recompense;
	private TypeRecompenseFilm typeRecompense;
	private int annee;
	/// données concernant l acceptation
	private int isValidateRecompense=0;
	
	/**
	 * Constructeur par défaut
	 */
	public RecompenseFilm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur complet
	 * @param film
	 * @param recompense
	 * @param typeRecompense
	 * @param annee
	 */
	
	public RecompenseFilm(Film film, Recompense recompense,
			TypeRecompenseFilm typeRecompense, int annee) {
		super();
		this.film = film;
		this.recompense = recompense;
		this.typeRecompense = typeRecompense;
		this.annee = annee;
	}
	
	/**
	 * Les recompenses sont égales si tous les champs sont égaux
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof RecompenseFilm) {
			RecompenseFilm p = (RecompenseFilm) o;
			return (this.film.equals(p.film)&&this.recompense.equals(p.recompense)&&this.typeRecompense.equals(p.typeRecompense)&&this.annee==p.annee);
		}
		else
			return false;
	}
	/**
	 * Methode qui convertit l'objet en string
	 */
	@Override
	public String toString() {
		return "RecompenseFilm [annee=" + annee + ", film=" + film
				+ ", isValidateRecompense=" + isValidateRecompense
				+ ", recompense=" + recompense + ", typeRecompense="
				+ typeRecompense + "]";
	}
	/*
	 * Getters and setters
	 */
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Recompense getRecompense() {
		return recompense;
	}
	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}
	public TypeRecompenseFilm getTypeRecompense() {
		return typeRecompense;
	}
	public void setTypeRecompense(TypeRecompenseFilm typeRecompense) {
		this.typeRecompense = typeRecompense;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getIsValidateRecompense() {
		return isValidateRecompense;
	}
	public void setIsValidateRecompense(int isValidateRecompense) {
		this.isValidateRecompense = isValidateRecompense;
	}
	
	/*
	 * Constructeur
	 */
}
