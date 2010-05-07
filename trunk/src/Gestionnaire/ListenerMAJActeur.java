package Gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import metier.RoleActeur;

/**
 * Le listener qui va écouter les clic des boutons et seulement ceux la 
 * @author jerome
 *
 */
public class ListenerMAJActeur implements ActionListener {

	ArrayList<RoleActeur> liste;
	
	/**
	 * Constructeur par défaut requis
	 */
	public ListenerMAJActeur() {
		// TODO Auto-generated constructor stub
		liste = new ArrayList<RoleActeur> ();//on instancie la liste pour eviter les nullpointerexception
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		/*une fois qu'on clique sur un bouton on prend toutes la liste des truc selectionner meme si vide*/
		
		liste = new ArrayList<RoleActeur> ();//important il faut la réalouer pour la vider
		Object[] selectedValues = AffichageGestionnaire.getInstance().getListeActeur().getSelectedValues();
		for(int i=0;i<selectedValues.length;i++)
			liste.add((RoleActeur) selectedValues[i]);
		
		
		// on crée un gestionnaire de role d'acteurs pour pouvoir géré les clicks
		GestionnaireRoleActeur gestionnaire = new GestionnaireRoleActeur();
		
		// maintenant on get la source pour savoir quelle bouton a appuyer et lancer la bonne action
		JButton source = (JButton) arg0.getSource();
		
		// le role n'est pas accepté
		if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusActeur().getText()))
		{
			gestionnaire.supprimeRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonRefusAllActeur().getText()))
		{
			gestionnaire.supprimeAll();
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptActeur().getText()))
		{
			gestionnaire.acceptRole(liste);
		}
		else if(source.getText().equals(
				AffichageGestionnaire.getInstance().getBoutonAcceptAllActeur().getText()))
		{
			gestionnaire.acceptAll();
		}
			
		
	}

}
