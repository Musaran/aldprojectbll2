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
		// TODO Auto-generated method stub
		JTabbedPane source= (JTabbedPane)arg0.getSource();
		
		if(source.getSelectedIndex()==1)
		{
			GestionnaireRoleActeur gest = new GestionnaireRoleActeur();
			gest.refresh();
		}
	}

}
