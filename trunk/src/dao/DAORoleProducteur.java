package dao;

import java.util.ArrayList;

import metier.Film;
import metier.Personne;
import metier.RoleProducteur;

public interface DAORoleProducteur {
	ArrayList<RoleProducteur> loadProducteurValide() throws Exception;
	ArrayList<RoleProducteur> loadProducteurInvalide() throws Exception;
	void remove(RoleProducteur role)throws Exception;
	void save(RoleProducteur role)throws Exception;
	RoleProducteur get(Personne p, Film f)throws Exception;
	void saveOrUpdate(RoleProducteur r) throws Exception;

}
