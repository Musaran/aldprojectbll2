package dao;

import java.util.ArrayList;

import metier.Serveur;

public interface DAOServeur {
	
	Serveur load(int id) throws Exception;
	void save(Serveur s) throws Exception;

}
