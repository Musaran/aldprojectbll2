package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.RecompenseFilm;
import metier.RoleActeur;

public class ListenerMAJRecompenseFilm implements ActionListener{

	ArrayList<RecompenseFilm> liste;
	
	public ListenerMAJRecompenseFilm()
	{
		 liste = new ArrayList<RecompenseFilm>();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		liste = new ArrayList<RecompenseFilm> ();//important il faut la réalouer pour la vider
		Object[] selectedValues = AffichageGestionnaire.getInstance().getListeRecompenseFilm().getSelectedValues();
		for(int i=0;i<selectedValues.length;i++)
			liste.add((RecompenseFilm) selectedValues[i]);
		
		
		// on crée un gestionnaire de role d'acteurs pour pouvoir géré les clicks
		GestionnaireRecompenseFilm gestionnaire = new GestionnaireRecompenseFilm();
		
		// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
		JButton source = (JButton) arg0.getSource();
		
		// le role n'est pas accepté
		if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusRecompenseFilm().getText()))
		{
			gestionnaire.supprimeRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusAllRecompenseFilm().getText()))
		{
			gestionnaire.supprimeAll();
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptRecompenseFilm().getText()))
		{
			gestionnaire.acceptRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptAllRecompenseFilm().getText()))
		{
			gestionnaire.acceptAll();
		}
		
	}

}
