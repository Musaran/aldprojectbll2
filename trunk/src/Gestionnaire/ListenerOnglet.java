package Gestionnaire;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ListenerOnglet implements ChangeListener{

	@Override
	public void stateChanged(ChangeEvent arg0) {
		JTabbedPane source= (JTabbedPane)arg0.getSource();
		
		switch(source.getSelectedIndex()) {
			case 1: GestionnaireRoleActeur gestact = new GestionnaireRoleActeur(); gestact.refresh(); break;
			case 2: GestionnaireRoleProducteur gestprod = new GestionnaireRoleProducteur(); gestprod.refresh();break;
			case 3: GestionnaireRoleRealisateur gestreal = new GestionnaireRoleRealisateur(); gestreal.refresh();break;
			case 4: GestionnaireFilm gestfilm = new GestionnaireFilm(); gestfilm.refresh();break;
			case 5: GestionnaireInscrits gestinscrits = new GestionnaireInscrits(); gestinscrits.refresh();break;
			case 6: GestionnaireRecompenseFilm gestrecompensefilm = new GestionnaireRecompenseFilm(); gestrecompensefilm.refresh();break;
			case 7: GestionnaireRecompensePersonne gestrecompensepersonne = new GestionnaireRecompensePersonne(); gestrecompensepersonne.refresh();break;
			case 8: {
				try {
					AffichageGestionnaire.getInstance().getjEditorPaneNavigateur().setPage("http://localhost:8080/sitewebald/vues/index.jsp");
					AffichageGestionnaire.getInstance().getTxtURL().setText("http://localhost:8080/sitewebald/vues/index.jsp");
				} 
				catch (IOException e) {
					JOptionPane.showMessageDialog(AffichageGestionnaire.getInstance().getConteneurOnglet(), "Connexion impossible. Serveur Down ?");
					e.printStackTrace();
				}
			};break;
			case 9: GestionnairePersonne gestpers = new GestionnairePersonne(); gestpers.refresh();break;
		}
	}
}
