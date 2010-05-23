package metier;

import java.io.Serializable;

/**
 * 
 * @author jerome
 * Un film est recompensé par une Recompense (oscar etc..) et un TypeRecompenseFilm (meilleur film...)
 *
 */

public class TypeRecompenseFilm  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///données concernant les Type de recompenses pour les films 
	private int idTypeRecompenseFilm;
	private String nomTypeRecompenseFilm="";
	
	/**
	 * Constructeur par défaut
	 */
	public TypeRecompenseFilm() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur sans l'id
	 * @param nomTypeRecopenseFilm
	 */
	public TypeRecompenseFilm(String nomTypeRecompenseFilm) {
		super();
		this.nomTypeRecompenseFilm = nomTypeRecompenseFilm;
	}
	/**
	 * Constructeur complet
	 * @param idTypeRecompenseFilm
	 * @param nomTypeRecompenseFilm
	 */
	public TypeRecompenseFilm(int idTypeRecompenseFilm,
			String nomTypeRecompenseFilm) {
		super();
		this.idTypeRecompenseFilm = idTypeRecompenseFilm;
		this.nomTypeRecompenseFilm = nomTypeRecompenseFilm;
	}
	
	/**
	 * Les recompenses sont égales si elles ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof TypeRecompenseFilm) {
			TypeRecompenseFilm p = (TypeRecompenseFilm) o;
			return this.idTypeRecompenseFilm == p.idTypeRecompenseFilm;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		return nomTypeRecompenseFilm ;
	}

	
	
	
	/*
	 * Getters and setters
	 */
	
	
	public int getIdTypeRecompenseFilm() {
		return idTypeRecompenseFilm;
	}
	public void setIdTypeRecompenseFilm(int idTypeRecompenseFilm) {
		this.idTypeRecompenseFilm = idTypeRecompenseFilm;
	}
	public String getNomTypeRecompenseFilm() {
		return nomTypeRecompenseFilm;
	}
	public void setNomTypeRecompenseFilm(String nomTypeRecompenseFilm) {
		this.nomTypeRecompenseFilm = nomTypeRecompenseFilm;
	}
	

	
}
