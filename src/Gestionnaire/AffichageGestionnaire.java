package Gestionnaire;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.IDN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe Singleton pour l'affichage de l'application administrateur
 * @author jerome
 *
 */
public class AffichageGestionnaire extends JFrame implements HyperlinkListener {
	private static AffichageGestionnaire instance;
	
	/**
	 * Fonction qui permet de recupérer l'affichage
	 * @return instance de la classe
	 */
	public static AffichageGestionnaire getInstance()
	{
		if(instance==null)
			instance = new AffichageGestionnaire();
		
		return instance;
	}
	/**
	 * Constructeur par défaut appelé pour avoir l'instance si elle n'existe pas
	 */
	private AffichageGestionnaire()
	{
		jMenuItemRefresh = new javax.swing.JMenuItem();
		boutonAccueilNavigateur = new javax.swing.JButton("Accueil");
    	txtURL= new javax.swing.JTextField("");
    	jEditorPaneNavigateur = new javax.swing.JEditorPane();
        lblStatus= new javax.swing.JLabel(" ");
        jScrollPaneNavigateur = new JScrollPane();
        jEditorPaneNavigateur.setEditable(false);
        jEditorPaneNavigateur.addHyperlinkListener(this);
    		
		initComponents();
		conteneurOnglet.setEnabled(false);
		
		conteneurOnglet.addChangeListener(new ListenerOnglet() );
		boutonAcceptActeur.addActionListener(new ListenerMAJActeur());
		boutonAcceptAllActeur.addActionListener(new ListenerMAJActeur());
		boutonRefusActeur.addActionListener(new ListenerMAJActeur());
	    boutonRefusAllActeur.addActionListener(new ListenerMAJActeur());
	    
		boutonAcceptProducteur.addActionListener(new ListenerMAJProducteur());
		boutonAcceptAllProducteur.addActionListener(new ListenerMAJProducteur());
		boutonRefusProducteur.addActionListener(new ListenerMAJProducteur());
	    boutonRefusAllProducteur.addActionListener(new ListenerMAJProducteur());
	    
		boutonAcceptRealisateur.addActionListener(new ListenerMAJRealisateur());
		boutonAcceptAllRealisateur.addActionListener(new ListenerMAJRealisateur());
		boutonRefusRealisateur.addActionListener(new ListenerMAJRealisateur());
	    boutonRefusAllRealisateur.addActionListener(new ListenerMAJRealisateur());
	    
	    boutonAcceptFilm.addActionListener(new ListenerMAJFilm());
		boutonAcceptAllFilm.addActionListener(new ListenerMAJFilm());
		boutonRefusFilm.addActionListener(new ListenerMAJFilm());
	    boutonRefusAllFilm.addActionListener(new ListenerMAJFilm());
	    
	    boutonAcceptPersonne.addActionListener(new ListenerMAJPersonne());
		boutonAcceptAllPersonne.addActionListener(new ListenerMAJPersonne());
		boutonRefusPersonne.addActionListener(new ListenerMAJPersonne());
	    boutonRefusAllPersonne.addActionListener(new ListenerMAJPersonne());
	    
	    boutonAcceptInscrit.addActionListener(new ListenerMAJInscrits());
	    boutonAcceptAllInscrit.addActionListener(new ListenerMAJInscrits());
	    boutonRefusInscrit.addActionListener(new ListenerMAJInscrits());
	    boutonRefusAllInscrit.addActionListener(new ListenerMAJInscrits());
	    
	    boutonAcceptRecompenseFilm.addActionListener(new ListenerMAJRecompenseFilm());
	    boutonAcceptAllRecompenseFilm.addActionListener(new ListenerMAJRecompenseFilm());
	    boutonRefusRecompenseFilm.addActionListener(new ListenerMAJRecompenseFilm());
	    boutonRefusAllRecompenseFilm.addActionListener(new ListenerMAJRecompenseFilm());
	    
	    boutonAcceptRecompensePersonne.addActionListener(new ListenerMAJRecompensePersonne());
	    boutonAcceptAllRecompensePersonne.addActionListener(new ListenerMAJRecompensePersonne());
	    boutonRefusRecompensePersonne.addActionListener(new ListenerMAJRecompensePersonne());
	    boutonRefusAllRecompensePersonne.addActionListener(new ListenerMAJRecompensePersonne());
	    
	    
	    boutonAccueilNavigateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	boutonAccueilNavigateurMouseClicked(evt);
            }
        });

        panelNavigateur.setLayout(new BorderLayout());
        JPanel pnlURL = new JPanel();
        pnlURL.setLayout(new BorderLayout());
        pnlURL.add(new JLabel("URL: "), BorderLayout.WEST);
        pnlURL.add(boutonAccueilNavigateur, BorderLayout.EAST);
        pnlURL.add(txtURL, BorderLayout.CENTER);
        panelNavigateur.add(pnlURL,BorderLayout.NORTH);

        jScrollPaneNavigateur = new JScrollPane(jEditorPaneNavigateur);
        panelNavigateur.add(jScrollPaneNavigateur, BorderLayout.CENTER);

        panelNavigateur.add(lblStatus, BorderLayout.SOUTH);
        txtURL.addActionListener(al);
        
	}
	
	 // Variables declaration - do not modify
	
	private javax.swing.JTextField txtURL;
	private javax.swing.JEditorPane jEditorPaneNavigateur;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JScrollPane jScrollPaneNavigateur;
    private javax.swing.JButton boutonAccueilNavigateur;
	
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
    private javax.swing.JButton boutonConnexion;
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
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JMenuItem jMenuItemRefresh;
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
    private javax.swing.JLabel labelNombreChiffreFilm;
    private javax.swing.JLabel labelNombreChiffreInscrit;
    private javax.swing.JLabel labelNombreChiffrePersonne;
    private javax.swing.JLabel labelNombreChiffreProducteur;
    private javax.swing.JLabel labelNombreChiffreRealisateur;
  	private javax.swing.JLabel labelNombreChiffreRecompenseFilm;
    private javax.swing.JLabel labelNombreChiffreRecompensePersonne;
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
        boutonConnexion = new javax.swing.JButton();
        panelGestionActeur = new javax.swing.JPanel();
        labelNombreTexteActeur = new javax.swing.JLabel();
        labelNombreChiffreActeur = new javax.swing.JLabel();
        labelAccueilActeur = new javax.swing.JLabel();
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
        labelNombreChiffreProducteur = new javax.swing.JLabel();
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
        labelNombreChiffreRealisateur = new javax.swing.JLabel();
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
        labelNombreChiffreFilm = new javax.swing.JLabel();
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
        labelNombreChiffreInscrit = new javax.swing.JLabel();
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
        labelNombreChiffreRecompenseFilm = new javax.swing.JLabel();
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
        labelNombreChiffreRecompensePersonne = new javax.swing.JLabel();
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
        labelNombreChiffrePersonne = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        jMenuItemQuitter = new javax.swing.JMenuItem();
        menuAutre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conteneurOnglet.setEnabled(false);

        labelMessage.setText("Merci de vous authentifier");

        labelLogin.setText("Login : ");

        labelPassword.setText("Mot de passe : ");

        boutonConnexion.setText("Connexion");
        boutonConnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonConnexionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelConnexionLayout = new javax.swing.GroupLayout(panelConnexion);
        panelConnexion.setLayout(panelConnexionLayout);
        panelConnexionLayout.setHorizontalGroup(
            panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConnexionLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(labelMessage)
                .addGap(317, 317, 317))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConnexionLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(boutonConnexion)
                .addGap(285, 285, 285))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(boutonConnexion)
                .addGap(133, 133, 133))
        );

        conteneurOnglet.addTab("Connexion", panelConnexion);

        labelNombreTexteActeur.setText("Nombre de mise à jour :");

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

        boutonRefusActeur.setText("Refuser la mise à jour sélectionnée");

        boutonAcceptActeur.setText("Accepter la mise à jour sélectionnée");

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
                .addContainerGap(170, Short.MAX_VALUE))
        );

        conteneurOnglet.addTab("Acteur", panelGestionActeur);

        labelAccueilProducteur.setText("Gestion des producteurs");

        labelNombreTexteProducteur.setText("Nombre de mise à jour :");

        labelListeProducteur.setText("Liste des mise à jour : ");

        listeProducteur.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListeProducteur.setViewportView(listeProducteur);

        boutonRefusAllProducteur.setText("Refuser toutes les mise à jour");

        boutonAcceptAllProducteur.setText("Accepter toutes les mise à jour");

        boutonRefusProducteur.setText("Refuser la mise à jour sélectionnée");

        boutonAcceptProducteur.setText("Accepter la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionProducteurLayout = new javax.swing.GroupLayout(panelGestionProducteur);
        panelGestionProducteur.setLayout(panelGestionProducteurLayout);
        panelGestionProducteurLayout.setHorizontalGroup(
            panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionProducteurLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boutonRefusProducteur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAcceptProducteur, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelGestionProducteurLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(labelNombreChiffreProducteur)
                .addContainerGap(515, Short.MAX_VALUE))
            .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelGestionProducteurLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(panelGestionProducteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelGestionProducteurLayout.createSequentialGroup()
                                    .addComponent(labelNombreTexteProducteur)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreProducteur)
                .addGap(61, 61, 61)
                .addComponent(boutonAcceptProducteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusProducteur)
                .addContainerGap(228, Short.MAX_VALUE))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Producteur", panelGestionProducteur);

        labelAccueilRealisateur.setText("Gestion des réalisateurs");

        labelNombreTexteRealisateur.setText("Nombre de mise à jour :");

        labelListeRealisateur.setText("Liste des mise à jour : ");

        listeRealisateur.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListeRealisateur.setViewportView(listeRealisateur);

        boutonRefusAllRealisateur.setText("Refuser toutes les mise à jour");

        boutonAcceptAllRealisateur.setText("Accepter toutes les mise à jour");

        boutonRefusRealisateur.setText("Refuser la mise à jour sélectionnée");

        boutonAcceptRealisateur.setText("Accepter la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionRealisateurLayout = new javax.swing.GroupLayout(panelGestionRealisateur);
        panelGestionRealisateur.setLayout(panelGestionRealisateurLayout);
        panelGestionRealisateurLayout.setHorizontalGroup(
            panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
                .addGroup(panelGestionRealisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGestionRealisateurLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(labelNombreChiffreRealisateur))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRealisateurLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(boutonRefusRealisateur, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRealisateurLayout.createSequentialGroup()
                        .addContainerGap(463, Short.MAX_VALUE)
                        .addComponent(boutonAcceptRealisateur)))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRealisateurLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreRealisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(boutonAcceptRealisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusRealisateur)
                .addGap(172, 172, 172))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Réalisateur", panelGestionRealisateur);

        labelAccueilFilm.setText("Gestion des films");

        labelNombreTexteFilm.setText("Nombre de mise à jour :");

        labelListeFilm.setText("Liste des mise à jour : ");

        listeFilm.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListeFilm.setViewportView(listeFilm);

        boutonRefusAllFilm.setText("Refuser toutes les mise à jour");

        boutonAcceptAllFilm.setText("Accepter toutes les mise à jour");

        boutonAcceptFilm.setText("Accepter la mise à jour sélectionnée");

        boutonRefusFilm.setText("Refuser la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionFilmLayout = new javax.swing.GroupLayout(panelGestionFilm);
        panelGestionFilm.setLayout(panelGestionFilmLayout);
        panelGestionFilmLayout.setHorizontalGroup(
            panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionFilmLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(panelGestionFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boutonRefusFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAcceptFilm, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelGestionFilmLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(labelNombreChiffreFilm)
                .addContainerGap(514, Short.MAX_VALUE))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreFilm)
                .addGap(62, 62, 62)
                .addComponent(boutonAcceptFilm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusFilm)
                .addContainerGap(227, Short.MAX_VALUE))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Film", panelGestionFilm);

        labelAccueilInscrit.setText("Gestion des inscrits");

        labelNombreTexteInscrit.setText("Nombre de mise à jour :");

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

        labelListeNouveauxInscrit.setText("Liste des nouveaux inscrits du mois : ");

        labelNouveauxInscrit.setText("Nombre Nouveaux Inscrit : ");

        boutonAcceptInscrit.setText("Accepter la mise à jour sélectionnée");

        boutonRefusInscrit.setText("Refuser la mise à jour sélectionnée");

        labelNombreChiffreInscrit.setText("113");

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
                        .addContainerGap(463, Short.MAX_VALUE)
                        .addGroup(panelGestionInscritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boutonRefusInscrit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutonAcceptInscrit, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panelGestionInscritLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(labelNombreChiffreInscrit)))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreInscrit)
                .addGap(66, 66, 66)
                .addComponent(boutonAcceptInscrit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusInscrit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Inscrits", panelGestionInscrit);

        labelAccueilRecompenseFilm.setText("Gestion des récompenses de film");

        labelNombreRecompenseFilm.setText("Nombre de mise à jour :");

        labelListeRecompenseFilm.setText("Liste des mise à jour : ");

        listeRecompenseFilm.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListeRecompenseFilm.setViewportView(listeRecompenseFilm);

        boutonRefusAllRecompenseFilm.setText("Refuser toutes les mise à jour");

        boutonAcceptAllRecompenseFilm.setText("Accepter toutes les mise à jour");

        boutonAcceptRecompenseFilm.setText("Accepter la mise à jour sélectionnée");

        boutonRefusRecompenseFilm.setText("Refuser la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionRecompenseFilmLayout = new javax.swing.GroupLayout(panelGestionRecompenseFilm);
        panelGestionRecompenseFilm.setLayout(panelGestionRecompenseFilmLayout);
        panelGestionRecompenseFilmLayout.setHorizontalGroup(
            panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRecompenseFilmLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(panelGestionRecompenseFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boutonRefusRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAcceptRecompenseFilm, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelGestionRecompenseFilmLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(labelNombreChiffreRecompenseFilm)
                .addContainerGap(515, Short.MAX_VALUE))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreRecompenseFilm)
                .addGap(77, 77, 77)
                .addComponent(boutonAcceptRecompenseFilm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusRecompenseFilm)
                .addContainerGap(212, Short.MAX_VALUE))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Récompense Film", panelGestionRecompenseFilm);

        labelAccueilRecompensePersonne.setText("Gestion des récompenses personnes");

        labelNombreTexteRecompensePersonne.setText("Nombre de mise à jour :");

        labelListeRecompensePersonne.setText("Liste des mise à jour : ");

        listeRecompensePersonne.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListeRecompensePersonne.setViewportView(listeRecompensePersonne);

        boutonRefusAllRecompensePersonne.setText("Refuser toutes les mise à jour");

        boutonAcceptAllRecompensePersonne.setText("Accepter toutes les mise à jour");

        boutonAcceptRecompensePersonne.setText("Accepter la mise à jour sélectionnée");

        boutonRefusRecompensePersonne.setText("Refuser la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionRecompensePersonneLayout = new javax.swing.GroupLayout(panelGestionRecompensePersonne);
        panelGestionRecompensePersonne.setLayout(panelGestionRecompensePersonneLayout);
        panelGestionRecompensePersonneLayout.setHorizontalGroup(
            panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRecompensePersonneLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(panelGestionRecompensePersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boutonRefusRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAcceptRecompensePersonne, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelGestionRecompensePersonneLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(labelNombreChiffreRecompensePersonne)
                .addContainerGap(515, Short.MAX_VALUE))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffreRecompensePersonne)
                .addGap(61, 61, 61)
                .addComponent(boutonAcceptRecompensePersonne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusRecompensePersonne)
                .addContainerGap(228, Short.MAX_VALUE))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Récompense Personne", panelGestionRecompensePersonne);

        javax.swing.GroupLayout panelNavigateurLayout = new javax.swing.GroupLayout(panelNavigateur);
        panelNavigateur.setLayout(panelNavigateurLayout);
        panelNavigateurLayout.setHorizontalGroup(
            panelNavigateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panelNavigateurLayout.setVerticalGroup(
            panelNavigateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
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

        labelNombreTextePersonne.setText("Nombre de mise à jour :");

        boutonAcceptPersonne.setText("Accepter la mise à jour sélectionnée");

        boutonRefusPersonne.setText("Refuser la mise à jour sélectionnée");

        javax.swing.GroupLayout panelGestionPersonneLayout = new javax.swing.GroupLayout(panelGestionPersonne);
        panelGestionPersonne.setLayout(panelGestionPersonneLayout);
        panelGestionPersonneLayout.setHorizontalGroup(
            panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionPersonneLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(panelGestionPersonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boutonRefusPersonne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAcceptPersonne, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelGestionPersonneLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(labelNombreChiffrePersonne)
                .addContainerGap(514, Short.MAX_VALUE))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
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
                .addGap(53, 53, 53)
                .addComponent(labelNombreChiffrePersonne)
                .addGap(69, 69, 69)
                .addComponent(boutonAcceptPersonne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRefusPersonne)
                .addContainerGap(220, Short.MAX_VALUE))
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
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        conteneurOnglet.addTab("Personne", panelGestionPersonne);

        menuFichier.setText("Fichier");
        
        jMenuItemRefresh.setText("Rafraichir");
        jMenuItemRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jMenuItemRefreshActionPerformed(evt);
            }

        });
        
        menuFichier.add(jMenuItemRefresh);

        jMenuItemQuitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemQuitter.setText("Quitter");
        jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitterActionPerformed(evt);
            }
        });
        menuFichier.add(jMenuItemQuitter);

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
    
    private void jMenuItemQuitterActionPerformed(ActionEvent evt) {
    	dispose(); 
		
	}
    
    private void jMenuItemRefreshActionPerformed(ActionEvent evt) {
    	GestionnaireRoleActeur gestact = new GestionnaireRoleActeur(); gestact.refresh();
    	GestionnairePersonne gestpers = new GestionnairePersonne(); gestpers.refresh();
    	GestionnaireRoleProducteur gestprod = new GestionnaireRoleProducteur(); gestprod.refresh();
    	GestionnaireRoleRealisateur gestreal = new GestionnaireRoleRealisateur(); gestreal.refresh();
    	GestionnaireFilm gestfilm = new GestionnaireFilm(); gestfilm.refresh();
    	GestionnaireInscrits gestinscrits = new GestionnaireInscrits(); gestinscrits.refresh();
    	GestionnaireRecompenseFilm gestrecompensefilm = new GestionnaireRecompenseFilm(); gestrecompensefilm.refresh();
    	GestionnaireRecompensePersonne gestrecompensepersonne = new GestionnaireRecompensePersonne(); gestrecompensepersonne.refresh();
	}
	
	public static Connection identification(String login, String Pass) throws SQLException{
    	final String DRIVER ="com.mysql.jdbc.Driver";
    	final String URL="jdbc:mysql://localhost/ald";
        Connection connect= null;
        try {
			Class.forName(DRIVER);

			connect=DriverManager.getConnection(URL,login,Pass);
			connect.setAutoCommit(false);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

        return connect;
    }
    
	private void boutonAccueilNavigateurMouseClicked(java.awt.event.MouseEvent evt) {	
		try {
			txtURL.setText("http://localhost:8080/sitewebald/vues/index.jsp");
			jEditorPaneNavigateur.setPage("http://localhost:8080/sitewebald/vues/index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    private void boutonConnexionMouseClicked(java.awt.event.MouseEvent evt) {
    	
    	String LOGIN=textfieldLogin.getText();
        String PASSWORD=textfieldPassword.getText();
    	
    	Connection co = null;

    	try {
    		co = identification(LOGIN, PASSWORD);
			if (co.isValid(1)) {
				conteneurOnglet.setEnabled(true);
				co.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(conteneurOnglet, "Acces refuse pour l'utilisateur.");
		}
    
}
    
    ActionListener al = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            try {
                String url = ae.getActionCommand().toLowerCase();
                if (url.startsWith("http://"))
                url = url.substring(7);
                jEditorPaneNavigateur.setPage("http://" + IDN.toASCII(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
 
  
    
	public javax.swing.JButton getBoutonAcceptActeur() {
		return boutonAcceptActeur;
	}
	public void setBoutonAcceptActeur(javax.swing.JButton boutonAcceptActeur) {
		this.boutonAcceptActeur = boutonAcceptActeur;
	}
	public javax.swing.JButton getBoutonAcceptAllActeur() {
		return boutonAcceptAllActeur;
	}
	public void setBoutonAcceptAllActeur(javax.swing.JButton boutonAcceptAllActeur) {
		this.boutonAcceptAllActeur = boutonAcceptAllActeur;
	}
	public javax.swing.JButton getBoutonAcceptAllFilm() {
		return boutonAcceptAllFilm;
	}
	public void setBoutonAcceptAllFilm(javax.swing.JButton boutonAcceptAllFilm) {
		this.boutonAcceptAllFilm = boutonAcceptAllFilm;
	}
	public javax.swing.JButton getBoutonAcceptAllInscrit() {
		return boutonAcceptAllInscrit;
	}
	public void setBoutonAcceptAllInscrit(javax.swing.JButton boutonAcceptAllInscrit) {
		this.boutonAcceptAllInscrit = boutonAcceptAllInscrit;
	}
	public javax.swing.JButton getBoutonAcceptAllPersonne() {
		return boutonAcceptAllPersonne;
	}
	public void setBoutonAcceptAllPersonne(
			javax.swing.JButton boutonAcceptAllPersonne) {
		this.boutonAcceptAllPersonne = boutonAcceptAllPersonne;
	}
	public javax.swing.JButton getBoutonAcceptAllProducteur() {
		return boutonAcceptAllProducteur;
	}
	public void setBoutonAcceptAllProducteur(
			javax.swing.JButton boutonAcceptAllProducteur) {
		this.boutonAcceptAllProducteur = boutonAcceptAllProducteur;
	}
	public javax.swing.JButton getBoutonAcceptAllRealisateur() {
		return boutonAcceptAllRealisateur;
	}
	public void setBoutonAcceptAllRealisateur(
			javax.swing.JButton boutonAcceptAllRealisateur) {
		this.boutonAcceptAllRealisateur = boutonAcceptAllRealisateur;
	}
	public javax.swing.JButton getBoutonAcceptAllRecompenseFilm() {
		return boutonAcceptAllRecompenseFilm;
	}
	public void setBoutonAcceptAllRecompenseFilm(
			javax.swing.JButton boutonAcceptAllRecompenseFilm) {
		this.boutonAcceptAllRecompenseFilm = boutonAcceptAllRecompenseFilm;
	}
	public javax.swing.JButton getBoutonAcceptAllRecompensePersonne() {
		return boutonAcceptAllRecompensePersonne;
	}
	public void setBoutonAcceptAllRecompensePersonne(
			javax.swing.JButton boutonAcceptAllRecompensePersonne) {
		this.boutonAcceptAllRecompensePersonne = boutonAcceptAllRecompensePersonne;
	}
	public javax.swing.JButton getBoutonAcceptFilm() {
		return boutonAcceptFilm;
	}
	public void setBoutonAcceptFilm(javax.swing.JButton boutonAcceptFilm) {
		this.boutonAcceptFilm = boutonAcceptFilm;
	}
	public javax.swing.JButton getBoutonAcceptInscrit() {
		return boutonAcceptInscrit;
	}
	public void setBoutonAcceptInscrit(javax.swing.JButton boutonAcceptInscrit) {
		this.boutonAcceptInscrit = boutonAcceptInscrit;
	}
	public javax.swing.JButton getBoutonAcceptPersonne() {
		return boutonAcceptPersonne;
	}
	public void setBoutonAcceptPersonne(javax.swing.JButton boutonAcceptPersonne) {
		this.boutonAcceptPersonne = boutonAcceptPersonne;
	}
	public javax.swing.JButton getBoutonAcceptProducteur() {
		return boutonAcceptProducteur;
	}
	public void setBoutonAcceptProducteur(javax.swing.JButton boutonAcceptProducteur) {
		this.boutonAcceptProducteur = boutonAcceptProducteur;
	}
	public javax.swing.JButton getBoutonAcceptRealisateur() {
		return boutonAcceptRealisateur;
	}
	public void setBoutonAcceptRealisateur(
			javax.swing.JButton boutonAcceptRealisateur) {
		this.boutonAcceptRealisateur = boutonAcceptRealisateur;
	}
	public javax.swing.JButton getBoutonAcceptRecompenseFilm() {
		return boutonAcceptRecompenseFilm;
	}
	public void setBoutonAcceptRecompenseFilm(
			javax.swing.JButton boutonAcceptRecompenseFilm) {
		this.boutonAcceptRecompenseFilm = boutonAcceptRecompenseFilm;
	}
	public javax.swing.JButton getBoutonAcceptRecompensePersonne() {
		return boutonAcceptRecompensePersonne;
	}
	public void setBoutonAcceptRecompensePersonne(
			javax.swing.JButton boutonAcceptRecompensePersonne) {
		this.boutonAcceptRecompensePersonne = boutonAcceptRecompensePersonne;
	}
	public javax.swing.JButton getBoutonRefusActeur() {
		return boutonRefusActeur;
	}
	public void setBoutonRefusActeur(javax.swing.JButton boutonRefusActeur) {
		this.boutonRefusActeur = boutonRefusActeur;
	}
	public javax.swing.JButton getBoutonRefusAllActeur() {
		return boutonRefusAllActeur;
	}
	public void setBoutonRefusAllActeur(javax.swing.JButton boutonRefusAllActeur) {
		this.boutonRefusAllActeur = boutonRefusAllActeur;
	}
	public javax.swing.JButton getBoutonRefusAllFilm() {
		return boutonRefusAllFilm;
	}
	public void setBoutonRefusAllFilm(javax.swing.JButton boutonRefusAllFilm) {
		this.boutonRefusAllFilm = boutonRefusAllFilm;
	}
	public javax.swing.JButton getBoutonRefusAllInscrit() {
		return boutonRefusAllInscrit;
	}
	public void setBoutonRefusAllInscrit(javax.swing.JButton boutonRefusAllInscrit) {
		this.boutonRefusAllInscrit = boutonRefusAllInscrit;
	}
	public javax.swing.JButton getBoutonRefusAllPersonne() {
		return boutonRefusAllPersonne;
	}
	public void setBoutonRefusAllPersonne(javax.swing.JButton boutonRefusAllPersonne) {
		this.boutonRefusAllPersonne = boutonRefusAllPersonne;
	}
	public javax.swing.JButton getBoutonRefusAllProducteur() {
		return boutonRefusAllProducteur;
	}
	public void setBoutonRefusAllProducteur(
			javax.swing.JButton boutonRefusAllProducteur) {
		this.boutonRefusAllProducteur = boutonRefusAllProducteur;
	}
	public javax.swing.JButton getBoutonRefusAllRealisateur() {
		return boutonRefusAllRealisateur;
	}
	public void setBoutonRefusAllRealisateur(
			javax.swing.JButton boutonRefusAllRealisateur) {
		this.boutonRefusAllRealisateur = boutonRefusAllRealisateur;
	}
	public javax.swing.JButton getBoutonRefusAllRecompenseFilm() {
		return boutonRefusAllRecompenseFilm;
	}
	public void setBoutonRefusAllRecompenseFilm(
			javax.swing.JButton boutonRefusAllRecompenseFilm) {
		this.boutonRefusAllRecompenseFilm = boutonRefusAllRecompenseFilm;
	}
	public javax.swing.JButton getBoutonRefusAllRecompensePersonne() {
		return boutonRefusAllRecompensePersonne;
	}
	public void setBoutonRefusAllRecompensePersonne(
			javax.swing.JButton boutonRefusAllRecompensePersonne) {
		this.boutonRefusAllRecompensePersonne = boutonRefusAllRecompensePersonne;
	}
	public javax.swing.JButton getBoutonRefusFilm() {
		return boutonRefusFilm;
	}
	public void setBoutonRefusFilm(javax.swing.JButton boutonRefusFilm) {
		this.boutonRefusFilm = boutonRefusFilm;
	}
	public javax.swing.JButton getBoutonRefusInscrit() {
		return boutonRefusInscrit;
	}
	public void setBoutonRefusInscrit(javax.swing.JButton boutonRefusInscrit) {
		this.boutonRefusInscrit = boutonRefusInscrit;
	}
	public javax.swing.JButton getBoutonRefusPersonne() {
		return boutonRefusPersonne;
	}
	public void setBoutonRefusPersonne(javax.swing.JButton boutonRefusPersonne) {
		this.boutonRefusPersonne = boutonRefusPersonne;
	}
	public javax.swing.JButton getBoutonRefusProducteur() {
		return boutonRefusProducteur;
	}
	public void setBoutonRefusProducteur(javax.swing.JButton boutonRefusProducteur) {
		this.boutonRefusProducteur = boutonRefusProducteur;
	}
	public javax.swing.JButton getBoutonRefusRealisateur() {
		return boutonRefusRealisateur;
	}
	public void setBoutonRefusRealisateur(javax.swing.JButton boutonRefusRealisateur) {
		this.boutonRefusRealisateur = boutonRefusRealisateur;
	}
	public javax.swing.JButton getBoutonRefusRecompenseFilm() {
		return boutonRefusRecompenseFilm;
	}
	public void setBoutonRefusRecompenseFilm(
			javax.swing.JButton boutonRefusRecompenseFilm) {
		this.boutonRefusRecompenseFilm = boutonRefusRecompenseFilm;
	}
	public javax.swing.JButton getBoutonRefusRecompensePersonne() {
		return boutonRefusRecompensePersonne;
	}
	public void setBoutonRefusRecompensePersonne(
			javax.swing.JButton boutonRefusRecompensePersonne) {
		this.boutonRefusRecompensePersonne = boutonRefusRecompensePersonne;
	}
	public javax.swing.JTabbedPane getConteneurOnglet() {
		return conteneurOnglet;
	}
	public void setConteneurOnglet(javax.swing.JTabbedPane conteneurOnglet) {
		this.conteneurOnglet = conteneurOnglet;
	}
	public javax.swing.JLabel getLabelAccueilActeur() {
		return labelAccueilActeur;
	}
	public void setLabelAccueilActeur(javax.swing.JLabel labelAccueilActeur) {
		this.labelAccueilActeur = labelAccueilActeur;
	}
	public javax.swing.JLabel getLabelAccueilFilm() {
		return labelAccueilFilm;
	}
	public void setLabelAccueilFilm(javax.swing.JLabel labelAccueilFilm) {
		this.labelAccueilFilm = labelAccueilFilm;
	}
	public javax.swing.JLabel getLabelAccueilInscrit() {
		return labelAccueilInscrit;
	}
	public void setLabelAccueilInscrit(javax.swing.JLabel labelAccueilInscrit) {
		this.labelAccueilInscrit = labelAccueilInscrit;
	}
	public javax.swing.JLabel getLabelAccueilPersonne() {
		return labelAccueilPersonne;
	}
	public void setLabelAccueilPersonne(javax.swing.JLabel labelAccueilPersonne) {
		this.labelAccueilPersonne = labelAccueilPersonne;
	}
	public javax.swing.JLabel getLabelAccueilProducteur() {
		return labelAccueilProducteur;
	}
	public void setLabelAccueilProducteur(javax.swing.JLabel labelAccueilProducteur) {
		this.labelAccueilProducteur = labelAccueilProducteur;
	}
	public javax.swing.JLabel getLabelAccueilRealisateur() {
		return labelAccueilRealisateur;
	}
	public void setLabelAccueilRealisateur(
			javax.swing.JLabel labelAccueilRealisateur) {
		this.labelAccueilRealisateur = labelAccueilRealisateur;
	}
	public javax.swing.JLabel getLabelAccueilRecompenseFilm() {
		return labelAccueilRecompenseFilm;
	}
	public void setLabelAccueilRecompenseFilm(
			javax.swing.JLabel labelAccueilRecompenseFilm) {
		this.labelAccueilRecompenseFilm = labelAccueilRecompenseFilm;
	}
	public javax.swing.JLabel getLabelAccueilRecompensePersonne() {
		return labelAccueilRecompensePersonne;
	}
	public void setLabelAccueilRecompensePersonne(
			javax.swing.JLabel labelAccueilRecompensePersonne) {
		this.labelAccueilRecompensePersonne = labelAccueilRecompensePersonne;
	}
	public javax.swing.JLabel getLabelListeActeur() {
		return labelListeActeur;
	}
	public void setLabelListeActeur(javax.swing.JLabel labelListeActeur) {
		this.labelListeActeur = labelListeActeur;
	}
	public javax.swing.JLabel getLabelListeFilm() {
		return labelListeFilm;
	}
	public void setLabelListeFilm(javax.swing.JLabel labelListeFilm) {
		this.labelListeFilm = labelListeFilm;
	}
	public javax.swing.JLabel getLabelListeInscrit() {
		return labelListeInscrit;
	}
	public void setLabelListeInscrit(javax.swing.JLabel labelListeInscrit) {
		this.labelListeInscrit = labelListeInscrit;
	}
	public javax.swing.JLabel getLabelListeNouveauxInscrit() {
		return labelListeNouveauxInscrit;
	}
	public void setLabelListeNouveauxInscrit(
			javax.swing.JLabel labelListeNouveauxInscrit) {
		this.labelListeNouveauxInscrit = labelListeNouveauxInscrit;
	}
	public javax.swing.JLabel getLabelListePersonne() {
		return labelListePersonne;
	}
	public void setLabelListePersonne(javax.swing.JLabel labelListePersonne) {
		this.labelListePersonne = labelListePersonne;
	}
	public javax.swing.JLabel getLabelListeProducteur() {
		return labelListeProducteur;
	}
	public void setLabelListeProducteur(javax.swing.JLabel labelListeProducteur) {
		this.labelListeProducteur = labelListeProducteur;
	}
	public javax.swing.JLabel getLabelListeRealisateur() {
		return labelListeRealisateur;
	}
	public void setLabelListeRealisateur(javax.swing.JLabel labelListeRealisateur) {
		this.labelListeRealisateur = labelListeRealisateur;
	}
	public javax.swing.JLabel getLabelListeRecompenseFilm() {
		return labelListeRecompenseFilm;
	}
	public void setLabelListeRecompenseFilm(
			javax.swing.JLabel labelListeRecompenseFilm) {
		this.labelListeRecompenseFilm = labelListeRecompenseFilm;
	}
	public javax.swing.JLabel getLabelListeRecompensePersonne() {
		return labelListeRecompensePersonne;
	}
	public void setLabelListeRecompensePersonne(
			javax.swing.JLabel labelListeRecompensePersonne) {
		this.labelListeRecompensePersonne = labelListeRecompensePersonne;
	}
	public javax.swing.JLabel getLabelLogin() {
		return labelLogin;
	}
	public void setLabelLogin(javax.swing.JLabel labelLogin) {
		this.labelLogin = labelLogin;
	}
	public javax.swing.JLabel getLabelMessage() {
		return labelMessage;
	}
	public void setLabelMessage(javax.swing.JLabel labelMessage) {
		this.labelMessage = labelMessage;
	}
	public javax.swing.JLabel getLabelNombreChiffreActeur() {
		return labelNombreChiffreActeur;
	}
	public void setLabelNombreChiffreActeur(
			javax.swing.JLabel labelNombreChiffreActeur) {
		this.labelNombreChiffreActeur = labelNombreChiffreActeur;
	}
	public javax.swing.JLabel getLabelNombreRecompenseFilm() {
		return labelNombreRecompenseFilm;
	}
	public void setLabelNombreRecompenseFilm(
			javax.swing.JLabel labelNombreRecompenseFilm) {
		this.labelNombreRecompenseFilm = labelNombreRecompenseFilm;
	}
	public javax.swing.JLabel getLabelNombreTexteActeur() {
		return labelNombreTexteActeur;
	}
	public void setLabelNombreTexteActeur(javax.swing.JLabel labelNombreTexteActeur) {
		this.labelNombreTexteActeur = labelNombreTexteActeur;
	}
	public javax.swing.JLabel getLabelNombreTexteFilm() {
		return labelNombreTexteFilm;
	}
	public void setLabelNombreTexteFilm(javax.swing.JLabel labelNombreTexteFilm) {
		this.labelNombreTexteFilm = labelNombreTexteFilm;
	}
	public javax.swing.JLabel getLabelNombreTexteInscrit() {
		return labelNombreTexteInscrit;
	}
	public void setLabelNombreTexteInscrit(
			javax.swing.JLabel labelNombreTexteInscrit) {
		this.labelNombreTexteInscrit = labelNombreTexteInscrit;
	}
	public javax.swing.JLabel getLabelNombreTextePersonne() {
		return labelNombreTextePersonne;
	}
	public void setLabelNombreTextePersonne(
			javax.swing.JLabel labelNombreTextePersonne) {
		this.labelNombreTextePersonne = labelNombreTextePersonne;
	}
	public javax.swing.JLabel getLabelNombreTexteProducteur() {
		return labelNombreTexteProducteur;
	}
	public void setLabelNombreTexteProducteur(
			javax.swing.JLabel labelNombreTexteProducteur) {
		this.labelNombreTexteProducteur = labelNombreTexteProducteur;
	}
	public javax.swing.JLabel getLabelNombreTexteRealisateur() {
		return labelNombreTexteRealisateur;
	}
	public void setLabelNombreTexteRealisateur(
			javax.swing.JLabel labelNombreTexteRealisateur) {
		this.labelNombreTexteRealisateur = labelNombreTexteRealisateur;
	}
	public javax.swing.JLabel getLabelNombreTexteRecompensePersonne() {
		return labelNombreTexteRecompensePersonne;
	}
	public void setLabelNombreTexteRecompensePersonne(
			javax.swing.JLabel labelNombreTexteRecompensePersonne) {
		this.labelNombreTexteRecompensePersonne = labelNombreTexteRecompensePersonne;
	}
	public javax.swing.JLabel getLabelNouveauxInscrit() {
		return labelNouveauxInscrit;
	}
	public void setLabelNouveauxInscrit(javax.swing.JLabel labelNouveauxInscrit) {
		this.labelNouveauxInscrit = labelNouveauxInscrit;
	}
	public javax.swing.JLabel getLabelNouveauxInscritNombre() {
		return labelNouveauxInscritNombre;
	}
	public void setLabelNouveauxInscritNombre(
			javax.swing.JLabel labelNouveauxInscritNombre) {
		this.labelNouveauxInscritNombre = labelNouveauxInscritNombre;
	}
	public javax.swing.JLabel getLabelPassword() {
		return labelPassword;
	}
	public void setLabelPassword(javax.swing.JLabel labelPassword) {
		this.labelPassword = labelPassword;
	}
	public javax.swing.JList getListeActeur() {
		return listeActeur;
	}
	public void setListeActeur(javax.swing.JList listeActeur) {
		this.listeActeur = listeActeur;
	}
	public javax.swing.JList getListeFilm() {
		return listeFilm;
	}
	public void setListeFilm(javax.swing.JList listeFilm) {
		this.listeFilm = listeFilm;
	}
	public javax.swing.JList getListeInscrit() {
		return listeInscrit;
	}
	public void setListeInscrit(javax.swing.JList listeInscrit) {
		this.listeInscrit = listeInscrit;
	}
	public javax.swing.JList getListeNouveauxInscrit() {
		return listeNouveauxInscrit;
	}
	public void setListeNouveauxInscrit(javax.swing.JList listeNouveauxInscrit) {
		this.listeNouveauxInscrit = listeNouveauxInscrit;
	}
	public javax.swing.JList getListePersonne() {
		return listePersonne;
	}
	public void setListePersonne(javax.swing.JList listePersonne) {
		this.listePersonne = listePersonne;
	}
	public javax.swing.JList getListeProducteur() {
		return listeProducteur;
	}
	public void setListeProducteur(javax.swing.JList listeProducteur) {
		this.listeProducteur = listeProducteur;
	}
	public javax.swing.JList getListeRealisateur() {
		return listeRealisateur;
	}
	public void setListeRealisateur(javax.swing.JList listeRealisateur) {
		this.listeRealisateur = listeRealisateur;
	}
	public javax.swing.JList getListeRecompenseFilm() {
		return listeRecompenseFilm;
	}
	public void setListeRecompenseFilm(javax.swing.JList listeRecompenseFilm) {
		this.listeRecompenseFilm = listeRecompenseFilm;
	}
	public javax.swing.JList getListeRecompensePersonne() {
		return listeRecompensePersonne;
	}
	public void setListeRecompensePersonne(javax.swing.JList listeRecompensePersonne) {
		this.listeRecompensePersonne = listeRecompensePersonne;
	}
	public javax.swing.JMenu getMenuAutre() {
		return menuAutre;
	}
	public void setMenuAutre(javax.swing.JMenu menuAutre) {
		this.menuAutre = menuAutre;
	}
	
	public void setMenuBar(javax.swing.JMenuBar menuBar) {
		this.menuBar = menuBar;
	}
	public javax.swing.JMenu getMenuFichier() {
		return menuFichier;
	}
	public void setMenuFichier(javax.swing.JMenu menuFichier) {
		this.menuFichier = menuFichier;
	}
	public javax.swing.JPanel getPanelConnexion() {
		return panelConnexion;
	}
	public void setPanelConnexion(javax.swing.JPanel panelConnexion) {
		this.panelConnexion = panelConnexion;
	}
	public javax.swing.JPanel getPanelGestionActeur() {
		return panelGestionActeur;
	}
	public void setPanelGestionActeur(javax.swing.JPanel panelGestionActeur) {
		this.panelGestionActeur = panelGestionActeur;
	}
	public javax.swing.JPanel getPanelGestionFilm() {
		return panelGestionFilm;
	}
	public void setPanelGestionFilm(javax.swing.JPanel panelGestionFilm) {
		this.panelGestionFilm = panelGestionFilm;
	}
	public javax.swing.JPanel getPanelGestionInscrit() {
		return panelGestionInscrit;
	}
	public void setPanelGestionInscrit(javax.swing.JPanel panelGestionInscrit) {
		this.panelGestionInscrit = panelGestionInscrit;
	}
	public javax.swing.JPanel getPanelGestionPersonne() {
		return panelGestionPersonne;
	}
	public void setPanelGestionPersonne(javax.swing.JPanel panelGestionPersonne) {
		this.panelGestionPersonne = panelGestionPersonne;
	}
	public javax.swing.JPanel getPanelGestionProducteur() {
		return panelGestionProducteur;
	}
	public void setPanelGestionProducteur(javax.swing.JPanel panelGestionProducteur) {
		this.panelGestionProducteur = panelGestionProducteur;
	}
	public javax.swing.JPanel getPanelGestionRealisateur() {
		return panelGestionRealisateur;
	}
	public void setPanelGestionRealisateur(
			javax.swing.JPanel panelGestionRealisateur) {
		this.panelGestionRealisateur = panelGestionRealisateur;
	}
	public javax.swing.JPanel getPanelGestionRecompenseFilm() {
		return panelGestionRecompenseFilm;
	}
	public void setPanelGestionRecompenseFilm(
			javax.swing.JPanel panelGestionRecompenseFilm) {
		this.panelGestionRecompenseFilm = panelGestionRecompenseFilm;
	}
	public javax.swing.JPanel getPanelGestionRecompensePersonne() {
		return panelGestionRecompensePersonne;
	}
	public void setPanelGestionRecompensePersonne(
			javax.swing.JPanel panelGestionRecompensePersonne) {
		this.panelGestionRecompensePersonne = panelGestionRecompensePersonne;
	}
	public javax.swing.JPanel getPanelNavigateur() {
		return panelNavigateur;
	}
	public void setPanelNavigateur(javax.swing.JPanel panelNavigateur) {
		this.panelNavigateur = panelNavigateur;
	}
	public javax.swing.JScrollPane getScrollPaneListeActeur() {
		return scrollPaneListeActeur;
	}
	public void setScrollPaneListeActeur(
			javax.swing.JScrollPane scrollPaneListeActeur) {
		this.scrollPaneListeActeur = scrollPaneListeActeur;
	}
	public javax.swing.JScrollPane getScrollPaneListeFilm() {
		return scrollPaneListeFilm;
	}
	public void setScrollPaneListeFilm(javax.swing.JScrollPane scrollPaneListeFilm) {
		this.scrollPaneListeFilm = scrollPaneListeFilm;
	}
	public javax.swing.JScrollPane getScrollPaneListeInscrit() {
		return scrollPaneListeInscrit;
	}
	public void setScrollPaneListeInscrit(
			javax.swing.JScrollPane scrollPaneListeInscrit) {
		this.scrollPaneListeInscrit = scrollPaneListeInscrit;
	}
	public javax.swing.JScrollPane getScrollPaneListeNouveauxInscrit() {
		return scrollPaneListeNouveauxInscrit;
	}
	public void setScrollPaneListeNouveauxInscrit(
			javax.swing.JScrollPane scrollPaneListeNouveauxInscrit) {
		this.scrollPaneListeNouveauxInscrit = scrollPaneListeNouveauxInscrit;
	}
	public javax.swing.JScrollPane getScrollPaneListePersonne() {
		return scrollPaneListePersonne;
	}
	public void setScrollPaneListePersonne(
			javax.swing.JScrollPane scrollPaneListePersonne) {
		this.scrollPaneListePersonne = scrollPaneListePersonne;
	}
	public javax.swing.JScrollPane getScrollPaneListeProducteur() {
		return scrollPaneListeProducteur;
	}
	public void setScrollPaneListeProducteur(
			javax.swing.JScrollPane scrollPaneListeProducteur) {
		this.scrollPaneListeProducteur = scrollPaneListeProducteur;
	}
	public javax.swing.JScrollPane getScrollPaneListeRealisateur() {
		return scrollPaneListeRealisateur;
	}
	public void setScrollPaneListeRealisateur(
			javax.swing.JScrollPane scrollPaneListeRealisateur) {
		this.scrollPaneListeRealisateur = scrollPaneListeRealisateur;
	}
	public javax.swing.JScrollPane getScrollPaneListeRecompenseFilm() {
		return scrollPaneListeRecompenseFilm;
	}
	public void setScrollPaneListeRecompenseFilm(
			javax.swing.JScrollPane scrollPaneListeRecompenseFilm) {
		this.scrollPaneListeRecompenseFilm = scrollPaneListeRecompenseFilm;
	}
	public javax.swing.JScrollPane getScrollPaneListeRecompensePersonne() {
		return scrollPaneListeRecompensePersonne;
	}
	public void setScrollPaneListeRecompensePersonne(
			javax.swing.JScrollPane scrollPaneListeRecompensePersonne) {
		this.scrollPaneListeRecompensePersonne = scrollPaneListeRecompensePersonne;
	}
	public javax.swing.JTextField getTextfieldLogin() {
		return textfieldLogin;
	}
	public void setTextfieldLogin(javax.swing.JTextField textfieldLogin) {
		this.textfieldLogin = textfieldLogin;
	}
	public javax.swing.JTextField getTextfieldPassword() {
		return textfieldPassword;
	}
	public void setTextfieldPassword(javax.swing.JTextField textfieldPassword) {
		this.textfieldPassword = textfieldPassword;
	}
	public static void setInstance(AffichageGestionnaire instance) {
		AffichageGestionnaire.instance = instance;
	}
	@Override
	public void hyperlinkUpdate(HyperlinkEvent event) {
		if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
	          try {
	        	jEditorPaneNavigateur.setPage(event.getURL());
	            txtURL.setText(event.getURL().toExternalForm());
	          } catch(IOException ioe) {
	            
	          }
	        }
		
	}
	public void setLabelNombreChiffreProducteur(
			javax.swing.JLabel labelNombreChiffreProducteur) {
		this.labelNombreChiffreProducteur = labelNombreChiffreProducteur;
	}
	public javax.swing.JLabel getLabelNombreChiffreProducteur() {
		return labelNombreChiffreProducteur;
	}
	  public javax.swing.JLabel getLabelNombreChiffreFilm() {
			return labelNombreChiffreFilm;
		}
		public void setLabelNombreChiffreFilm(javax.swing.JLabel labelNombreChiffreFilm) {
			this.labelNombreChiffreFilm = labelNombreChiffreFilm;
		}
		public javax.swing.JLabel getLabelNombreChiffreInscrit() {
			return labelNombreChiffreInscrit;
		}
		public void setLabelNombreChiffreInscrit(
				javax.swing.JLabel labelNombreChiffreInscrit) {
			this.labelNombreChiffreInscrit = labelNombreChiffreInscrit;
		}
		public javax.swing.JLabel getLabelNombreChiffrePersonne() {
			return labelNombreChiffrePersonne;
		}
		public void setLabelNombreChiffrePersonne(
				javax.swing.JLabel labelNombreChiffrePersonne) {
			this.labelNombreChiffrePersonne = labelNombreChiffrePersonne;
		}
		public javax.swing.JLabel getLabelNombreChiffreRealisateur() {
			return labelNombreChiffreRealisateur;
		}
		public void setLabelNombreChiffreRealisateur(
				javax.swing.JLabel labelNombreChiffreRealisateur) {
			this.labelNombreChiffreRealisateur = labelNombreChiffreRealisateur;
		}
		public javax.swing.JLabel getLabelNombreChiffreRecompenseFilm() {
			return labelNombreChiffreRecompenseFilm;
		}
		public void setLabelNombreChiffreRecompenseFilm(
				javax.swing.JLabel labelNombreChiffreRecompenseFilm) {
			this.labelNombreChiffreRecompenseFilm = labelNombreChiffreRecompenseFilm;
		}
		public javax.swing.JLabel getLabelNombreChiffreRecompensePersonne() {
			return labelNombreChiffreRecompensePersonne;
		}
		public void setLabelNombreChiffreRecompensePersonne(
				javax.swing.JLabel labelNombreChiffreRecompensePersonne) {
			this.labelNombreChiffreRecompensePersonne = labelNombreChiffreRecompensePersonne;
		}
		public javax.swing.JTextField getTxtURL() {
			return txtURL;
		}
		public void setTxtURL(javax.swing.JTextField txtURL) {
			this.txtURL = txtURL;
		}
		public javax.swing.JEditorPane getjEditorPaneNavigateur() {
			return jEditorPaneNavigateur;
		}
		public void setjEditorPaneNavigateur(
				javax.swing.JEditorPane jEditorPaneNavigateur) {
			this.jEditorPaneNavigateur = jEditorPaneNavigateur;
		}
	   
		
		
}
