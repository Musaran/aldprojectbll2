package dao;

import java.util.ArrayList;



import metier.Film;
import metier.Personne;
import metier.RoleActeur;

/**
 * 
 * @author jerome
 *
 */
public interface DAORoleActeur {
	ArrayList<RoleActeur> loadActeurValide() throws Exception;
	ArrayList<RoleActeur> loadActeurInvalide() throws Exception;
	void remove(RoleActeur role)throws Exception;
	void save(RoleActeur role)throws Exception;
	RoleActeur get(Personne p, Film f)throws Exception;
	void saveOrUpdate(RoleActeur r) throws Exception;
	
}
