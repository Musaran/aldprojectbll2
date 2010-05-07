package Gestionnaire;

import javax.swing.JFrame;

public class AffichageGestionnaire extends JFrame {
	private static AffichageGestionnaire instance;
	
	public static AffichageGestionnaire getInstance()
	{
		if(instance==null)
			instance = new AffichageGestionnaire();
		
		return instance;
	}
	
	private AffichageGestionnaire()
	{
		initComponents();
	}
	
	 // Variables declaration - do not modify
    private javax.swing.JButton boutonAcceptActeur;
    private javax.swing.JButton boutonAcceptAllActeur;
    private javax.swing.JButton boutonAcceptAllFilm;
    private javax.swing.JButton boutonAcceptAllInscrit;
    private javax.swing.JButton boutonAcceptAllPersonne;
    private javax.swing.JButton boutonAcceptAllProducteur;
    private javax.swing.JButton boutonAcceptAllRealisateur;
    private javax.swing.JButton boutonAcceptAllRecompenseFilm;
    private javax.swing.JButton boutonAcceptAllRecompensePersonne;
    private javax.swing.JButton boutonAcceptFilm;
    private javax.swing.JButton boutonAcceptInscrit;
    private javax.swing.JButton boutonAcceptPersonne;
    private javax.swing.JButton boutonAcceptProducteur;
    private javax.swing.JButton boutonAcceptRealisateur;
    private javax.swing.JButton boutonAcceptRecompenseFilm;
    private javax.swing.JButton boutonAcceptRecompensePersonne;
    private javax.swing.JButton boutonRefusActeur;
    private javax.swing.JButton boutonRefusAllActeur;
    private javax.swing.JButton boutonRefusAllFilm;
    private javax.swing.JButton boutonRefusAllInscrit;
    private javax.swing.JButton boutonRefusAllPersonne;
    private javax.swing.JButton boutonRefusAllProducteur;
    private javax.swing.JButton boutonRefusAllRealisateur;
    private javax.swing.JButton boutonRefusAllRecompenseFilm;
    private javax.swing.JButton boutonRefusAllRecompensePersonne;
    private javax.swing.JButton boutonRefusFilm;
    private javax.swing.JButton boutonRefusInscrit;
    private javax.swing.JButton boutonRefusPersonne;
    private javax.swing.JButton boutonRefusProducteur;
    private javax.swing.JButton boutonRefusRealisateur;
    private javax.swing.JButton boutonRefusRecompenseFilm;
    private javax.swing.JButton boutonRefusRecompensePersonne;
    private javax.swing.JTabbedPane conteneurOnglet;
    private javax.swing.JLabel labelAccueilActeur;
    private javax.swing.JLabel labelAccueilFilm;
    private javax.swing.JLabel labelAccueilInscrit;
    private javax.swing.JLabel labelAccueilPersonne;
    private javax.swing.JLabel labelAccueilProducteur;
    private javax.swing.JLabel labelAccueilRealisateur;
    private javax.swing.JLabel labelAccueilRecompenseFilm;
    private javax.swing.JLabel labelAccueilRecompensePersonne;
    private javax.swing.JLabel labelListeActeur;
    private javax.swing.JLabel labelListeFilm;
    private javax.swing.JLabel labelListeInscrit;
    private javax.swing.JLabel labelListeNouveauxInscrit;
    private javax.swing.JLabel labelListePersonne;
    private javax.swing.JLabel labelListeProducteur;
    private javax.swing.JLabel labelListeRealisateur;
    private javax.swing.JLabel labelListeRecompenseFilm;
    private javax.swing.JLabel labelListeRecompensePersonne;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelNombreChiffreActeur;
    private javax.swing.JLabel labelNombreRecompenseFilm;
    private javax.swing.JLabel labelNombreTexteActeur;
    private javax.swing.JLabel labelNombreTexteFilm;
    private javax.swing.JLabel labelNombreTexteInscrit;
    private javax.swing.JLabel labelNombreTextePersonne;
    private javax.swing.JLabel labelNombreTexteProducteur;
    private javax.swing.JLabel labelNombreTexteRealisateur;
    private javax.swing.JLabel labelNombreTexteRecompensePersonne;
    private javax.swing.JLabel labelNouveauxInscrit;
    private javax.swing.JLabel labelNouveauxInscritNombre;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JList listeActeur;
    private javax.swing.JList listeFilm;
    private javax.swing.JList listeInscrit;
    private javax.swing.JList listeNouveauxInscrit;
    private javax.swing.JList listePersonne;
    private javax.swing.JList listeProducteur;
    private javax.swing.JList listeRealisateur;
    private javax.swing.JList listeRecompenseFilm;
    private javax.swing.JList listeRecompensePersonne;
    private javax.swing.JMenu menuAutre;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JPanel panelConnexion;
    private javax.swing.JPanel panelGestionActeur;
    private javax.swing.JPanel panelGestionFilm;
    private javax.swing.JPanel panelGestionInscrit;
    private javax.swing.JPanel panelGestionPersonne;
    private javax.swing.JPanel panelGestionProducteur;
    private javax.swing.JPanel panelGestionRealisateur;
    private javax.swing.JPanel panelGestionRecompenseFilm;
    private javax.swing.JPanel panelGestionRecompensePersonne;
    private javax.swing.JPanel panelNavigateur;
    private javax.swing.JScrollPane scrollPaneListeActeur;
    private javax.swing.JScrollPane scrollPaneListeFilm;
    private javax.swing.JScrollPane scrollPaneListeInscrit;
    private javax.swing.JScrollPane scrollPaneListeNouveauxInscrit;
    private javax.swing.JScrollPane scrollPaneListePersonne;
    private javax.swing.JScrollPane scrollPaneListeProducteur;
    private javax.swing.JScrollPane scrollPaneListeRealisateur;
    private javax.swing.JScrollPane scrollPaneListeRecompenseFilm;
    private javax.swing.JScrollPane scrollPaneListeRecompensePersonne;
    private javax.swing.JTextField textfieldLogin;
    private javax.swing.JTextField textfieldPassword;
	
