package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.Personne;

public class ListenerMAJPersonne implements ActionListener {

	ArrayList<Personne> liste;
	
	/**
	 * Constructeur par défaut requis
	 */
	public ListenerMAJPersonne() {
		liste = new ArrayList<Personne> ();//on instancie la liste pour eviter les nullpointerexception
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		liste = new ArrayList<Personne> ();//important il faut la réalouer pour la vider
		Object[] selectedValues = AffichageGestionnaire.getInstance().getListePersonne().getSelectedValues();
		for(int i=0;i<selectedValues.length;i++)
			liste.add((Personne) selectedValues[i]);
		
		GestionnairePersonne gestionnaire = new GestionnairePersonne();
		
		JButton source = (JButton) arg0.getSource();
		
		// le role n'est pas accepté
		if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusPersonne().getText()))
		{
			gestionnaire.supprime(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusAllPersonne().getText()))
		{
			gestionnaire.supprimeAll();
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptPersonne().getText()))
		{
			gestionnaire.accept(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptAllPersonne().getText()))
		{
			gestionnaire.acceptAll();
		}
			
		
	}

}
