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
	
	///donn�es propres au professionnel
	private int idProfessionnel;
	private String login;
	private String password;
	private Date derniereConnexion;
	private String nom;
	private String prenom;
	private String adresse;
	///la liste des votes deja effectu�s par le professionel
	private Set<Vote> votes = new HashSet<Vote>();
	
	
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
	public Professionnel(int idProfessionnel, String login, String password,
			Date derniereConnexion, String nom, String prenom, String adresse) {
		super();
		this.idProfessionnel = idProfessionnel;
		this.login = login;
		this.password = password;
		this.derniereConnexion = derniereConnexion;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	/**
	 * Constructeur sans l'id
	 * @param login
	 * @param password
	 * @param derniereConnexion
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	
	public Professionnel(String login, String password, Date derniereConnexion,
			String nom, String prenom, String adresse) {
		super();
		this.login = login;
		this.password = password;
		this.derniereConnexion = derniereConnexion;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/**
	 * Les Professionnels sont �gaux s'ils ont le m�me id
	 */
	public boolean	equals(Object o)
	{
		if (o instanceof Professionnel) {
			Professionnel p = (Professionnel) o;
			return this.idProfessionnel == p.idProfessionnel;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Professionnel [adresse=" + adresse + ", derniereConnexion="
				+ derniereConnexion + ", idProfessionnel=" + idProfessionnel
				+ ", login=" + login + ", nom=" + nom + ", password="
				+ password + ", prenom=" + prenom + "]";
	}
	
	/**
	 * la fonction qui r�alise un vote
	 * @param f le film a not�
	 * @param note la note du film
	 * @return Vote le vote retourn�
	 */
	public void faitUnVote(Film f,int note)
	{
		Vote tmp=new Vote(f, this, note);
		boolean b=tmp.rechercheVote(this.votes);
		if(!b)
		{
			System.out.println("Vote ajout� pour "+f.getTitre());
			this.votes.add(tmp);
			
		}
		
	}
	


	/*
	 * Getters and setters
	 */
	
	public int getIdProfessionnel() {
		return idProfessionnel;
	}
	public void setIdProfessionnel(int idProfessionnel) {
		this.idProfessionnel = idProfessionnel;
	}
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
