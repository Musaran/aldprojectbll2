package Gestionnaire;

import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = AffichageGestionnaire.getInstance();
		frame.setLocationRelativeTo(frame.getParent());

		frame.setVisible(true);
	}

}
