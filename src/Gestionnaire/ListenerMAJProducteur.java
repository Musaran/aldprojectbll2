package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.RoleProducteur;

public class ListenerMAJProducteur implements ActionListener {

		ArrayList<RoleProducteur> liste;
		
		/**
		 * Constructeur par défaut requis
		 */
		public ListenerMAJProducteur() {
			// TODO Auto-generated constructor stub
			liste = new ArrayList<RoleProducteur> ();//on instancie la liste pour eviter les nullpointerexception
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			/*une fois qu'on clique sur un bouton on prend toutes la liste des truc selectionner meme si vide*/
			
			liste = new ArrayList<RoleProducteur> ();//important il faut la réalouer pour la vider
			Object[] selectedValues = AffichageGestionnaire.getInstance().getListeProducteur().getSelectedValues();
			for(int i=0;i<selectedValues.length;i++)
				liste.add((RoleProducteur) selectedValues[i]);
			
			
			// on crée un gestionnaire de role de producteur pour pouvoir géré les clicks
			GestionnaireRoleProducteur gestionnaire = new GestionnaireRoleProducteur();
			
			// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
			JButton source = (JButton) arg0.getSource();
			
			// le role n'est pas accepté
			if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusProducteur().getText()))
			{
				gestionnaire.supprimeRole(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusAllProducteur().getText()))
			{
				gestionnaire.supprimeAll();
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptProducteur().getText()))
			{
				gestionnaire.acceptRole(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptAllProducteur().getText()))
			{
				gestionnaire.acceptAll();
			}
				
			
		}
}