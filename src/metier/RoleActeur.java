package metier;

import java.io.Serializable;

/**
 * 
 * @author jerome
 * Classe qui stock les roles des acteurs
 */
public class RoleActeur implements Serializable {
	private Personne personne;
	private Film film;
	private int isValidateRoleActeur=0;
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Constructeur par défaut
	 */
	
	
	public RoleActeur() {
		super();
	}
	@Override
	public String toString() {
		return personne.getNom()+" "+personne.getPrenom()+" (id="+personne.getIdPersonne()+")a joué dans "+
		film.getTitre()+" (id="+film.getIdFilm()+")";
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleActeur other = (RoleActeur) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (isValidateRoleActeur != other.isValidateRoleActeur)
			return false;
		if (personne == null) {
			if (other.personne != null)
				return false;
		} else if (!personne.equals(other.personne))
			return false;
		return true;
	}
	public RoleActeur(Personne personne, Film film, int isValidateRoleActeur) {
		super();
		this.personne = personne;
		this.film = film;
		this.isValidateRoleActeur = isValidateRoleActeur;
		personne.getFilmographieActeur().add(this);
		film.getListDesActeurs().add(this);
	}
	
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public int getIsValidateRoleActeur() {
		return isValidateRoleActeur;
	}
	public void setIsValidateRoleActeur(int isValidateRoleActeur) {
		this.isValidateRoleActeur = isValidateRoleActeur;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
