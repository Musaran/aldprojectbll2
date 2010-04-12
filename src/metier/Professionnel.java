package metier;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author jerome
 * Les professionnels sont les internautes inscrits qui peuvent ajouter/modifier un(e) Personne/Film
 * Ils ont aussi le pouvoir de voter pour un film
 * 
 *
 */

public class Professionnel {
	
	///données propres au professionnel
	private String login;
	private String password;
	private Date derniereConnexion;
	private String nom;
	private String prenom;
	private String adresse;
	///la liste des votes deja effectués par le professionel
	private Set<Vote> votes = new HashSet<Vote>();
	
	
	public void setVotes(Set<Vote> votes) {
		this.votes = votes;
	}
	public Professionnel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur complet
	 * @param idProfessionnel
	 * @param login
	 * @param password
	 * @param derniereConnexion
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Professionnel(String login, String password,
			Date derniereConnexion, String nom, String prenom, String adresse) {
		super();

		this.login = login;
		this.password = password;
		this.derniereConnexion = derniereConnexion;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	/**
	 * Les Professionnels sont égaux s'ils ont le même id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Professionnel) {
			Professionnel p = (Professionnel) o;
			return this.login.equals(p.login);
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Professionnel [adresse=" + adresse + ", derniereConnexion="
				+ derniereConnexion + ", login=" + login + ", nom=" + nom + ", password="
				+ password + ", prenom=" + prenom + "]";
	}
	
	/**
	 * la fonction qui réalise un vote
	 * @param f le film a noté
	 * @param note la note du film
	 * @return Vote le vote retourné
	 */
	public Vote faitUnVote(Film f,int note)
	{
		Vote tmp=new Vote(f, this, note);
		boolean b=tmp.rechercheVote(this.votes);
		if(!b)
		{
			System.out.println("Vote ajouté pour "+f.getTitre());
			this.votes.add(tmp);
			return tmp;
		}
		return null;
		
	}
	/*
	 * Getters and setters
	 */
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDerniereConnexion() {
		return derniereConnexion;
	}
	public void setDerniereConnexion(Date derniereConnexion) {
		this.derniereConnexion = derniereConnexion;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Set<Vote> getVotes() {
		return votes;
	}
}
