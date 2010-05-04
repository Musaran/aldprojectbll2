package dao;

import java.util.ArrayList;

import metier.Film;
import metier.Personne;
import metier.RoleRealisateur;

public interface DAORoleRealisateur {
	ArrayList<RoleRealisateur> loadRealisateurValide() throws Exception;
	ArrayList<RoleRealisateur> loadRealisateurInvalide() throws Exception;
	void remove(RoleRealisateur role)throws Exception;
	void save(RoleRealisateur role)throws Exception;
	RoleRealisateur get(Personne p, Film f)throws Exception;
	void saveOrUpdate(RoleRealisateur r) throws Exception;

}
