package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.RoleRealisateur;

public class ListenerMAJRealisateur implements ActionListener {

		ArrayList<RoleRealisateur> liste;
		
		/**
		 * Constructeur par d�faut requis
		 */
		public ListenerMAJRealisateur() {
			// TODO Auto-generated constructor stub
			liste = new ArrayList<RoleRealisateur> ();//on instancie la liste pour eviter les nullpointerexception
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			/*une fois qu'on clique sur un bouton on prend toutes la liste des truc selectionner meme si vide*/
			
			liste = new ArrayList<RoleRealisateur> ();//important il faut la r�alouer pour la vider
			Object[] selectedValues = AffichageGestionnaire.getInstance().getListeRealisateur().getSelectedValues();
			for(int i=0;i<selectedValues.length;i++)
				liste.add((RoleRealisateur) selectedValues[i]);
			
			
			// on cr�e un gestionnaire de role de realisateurs pour pouvoir g�r� les clicks
			GestionnaireRoleRealisateur gestionnaire = new GestionnaireRoleRealisateur();
			
			// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
			JButton source = (JButton) arg0.getSource();
			
			// le role n'est pas accept�
			if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusRealisateur().getText()))
			{
				gestionnaire.supprimeRole(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonRefusAllRealisateur().getText()))
			{
				gestionnaire.supprimeAll();
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptRealisateur().getText()))
			{
				gestionnaire.acceptRole(liste);
			}
			else if(source.getText().equals(
					AffichageGestionnaire.getInstance().getBoutonAcceptAllRealisateur().getText()))
			{
				gestionnaire.acceptAll();
			}
				
			
		}
}