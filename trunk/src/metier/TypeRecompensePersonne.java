package metier;

import java.io.Serializable;

/**
 * 
 * @author jerome
 * Une personne est recompensé par une Recompense (oscar etc..) et un TypeRecompensePersonne (meilleur acteur...)
 *
 */

public class TypeRecompensePersonne  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///données concernant les Type de recompenses pour les personnes 
	private int idTypeRecompensePersonne;
	private String nomTypeRecompensePersonne;
	
	/**
	 * Constructeur par défaut
	 */
	public TypeRecompensePersonne() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur sans l'id
	 * @param nomTypeRecompensePersonne
	 */
	public TypeRecompensePersonne(String nomTypeRecompensePersonne) {
		super();
		this.nomTypeRecompensePersonne = nomTypeRecompensePersonne;
	}
	/**
	 * Constructeur complet
	 * @param idTypeRecompensePersonne
	 * @param nomTypeRecompensePersonne
	 */
	public TypeRecompensePersonne(int idTypeRecompensePersonne,
			String nomTypeRecompensePersonne) {
		super();
		this.idTypeRecompensePersonne = idTypeRecompensePersonne;
		this.nomTypeRecompensePersonne = nomTypeRecompensePersonne;
	}
	/**
	 * Les recompenses sont égales si elles ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof TypeRecompensePersonne) {
			TypeRecompensePersonne p = (TypeRecompensePersonne) o;
			return this.idTypeRecompensePersonne == p.idTypeRecompensePersonne;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return nomTypeRecompensePersonne;
	}
	/*
	 * Getters and setters
	 */
	
	
	public int getIdTypeRecompensePersonne() {
		return idTypeRecompensePersonne;
	}
	public void setIdTypeRecompensePersonne(int idTypeRecompensePersonne) {
		this.idTypeRecompensePersonne = idTypeRecompensePersonne;
	}
	public String getNomTypeRecompensePersonne() {
		return nomTypeRecompensePersonne;
	}
	public void setNomTypeRecompensePersonne(String nomTypeRecompensePersonne) {
		this.nomTypeRecompensePersonne = nomTypeRecompensePersonne;
	}
	
	

}
