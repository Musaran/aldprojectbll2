package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.Film;

public class ListenerMAJFilm implements ActionListener {

		ArrayList<Film> liste;
		
		/**
		 * Constructeur par défaut requis
		 */
		public ListenerMAJFilm() {
			// TODO Auto-generated constructor stub
			liste = new ArrayList<Film> ();//on instancie la liste pour eviter les nullpointerexception
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			/*une fois qu'on clique sur un bouton on prend toutes la liste des truc selectionner meme si vide*/
			
			liste = new ArrayList<Film> ();//important il faut la réalouer pour la vider
			Object[] selectedValues = AffichageGestionnaire.getInstance().getListeFilm().getSelectedValues();
			for(int i=0;i<selectedValues.length;i++)
				liste.add((Film) selectedValues[i]);
			
			
			// on crée un gestionnaire de film pour pouvoir géré les clicks
			GestionnaireFilm gestionnaire = new GestionnaireFilm();
			
			// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
			JButton source = (JButton) arg0.getSource();
			
			// le role n'est pas accepté
			if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusFilm().getText()))
			{
				gestionnaire.supprime(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusAllFilm().getText()))
			{
				gestionnaire.supprimeAll();
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptFilm().getText()))
			{
				gestionnaire.accept(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptAllFilm().getText()))
			{
				gestionnaire.acceptAll();
			}
				
			
		}
}