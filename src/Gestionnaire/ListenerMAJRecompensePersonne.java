package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.RecompenseFilm;
import metier.RecompensePersonne;

public class ListenerMAJRecompensePersonne implements ActionListener {

ArrayList<RecompensePersonne> liste;
	
	public ListenerMAJRecompensePersonne()
	{
		 liste = new ArrayList<RecompensePersonne>();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		liste = new ArrayList<RecompensePersonne> ();//important il faut la réalouer pour la vider
		Object[] selectedValues = AffichageGestionnaire.getInstance().getListeRecompensePersonne().getSelectedValues();
		for(int i=0;i<selectedValues.length;i++)
			liste.add((RecompensePersonne) selectedValues[i]);
		
		
		// on crée un gestionnaire de role d'acteurs pour pouvoir géré les clicks
		GestionnaireRecompensePersonne gestionnaire = new GestionnaireRecompensePersonne();
		
		// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
		JButton source = (JButton) arg0.getSource();
		
		// le role n'est pas accepté
		if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusRecompensePersonne().getText()))
		{
			gestionnaire.supprimeRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusAllRecompensePersonne().getText()))
		{
			gestionnaire.supprimeAll();
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptRecompensePersonne().getText()))
		{
			gestionnaire.acceptRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptAllRecompensePersonne().getText()))
		{
			gestionnaire.acceptAll();
		}
		
	}

}
