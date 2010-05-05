package metier;

import java.io.Serializable;
/**
 * 
 * @author jerome
 * Classe qui stock les realisateurs
 */
public class RoleRealisateur implements Serializable {
	private Personne personne;
	private Film film;
	private int isValidateRoleRealisateur=0;
	private static final long serialVersionUID = 1L;
	
	
	
	/**
	 * Constructeur par défaut
	 */
	public RoleRealisateur() {
		super();
	}
	
	public RoleRealisateur(Personne personne, Film film,
			int isValidateRoleActeur) {
		super();
		this.personne = personne;
		this.film = film;
		this.isValidateRoleRealisateur = isValidateRoleActeur;
		personne.getFilmographieRealisateur().add(this);
		film.getListeDesRealisateurs().add(this);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((film == null) ? 0 : film.hashCode());
		result = prime * result + isValidateRoleRealisateur;
		result = prime * result
				+ ((personne == null) ? 0 : personne.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleRealisateur other = (RoleRealisateur) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (isValidateRoleRealisateur != other.isValidateRoleRealisateur)
			return false;
		if (personne == null) {
			if (other.personne != null)
				return false;
		} else if (!personne.equals(other.personne))
			return false;
		return true;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public int getIsValidateRoleRealisateur() {
		return isValidateRoleRealisateur;
	}
	public void setIsValidateRoleRealisateur(int isValidateRoleRealisateur) {
		this.isValidateRoleRealisateur = isValidateRoleRealisateur;
	}
	
	

}
