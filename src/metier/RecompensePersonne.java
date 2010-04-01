package metier;

/**
 * 
 * @author jerome
 * La classe qui fait la jointure entre la récompense et une Personne
 * Elle stocke la récompense qu'une personne a obtenue
 *
 */

public class RecompensePersonne {
	
	///données concernant les recompenses d'une personne
	private Personne personne;
	private Recompense recompense;
	private TypeRecompensePersonne typeRecompense;
	private int annee;
	/// données concernant l acceptation
	private int isValidateRecompense;
	
	
	public RecompensePersonne() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur complet
	 * @param personne
	 * @param recompense
	 * @param typeRecompense
	 * @param annee
	 */
	public RecompensePersonne(Personne personne, Recompense recompense,
			TypeRecompensePersonne typeRecompense, int annee) {
		super();
		this.personne = personne;
		this.recompense = recompense;
		this.typeRecompense = typeRecompense;
		this.annee = annee;
	}
	@Override
	public String toString() {
		return "RecompensePersonne [annee=" + annee + ", isValidateRecompense="
				+ isValidateRecompense + ", personne=" + personne
				+ ", recompense=" + recompense + ", typeRecompense="
				+ typeRecompense + "]";
	}
	/**
	 * Les recompenses sont égales si tous les champs sont égaux
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof RecompensePersonne) {
			RecompensePersonne p = (RecompensePersonne) o;
			return (this.personne.equals(p.personne)&&this.recompense.equals(p.recompense)&&this.typeRecompense.equals(p.typeRecompense)&&this.annee==p.annee);
		}
		else
			return false;
	}
	/*
	 * Getters and setters
	 */
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Recompense getRecompense() {
		return recompense;
	}
	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}
	public TypeRecompensePersonne getTypeRecompense() {
		return typeRecompense;
	}
	public void setTypeRecompense(TypeRecompensePersonne typeRecompense) {
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
