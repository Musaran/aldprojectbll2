package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.Film;
import metier.Professionnel;

public class ListenerMAJInscrits implements ActionListener{

	ArrayList<Professionnel> liste;
	
	
	public ListenerMAJInscrits() {
		liste = new ArrayList<Professionnel>();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		/*une fois qu'on clique sur un bouton on prend toutes la liste des truc selectionner meme si vide*/
		
		liste = new ArrayList<Professionnel> ();//important il faut la réalouer pour la vider
		Object[] selectedValues = AffichageGestionnaire.getInstance().getListeInscrit().getSelectedValues();
		for(int i=0;i<selectedValues.length;i++)
			liste.add((Professionnel) selectedValues[i]);
		
		// on crée un gestionnaire de film pour pouvoir géré les clicks
		GestionnaireInscrits gestionnaire = new GestionnaireInscrits();
		
		// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
		JButton source = (JButton) arg0.getSource();
		
		// le role n'est pas accepté
		if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusInscrit().getText()))
		{
			gestionnaire.supprime(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusAllInscrit().getText()))
		{
			gestionnaire.supprimeAll();
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptInscrit().getText()))
		{
			gestionnaire.accept(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptAllInscrit().getText()))
		{
			gestionnaire.acceptAll();
		}
		
	}

}
