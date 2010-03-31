package metier;

import java.util.Iterator;
import java.util.Set;


/**
 * 
 * @author jerome
 * C'est la classe qui stocke la note qu'un Professionnel à donné à un Film
 *
 */

public class Vote {
	///données concernant les vote (notes des pros)
	private Film film;
	private Professionnel professionnel;
	private int note;
	
	/**
	 * Constructeur complet
	 * @param film
	 * @param professionnel
	 * @param note
	 */
	public Vote(Film film, Professionnel professionel, int note) {
		super();
		this.film = film;
		this.professionnel = professionel;
		this.note = note;
	}
	/**
	 * Les votes sont égaux s'ils concernent le mm film et le mm pro
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Vote) {
			Vote p = (Vote) o;
			return ((this.film.equals(p.film))&&(this.professionnel.equals(p.professionnel)));
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return "Vote [film=" + film + ", note=" + note + ", professionel="
				+ professionnel + "]";
	}
	
	public boolean rechercheVote(Set<Vote> liste)
	{
		Iterator<Vote> i=liste.iterator();
		while(i.hasNext())
		{
			Vote v=i.next();
			if(this.equals(v))
			{
				System.out.println("existe deja");
				return true;
			}
		}
		System.out.println("n'existe pas");
		return false;
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
	public void setProfessionnel(Professionnel professionel) {
		this.professionnel = professionel;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Professionnel getProfessionnel() {
		return professionnel;
	}
	
	

}