	 private void initComponents() {

	        conteneurOnglet = new javax.swing.JTabbedPane();
	        panelConnexion = new javax.swing.JPanel();
	        labelMessage = new javax.swing.JLabel();
	        labelLogin = new javax.swing.JLabel();
	        labelPassword = new javax.swing.JLabel();
	        textfieldLogin = new javax.swing.JTextField();
	        textfieldPassword = new javax.swing.JTextField();
	        panelGestionActeur = new javax.swing.JPanel();
	        labelNombreTexteActeur = new javax.swing.JLabel();
	        labelAccueilActeur = new javax.swing.JLabel();
	        labelNombreChiffreActeur = new javax.swing.JLabel();
	        labelListeActeur = new javax.swing.JLabel();
	        scrollPaneListeActeur = new javax.swing.JScrollPane();
	        listeActeur = new javax.swing.JList();
	        boutonAcceptAllActeur = new javax.swing.JButton();
	        boutonRefusAllActeur = new javax.swing.JButton();
	        boutonRefusActeur = new javax.swing.JButton();
	        boutonAcceptActeur = new javax.swing.JButton();
	        panelGestionProducteur = new javax.swing.JPanel();
	        labelAccueilProducteur = new javax.swing.JLabel();
	        labelNombreTexteProducteur = new javax.swing.JLabel();
	        labelListeProducteur = new javax.swing.JLabel();
	        scrollPaneListeProducteur = new javax.swing.JScrollPane();
	        listeProducteur = new javax.swing.JList();
	        boutonRefusAllProducteur = new javax.swing.JButton();
	        boutonAcceptAllProducteur = new javax.swing.JButton();
	        boutonRefusProducteur = new javax.swing.JButton();
	        boutonAcceptProducteur = new javax.swing.JButton();
	        panelGestionRealisateur = new javax.swing.JPanel();
	        labelAccueilRealisateur = new javax.swing.JLabel();
	        labelNombreTexteRealisateur = new javax.swing.JLabel();
	        labelListeRealisateur = new javax.swing.JLabel();
	        scrollPaneListeRealisateur = new javax.swing.JScrollPane();
	        listeRealisateur = new javax.swing.JList();
	        boutonRefusAllRealisateur = new javax.swing.JButton();
	        boutonAcceptAllRealisateur = new javax.swing.JButton();
	        boutonRefusRealisateur = new javax.swing.JButton();
	        boutonAcceptRealisateur = new javax.swing.JButton();
	        panelGestionFilm = new javax.swing.JPanel();
	        labelAccueilFilm = new javax.swing.JLabel();
	        labelNombreTexteFilm = new javax.swing.JLabel();
	        labelListeFilm = new javax.swing.JLabel();
	        scrollPaneListeFilm = new javax.swing.JScrollPane();
	        listeFilm = new javax.swing.JList();
	        boutonRefusAllFilm = new javax.swing.JButton();
	        boutonAcceptAllFilm = new javax.swing.JButton();
	        boutonAcceptFilm = new javax.swing.JButton();
	        boutonRefusFilm = new javax.swing.JButton();
	        panelGestionInscrit = new javax.swing.JPanel();
	        labelAccueilInscrit = new javax.swing.JLabel();
	        labelNombreTexteInscrit = new javax.swing.JLabel();
	        labelListeInscrit = new javax.swing.JLabel();
	        scrollPaneListeInscrit = new javax.swing.JScrollPane();
	        listeInscrit = new javax.swing.JList();
	        boutonRefusAllInscrit = new javax.swing.JButton();
	        boutonAcceptAllInscrit = new javax.swing.JButton();
	        scrollPaneListeNouveauxInscrit = new javax.swing.JScrollPane();
	        listeNouveauxInscrit = new javax.swing.JList();
	        labelListeNouveauxInscrit = new javax.swing.JLabel();
	        labelNouveauxInscrit = new javax.swing.JLabel();
	        labelNouveauxInscritNombre = new javax.swing.JLabel();
	        boutonAcceptInscrit = new javax.swing.JButton();
	        boutonRefusInscrit = new javax.swing.JButton();
	        panelGestionRecompenseFilm = new javax.swing.JPanel();
	        labelAccueilRecompenseFilm = new javax.swing.JLabel();
	        labelNombreRecompenseFilm = new javax.swing.JLabel();
	        labelListeRecompenseFilm = new javax.swing.JLabel();
	        scrollPaneListeRecompenseFilm = new javax.swing.JScrollPane();
	        listeRecompenseFilm = new javax.swing.JList();
	        boutonRefusAllRecompenseFilm = new javax.swing.JButton();
	        boutonAcceptAllRecompenseFilm = new javax.swing.JButton();
	        boutonAcceptRecompenseFilm = new javax.swing.JButton();
	        boutonRefusRecompenseFilm = new javax.swing.JButton();
	        panelGestionRecompensePersonne = new javax.swing.JPanel();
	        labelAccueilRecompensePersonne = new javax.swing.JLabel();
	        labelNombreTexteRecompensePersonne = new javax.swing.JLabel();
	        labelListeRecompensePersonne = new javax.swing.JLabel();
	        scrollPaneListeRecompensePersonne = new javax.swing.JScrollPane();
	        listeRecompensePersonne = new javax.swing.JList();
	        boutonRefusAllRecompensePersonne = new javax.swing.JButton();
	        boutonAcceptAllRecompensePersonne = new javax.swing.JButton();
	        boutonAcceptRecompensePersonne = new javax.swing.JButton();
	        boutonRefusRecompensePersonne = new javax.swing.JButton();
	        panelNavigateur = new javax.swing.JPanel();
	        panelGestionPersonne = new javax.swing.JPanel();
	        labelAccueilPersonne = new javax.swing.JLabel();
	        boutonAcceptAllPersonne = new javax.swing.JButton();
	        boutonRefusAllPersonne = new javax.swing.JButton();
	        scrollPaneListePersonne = new javax.swing.JScrollPane();
	        listePersonne = new javax.swing.JList();
	        labelListePersonne = new javax.swing.JLabel();
	        labelNombreTextePersonne = new javax.swing.JLabel();
	        boutonAcceptPersonne = new javax.swing.JButton();
	        boutonRefusPersonne = new javax.swing.JButton();
	        menuBar = new javax.swing.JMenuBar();
	        menuFichier = new javax.swing.JMenu();
	        menuAutre = new javax.swing.JMenu();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        labelMessage.setText("Merci de vous authentifier");

	        labelLogin.setText("Login : ");

	        labelPassword.setText("Mot de passe : ");

	        javax.swing.GroupLayout panelConnexionLayout = new javax.swing.GroupLayout(panelConnexion);
	        panelConnexion.setLayout(panelConnexionLayout);
	        panelConnexionLayout.setHorizontalGroup(
	            panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConnexionLayout.createSequentialGroup()
	                .addContainerGap(240, Short.MAX_VALUE)
	                .addComponent(labelMessage)
	                .addGap(315, 315, 315))
	            .addGroup(panelConnexionLayout.createSequentialGroup()
	                .addGap(156, 156, 156)
	                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(labelPassword)
	                    .addComponent(labelLogin))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(textfieldPassword)
	                    .addComponent(textfieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
	                .addContainerGap(332, Short.MAX_VALUE))
	        );
	        panelConnexionLayout.setVerticalGroup(
	            panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelConnexionLayout.createSequentialGroup()
	                .addComponent(labelMessage)
	                .addGap(29, 29, 29)
	                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelLogin)
	                    .addComponent(textfieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelPassword)
	                    .addComponent(textfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(290, Short.MAX_VALUE))
	        );

	        conteneurOnglet.addTab("Connexion", panelConnexion);

	        labelNombreTexteActeur.setText("Nombre de mise a jour :");

	        labelAccueilActeur.setText("Gestion des acteurs");

	        labelListeActeur.setText("Liste des mise à jour : ");

	        listeActeur.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeActeur.setViewportView(listeActeur);

	        boutonAcceptAllActeur.setText("Accepter toutes les mise à jour");

	        boutonRefusAllActeur.setText("Refuser toutes les mise à jour");

	        boutonRefusActeur.setText("Refuser la mise à jour selectionnée");

	        boutonAcceptActeur.setText("Accepter la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionActeurLayout = new javax.swing.GroupLayout(panelGestionActeur);
	        panelGestionActeur.setLayout(panelGestionActeurLayout);
	        panelGestionActeurLayout.setHorizontalGroup(
	            panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                .addGap(233, 233, 233)
	                .addComponent(labelAccueilActeur)
	                .addContainerGap(352, Short.MAX_VALUE))
	            .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                        .addComponent(labelNombreTexteActeur)
	                        .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(labelNombreChiffreActeur))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionActeurLayout.createSequentialGroup()
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                    .addComponent(boutonRefusAllActeur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(boutonAcceptAllActeur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addContainerGap())))
	                    .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                        .addComponent(labelListeActeur)
	                        .addContainerGap(554, Short.MAX_VALUE))))
	            .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(scrollPaneListeActeur, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusActeur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptActeur, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        panelGestionActeurLayout.setVerticalGroup(
	            panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                .addGap(9, 9, 9)
	                .addComponent(labelAccueilActeur)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelNombreTexteActeur)
	                    .addComponent(labelNombreChiffreActeur)
	                    .addComponent(boutonAcceptAllActeur))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(labelListeActeur)
	                    .addComponent(boutonRefusAllActeur))
	                .addGroup(panelGestionActeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(scrollPaneListeActeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(panelGestionActeurLayout.createSequentialGroup()
	                        .addGap(41, 41, 41)
	                        .addComponent(boutonAcceptActeur)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(boutonRefusActeur)))
	                .addContainerGap(169, Short.MAX_VALUE))
	        );

	        conteneurOnglet.addTab("Acteur", panelGestionActeur);

	        labelAccueilProducteur.setText("Gestion des producteurs");

	        labelNombreTexteProducteur.setText("Nombre de mise a jour :");

	        labelListeProducteur.setText("Liste des mise à jour : ");

	        listeProducteur.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeProducteur.setViewportView(listeProducteur);

	        boutonRefusAllProducteur.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllProducteur.setText("Accepter toutes les mise à jour");

	        boutonRefusProducteur.setText("Refuser la mise à jour selectionnée");

	        boutonAcceptProducteur.setText("Accepter la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionProducteurLayout = new javax.swing.GroupLayout(panelGestionProducteur);
	        panelGestionProducteur.setLayout(panelGestionProducteurLayout);
	        panelGestionProducteurLayout.setHorizontalGroup(
	            panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionProducteurLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusProducteur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptProducteur, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTexteProducteur)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllProducteur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllProducteur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                                    .addComponent(labelListeProducteur)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilProducteur))
	                        .addComponent(scrollPaneListeProducteur, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionProducteurLayout.setVerticalGroup(
	            panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                .addGap(126, 126, 126)
	                .addComponent(boutonAcceptProducteur)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusProducteur)
	                .addContainerGap(213, Short.MAX_VALUE))
	            .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilProducteur)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTexteProducteur)
	                        .addComponent(boutonAcceptAllProducteur))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeProducteur)
	                        .addComponent(boutonRefusAllProducteur))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeProducteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Producteur", panelGestionProducteur);

	        labelAccueilRealisateur.setText("Gestion des realisateurs");

	        labelNombreTexteRealisateur.setText("Nombre de mise a jour :");

	        labelListeRealisateur.setText("Liste des mise à jour : ");

	        listeRealisateur.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeRealisateur.setViewportView(listeRealisateur);

	        boutonRefusAllRealisateur.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllRealisateur.setText("Accepter toutes les mise à jour");

	        boutonRefusRealisateur.setText("Refuser la mise à jour selectionnée");

	        boutonAcceptRealisateur.setText("Accepter la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionRealisateurLayout = new javax.swing.GroupLayout(panelGestionRealisateur);
	        panelGestionRealisateur.setLayout(panelGestionRealisateurLayout);
	        panelGestionRealisateurLayout.setHorizontalGroup(
	            panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRealisateurLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusRealisateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptRealisateur, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilRealisateur))
	                        .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTexteRealisateur)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllRealisateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllRealisateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                                    .addComponent(labelListeRealisateur)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addComponent(scrollPaneListeRealisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionRealisateurLayout.setVerticalGroup(
	            panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                .addGap(130, 130, 130)
	                .addComponent(boutonAcceptRealisateur)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusRealisateur)
	                .addContainerGap(209, Short.MAX_VALUE))
	            .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilRealisateur)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTexteRealisateur)
	                        .addComponent(boutonAcceptAllRealisateur))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeRealisateur)
	                        .addComponent(boutonRefusAllRealisateur))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeRealisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Realisateur", panelGestionRealisateur);

	        labelAccueilFilm.setText("Gestion des films");

	        labelNombreTexteFilm.setText("Nombre de mise a jour :");

	        labelListeFilm.setText("Liste des mise à jour : ");

	        listeFilm.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeFilm.setViewportView(listeFilm);

	        boutonRefusAllFilm.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllFilm.setText("Accepter toutes les mise à jour");

	        boutonAcceptFilm.setText("Accepter la mise à jour selectionnée");

	        boutonRefusFilm.setText("Refuser la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionFilmLayout = new javax.swing.GroupLayout(panelGestionFilm);
	        panelGestionFilm.setLayout(panelGestionFilmLayout);
	        panelGestionFilmLayout.setHorizontalGroup(
	            panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionFilmLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptFilm, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilFilm))
	                        .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTexteFilm)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                                    .addComponent(labelListeFilm)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addComponent(scrollPaneListeFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionFilmLayout.setVerticalGroup(
	            panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                .addGap(126, 126, 126)
	                .addComponent(boutonAcceptFilm)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusFilm)
	                .addContainerGap(213, Short.MAX_VALUE))
	            .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionFilmLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilFilm)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTexteFilm)
	                        .addComponent(boutonAcceptAllFilm))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeFilm)
	                        .addComponent(boutonRefusAllFilm))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Film", panelGestionFilm);

	        labelAccueilInscrit.setText("Gestion des inscrits");

	        labelNombreTexteInscrit.setText("Nombre de mise a jour :");

	        labelListeInscrit.setText("Liste des mise à jour : ");

	        listeInscrit.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeInscrit.setViewportView(listeInscrit);

	        boutonRefusAllInscrit.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllInscrit.setText("Accepter toutes les mise à jour");

	        listeNouveauxInscrit.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeNouveauxInscrit.setViewportView(listeNouveauxInscrit);

	        labelListeNouveauxInscrit.setText("Liste des nouveaux inscrits du moi : ");

	        labelNouveauxInscrit.setText("Nombre Nouveaux Inscrit : ");

	        boutonAcceptInscrit.setText("Accepter la mise à jour selectionnée");

	        boutonRefusInscrit.setText("Refuser la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionInscritLayout = new javax.swing.GroupLayout(panelGestionInscrit);
	        panelGestionInscrit.setLayout(panelGestionInscritLayout);
	        panelGestionInscritLayout.setHorizontalGroup(
	            panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(scrollPaneListeNouveauxInscrit, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
	                    .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                        .addGap(27, 27, 27)
	                        .addComponent(labelListeNouveauxInscrit)
	                        .addGap(27, 27, 27)
	                        .addComponent(labelNouveauxInscrit)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(labelNouveauxInscritNombre))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionInscritLayout.createSequentialGroup()
	                        .addContainerGap(465, Short.MAX_VALUE)
	                        .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addComponent(boutonRefusInscrit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(boutonAcceptInscrit, javax.swing.GroupLayout.Alignment.LEADING))))
	                .addContainerGap())
	            .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionInscritLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGestionInscritLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilInscrit))
	                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGestionInscritLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTexteInscrit)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllInscrit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllInscrit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                                    .addComponent(labelListeInscrit)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                    .addGap(5, 5, 5))
	                .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                    .addContainerGap()
	                    .addComponent(scrollPaneListeInscrit, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(220, Short.MAX_VALUE)))
	        );
	        panelGestionInscritLayout.setVerticalGroup(
	            panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionInscritLayout.createSequentialGroup()
	                .addGap(129, 129, 129)
	                .addComponent(boutonAcceptInscrit)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusInscrit)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
	                .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelListeNouveauxInscrit)
	                    .addComponent(labelNouveauxInscrit)
	                    .addComponent(labelNouveauxInscritNombre))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(scrollPaneListeNouveauxInscrit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
	            .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionInscritLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilInscrit)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTexteInscrit)
	                        .addComponent(boutonAcceptAllInscrit))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeInscrit)
	                        .addComponent(boutonRefusAllInscrit))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeInscrit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(170, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Inscrits", panelGestionInscrit);

	        labelAccueilRecompenseFilm.setText("Gestion des recompense de film");

	        labelNombreRecompenseFilm.setText("Nombre de mise a jour :");

	        labelListeRecompenseFilm.setText("Liste des mise à jour : ");

	        listeRecompenseFilm.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeRecompenseFilm.setViewportView(listeRecompenseFilm);

	        boutonRefusAllRecompenseFilm.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllRecompenseFilm.setText("Accepter toutes les mise à jour");

	        boutonAcceptRecompenseFilm.setText("Accepter la mise à jour selectionnée");

	        boutonRefusRecompenseFilm.setText("Refuser la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionRecompenseFilmLayout = new javax.swing.GroupLayout(panelGestionRecompenseFilm);
	        panelGestionRecompenseFilm.setLayout(panelGestionRecompenseFilmLayout);
	        panelGestionRecompenseFilmLayout.setHorizontalGroup(
	            panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRecompenseFilmLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilRecompenseFilm))
	                        .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                                    .addComponent(labelNombreRecompenseFilm)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                                    .addComponent(labelListeRecompenseFilm)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addComponent(scrollPaneListeRecompenseFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionRecompenseFilmLayout.setVerticalGroup(
	            panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                .addGap(141, 141, 141)
	                .addComponent(boutonAcceptRecompenseFilm)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusRecompenseFilm)
	                .addContainerGap(198, Short.MAX_VALUE))
	            .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilRecompenseFilm)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreRecompenseFilm)
	                        .addComponent(boutonAcceptAllRecompenseFilm))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeRecompenseFilm)
	                        .addComponent(boutonRefusAllRecompenseFilm))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeRecompenseFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Recompense Film", panelGestionRecompenseFilm);

	        labelAccueilRecompensePersonne.setText("Gestion des recompenses personnes");

	        labelNombreTexteRecompensePersonne.setText("Nombre de mise a jour :");

	        labelListeRecompensePersonne.setText("Liste des mise à jour : ");

	        listeRecompensePersonne.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListeRecompensePersonne.setViewportView(listeRecompensePersonne);

	        boutonRefusAllRecompensePersonne.setText("Refuser toutes les mise à jour");

	        boutonAcceptAllRecompensePersonne.setText("Accepter toutes les mise à jour");

	        boutonAcceptRecompensePersonne.setText("Accepter la mise à jour selectionnée");

	        boutonRefusRecompensePersonne.setText("Refuser la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionRecompensePersonneLayout = new javax.swing.GroupLayout(panelGestionRecompensePersonne);
	        panelGestionRecompensePersonne.setLayout(panelGestionRecompensePersonneLayout);
	        panelGestionRecompensePersonneLayout.setHorizontalGroup(
	            panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRecompensePersonneLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilRecompensePersonne))
	                        .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTexteRecompensePersonne)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                                    .addComponent(labelListeRecompensePersonne)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addComponent(scrollPaneListeRecompensePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionRecompensePersonneLayout.setVerticalGroup(
	            panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                .addGap(125, 125, 125)
	                .addComponent(boutonAcceptRecompensePersonne)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusRecompensePersonne)
	                .addContainerGap(214, Short.MAX_VALUE))
	            .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilRecompensePersonne)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTexteRecompensePersonne)
	                        .addComponent(boutonAcceptAllRecompensePersonne))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListeRecompensePersonne)
	                        .addComponent(boutonRefusAllRecompensePersonne))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListeRecompensePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Recompense Personne", panelGestionRecompensePersonne);

	        javax.swing.GroupLayout panelNavigateurLayout = new javax.swing.GroupLayout(panelNavigateur);
	        panelNavigateur.setLayout(panelNavigateurLayout);
	        panelNavigateurLayout.setHorizontalGroup(
	            panelNavigateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 680, Short.MAX_VALUE)
	        );
	        panelNavigateurLayout.setVerticalGroup(
	            panelNavigateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 391, Short.MAX_VALUE)
	        );

	        conteneurOnglet.addTab("Navigateur", panelNavigateur);

	        labelAccueilPersonne.setText("Gestion des personnes");

	        boutonAcceptAllPersonne.setText("Accepter toutes les mise à jour");

	        boutonRefusAllPersonne.setText("Refuser toutes les mise à jour");

	        listePersonne.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        scrollPaneListePersonne.setViewportView(listePersonne);

	        labelListePersonne.setText("Liste des mise à jour : ");

	        labelNombreTextePersonne.setText("Nombre de mise a jour :");

	        boutonAcceptPersonne.setText("Accepter la mise à jour selectionnée");

	        boutonRefusPersonne.setText("Refuser la mise à jour selectionnée");

	        javax.swing.GroupLayout panelGestionPersonneLayout = new javax.swing.GroupLayout(panelGestionPersonne);
	        panelGestionPersonne.setLayout(panelGestionPersonneLayout);
	        panelGestionPersonneLayout.setHorizontalGroup(
	            panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionPersonneLayout.createSequentialGroup()
	                .addContainerGap(465, Short.MAX_VALUE)
	                .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(boutonRefusPersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(boutonAcceptPersonne, javax.swing.GroupLayout.Alignment.LEADING))
	                .addContainerGap())
	            .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                    .addGap(5, 5, 5)
	                    .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                            .addGap(233, 233, 233)
	                            .addComponent(labelAccueilPersonne))
	                        .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                            .addGap(19, 19, 19)
	                            .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                                    .addComponent(labelNombreTextePersonne)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
	                                    .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(boutonRefusAllPersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(boutonAcceptAllPersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                                    .addComponent(labelListePersonne)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addComponent(scrollPaneListePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(5, 5, 5)))
	        );
	        panelGestionPersonneLayout.setVerticalGroup(
	            panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                .addGap(133, 133, 133)
	                .addComponent(boutonAcceptPersonne)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(boutonRefusPersonne)
	                .addContainerGap(206, Short.MAX_VALUE))
	            .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(panelGestionPersonneLayout.createSequentialGroup()
	                    .addGap(20, 20, 20)
	                    .addComponent(labelAccueilPersonne)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(labelNombreTextePersonne)
	                        .addComponent(boutonAcceptAllPersonne))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(labelListePersonne)
	                        .addComponent(boutonRefusAllPersonne))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(scrollPaneListePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(158, Short.MAX_VALUE)))
	        );

	        conteneurOnglet.addTab("Personne", panelGestionPersonne);

	        menuFichier.setText("Fichier");
	        menuBar.add(menuFichier);

	        menuAutre.setText("?");
	        menuBar.add(menuAutre);

	        setJMenuBar(menuBar);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(conteneurOnglet, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(conteneurOnglet, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>

	   
}
