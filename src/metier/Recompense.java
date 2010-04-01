package metier;

/**
 * 
 * @author jerome
 * La classe qui contient le type de recompense type Oscar etc..
 *
 */

public class Recompense {
	
	///données des recompenses
	private int idRecompense;
	private String nomRecompense;
	
	
	public Recompense() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur complet
	 * @param idRecompense
	 * @param nomRecompense
	 */
	public Recompense(int idRecompense, String nomRecompense) {
		super();
		this.idRecompense = idRecompense;
		this.nomRecompense = nomRecompense;
	}
	
	/**
	 * Constructeur sans l'id
	 * @param nomRecompense
	 */
	public Recompense(String nomRecompense) {
		super();
		this.nomRecompense = nomRecompense;
	}
	
	/**
	 * Les recompenses sont égales si elles ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Recompense) {
			Recompense p = (Recompense) o;
			return this.idRecompense == p.idRecompense;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Recompense [idRecompense=" + idRecompense + ", nomRecompense="
				+ nomRecompense + "]";
	}

	/*
	 * Getters and setters
	 */
	
	
	public int getIdRecompense() {
		return idRecompense;
	}
	public void setIdRecompense(int idRecompense) {
		this.idRecompense = idRecompense;
	}
	public String getNomRecompense() {
		return nomRecompense;
	}
	public void setNomRecompense(String nomRecompense) {
		this.nomRecompense = nomRecompense;
	}
	

}
