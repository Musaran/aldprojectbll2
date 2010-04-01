-- phpMyAdmin SQL Dump
-- version 3.2.1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- G�n�r� le : Jeu 01 Avril 2010 � 15:58
-- Version du serveur: 5.1.37
-- Version de PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de donn�es: `ald`
--

-- --------------------------------------------------------

--
-- Structure de la table `estunacteur`
--

CREATE TABLE IF NOT EXISTS `estunacteur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidateacteur` int(11) NOT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunacteur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `estunacteur`
--


-- --------------------------------------------------------

--
-- Structure de la table `estunproducteur`
--

CREATE TABLE IF NOT EXISTS `estunproducteur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidateproducteur` int(11) NOT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunproducteur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `estunproducteur`
--


-- --------------------------------------------------------

--
-- Structure de la table `estunrealisateur`
--

CREATE TABLE IF NOT EXISTS `estunrealisateur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidaterealisateur` int(11) NOT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunrealisateur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `estunrealisateur`
--


-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE IF NOT EXISTS `evaluation` (
  `idfilm` int(11) NOT NULL,
  `idprofessionnel` int(11) NOT NULL,
  `note` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfilm`,`idprofessionnel`),
  KEY `FK_evaluation_idprofessionnel` (`idprofessionnel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `evaluation`
--


-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `idfilm` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) DEFAULT NULL,
  `datesortie` date DEFAULT NULL,
  `photoaffiche` varchar(255) DEFAULT NULL,
  `cout` int(255) DEFAULT NULL,
  `isvalidatefilm` int(1) DEFAULT NULL,
  `notemoyenne` float DEFAULT NULL,
  `nombrerequetefilm` int(11) DEFAULT NULL,
  `synopsis` text,
  PRIMARY KEY (`idfilm`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `film`
--


-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `idpersonne` int(11) NOT NULL AUTO_INCREMENT,
  `datenaissance` date DEFAULT NULL,
  `photopersonne` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `isvalidatepersonne` int(11) DEFAULT NULL,
  `nombrerequetepersonne` int(11) DEFAULT NULL,
  `biographie` text,
  PRIMARY KEY (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `personne`
--


-- --------------------------------------------------------

--
-- Structure de la table `professionnel`
--

CREATE TABLE IF NOT EXISTS `professionnel` (
  `idprofessionnel` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `derniereconnexion` date DEFAULT NULL,
  `nompro` varchar(255) NOT NULL,
  `adressepro` varchar(255) NOT NULL,
  `prenompro` varchar(255) NOT NULL,
  PRIMARY KEY (`idprofessionnel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `professionnel`
--


-- --------------------------------------------------------

--
-- Structure de la table `recompense`
--

CREATE TABLE IF NOT EXISTS `recompense` (
  `idrecompense` int(11) NOT NULL AUTO_INCREMENT,
  `titrerecompense` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idrecompense`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `recompense`
--


-- --------------------------------------------------------

--
-- Structure de la table `recompensefilm`
--

CREATE TABLE IF NOT EXISTS `recompensefilm` (
  `idrecompense` int(11) NOT NULL,
  `idfilm` int(11) NOT NULL,
  `anneerecompensefilm` int(11) NOT NULL DEFAULT '0',
  `idtyperecompensefilm` int(11) NOT NULL,
  PRIMARY KEY (`idrecompense`,`idfilm`,`anneerecompensefilm`,`idtyperecompensefilm`),
  KEY `FK_recompensefilm_idfilm` (`idfilm`),
  KEY `FK_recompensefilm_idtyperecompensefilm` (`idtyperecompensefilm`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompensefilm`
--


-- --------------------------------------------------------

--
-- Structure de la table `recompensepersonne`
--

CREATE TABLE IF NOT EXISTS `recompensepersonne` (
  `idrecompense` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `idtyperecompensepersonne` int(11) NOT NULL,
  `anneerecompensepersonne` int(11) NOT NULL,
  PRIMARY KEY (`idrecompense`,`idpersonne`,`idtyperecompensepersonne`,`anneerecompensepersonne`),
  KEY `FK_recompensepersonne_idtyperecompensepersonne` (`idtyperecompensepersonne`),
  KEY `FK_recompensepersonne_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompensepersonne`
--


-- --------------------------------------------------------

--
-- Structure de la table `typerecompensefilm`
--

CREATE TABLE IF NOT EXISTS `typerecompensefilm` (
  `idtyperecompensefilm` int(11) NOT NULL AUTO_INCREMENT,
  `nomtyperecompensefilm` varchar(255) NOT NULL,
  PRIMARY KEY (`idtyperecompensefilm`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `typerecompensefilm`
--


-- --------------------------------------------------------

--
-- Structure de la table `typerecompensepersonne`
--

CREATE TABLE IF NOT EXISTS `typerecompensepersonne` (
  `idtyperecompensepersonne` int(11) NOT NULL AUTO_INCREMENT,
  `nomtyperecompensepersonne` varchar(255) NOT NULL,
  PRIMARY KEY (`idtyperecompensepersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `typerecompensepersonne`
--
