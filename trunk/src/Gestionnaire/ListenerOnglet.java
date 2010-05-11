package Gestionnaire;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Classe qui ecoute un changement d'onglet pour mettre a jour les champs
 * @author jerome
 *
 */
public class ListenerOnglet implements ChangeListener{

	@Override
	public void stateChanged(ChangeEvent arg0) {
		JTabbedPane source= (JTabbedPane)arg0.getSource();
		
		switch(source.getSelectedIndex()) {
		case 1: GestionnaireRoleActeur gestact = new GestionnaireRoleActeur(); gestact.refresh(); break;
		case 2: GestionnaireRoleProducteur gestprod = new GestionnaireRoleProducteur(); gestprod.refresh();break;
		case 3: GestionnaireRoleRealisateur gestreal = new GestionnaireRoleRealisateur(); gestreal.refresh();break;
		case 4: GestionnaireFilm gestfilm = new GestionnaireFilm(); gestfilm.refresh();break;
		}
	}

}
