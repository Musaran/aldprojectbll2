package metier;

import java.io.Serializable;

public class RoleProducteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Personne personne;
	private Film film;
	private int isValidateRoleProducteur=0;
	
	
	
	
	public RoleProducteur() {
		super();
	}
	public RoleProducteur(Personne personne, Film film,
			int isValidateRoleProducteur) {
		super();
		this.personne = personne;
		this.film = film;
		this.isValidateRoleProducteur = isValidateRoleProducteur;
		personne.getFilmographieProducteur().add(this);
		film.getListeDesProducteurs().add(this);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((film == null) ? 0 : film.hashCode());
		result = prime * result + isValidateRoleProducteur;
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
		RoleProducteur other = (RoleProducteur) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (isValidateRoleProducteur != other.isValidateRoleProducteur)
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
	public int getIsValidateRoleProducteur() {
		return isValidateRoleProducteur;
	}
	public void setIsValidateRoleProducteur(int isValidateRoleProducteur) {
		this.isValidateRoleProducteur = isValidateRoleProducteur;
	}
	
	
}
