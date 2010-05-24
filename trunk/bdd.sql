-- phpMyAdmin SQL Dump
-- version 3.2.1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Lun 24 Mai 2010 à 13:51
-- Version du serveur: 5.1.37
-- Version de PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de données: `ald`
--

-- --------------------------------------------------------

--
-- Structure de la table `estunacteur`
--

CREATE TABLE IF NOT EXISTS `estunacteur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidateacteur` int(1) DEFAULT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunacteur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `estunproducteur`
--

CREATE TABLE IF NOT EXISTS `estunproducteur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidateproducteur` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunproducteur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `estunrealisateur`
--

CREATE TABLE IF NOT EXISTS `estunrealisateur` (
  `idfilm` int(11) NOT NULL,
  `idpersonne` int(11) NOT NULL,
  `isvalidaterealisateur` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfilm`,`idpersonne`),
  KEY `FK_estunrealisateur_idpersonne` (`idpersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE IF NOT EXISTS `evaluation` (
  `idfilm` int(11) NOT NULL,
  `professionnel` varchar(255) NOT NULL,
  `note` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfilm`,`professionnel`),
  KEY `FK_evaluation_idprofessionnel` (`professionnel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
  `urlaffiche` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idfilm`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=45 ;

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
  `urlphoto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idpersonne`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

-- --------------------------------------------------------

--
-- Structure de la table `professionnel`
--

CREATE TABLE IF NOT EXISTS `professionnel` (
  `login` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) DEFAULT NULL,
  `derniereconnexion` date DEFAULT NULL,
  `nompro` varchar(255) NOT NULL,
  `adressepro` varchar(255) NOT NULL,
  `prenompro` varchar(255) NOT NULL,
  `dateinscription` date DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recompense`
--

CREATE TABLE IF NOT EXISTS `recompense` (
  `idrecompense` int(11) NOT NULL AUTO_INCREMENT,
  `titrerecompense` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idrecompense`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- Structure de la table `recompensefilm`
--

CREATE TABLE IF NOT EXISTS `recompensefilm` (
  `idfilm` int(11) NOT NULL,
  `anneerecompensefilm` int(11) NOT NULL DEFAULT '0',
  `idtyperecompensefilm` int(11) NOT NULL,
  `idrecompense` int(11) NOT NULL,
  `isvalidaterecompensefilm` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idfilm`,`anneerecompensefilm`,`idtyperecompensefilm`,`idrecompense`),
  KEY `FK_recompensefilm_idtyperecompensefilm` (`idtyperecompensefilm`),
  KEY `idrecompense` (`idrecompense`),
  KEY `idfilm` (`idfilm`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recompensepersonne`
--

CREATE TABLE IF NOT EXISTS `recompensepersonne` (
  `idpersonne` int(11) NOT NULL,
  `idtyperecompensepersonne` int(11) NOT NULL,
  `anneerecompensepersonne` int(11) NOT NULL,
  `isvalidaterecompensepersonne` int(1) NOT NULL DEFAULT '0',
  `idrecompense` int(11) NOT NULL,
  PRIMARY KEY (`idpersonne`,`idtyperecompensepersonne`,`anneerecompensepersonne`,`isvalidaterecompensepersonne`),
  KEY `FK_recompensepersonne_idtyperecompensepersonne` (`idtyperecompensepersonne`),
  KEY `FK_recompensepersonne_idpersonne` (`idpersonne`),
  KEY `idrecompense` (`idrecompense`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `typerecompensefilm`
--

CREATE TABLE IF NOT EXISTS `typerecompensefilm` (
  `idtyperecompensefilm` int(11) NOT NULL AUTO_INCREMENT,
  `nomtyperecompensefilm` varchar(255) NOT NULL,
  PRIMARY KEY (`idtyperecompensefilm`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Structure de la table `typerecompensepersonne`
--

CREATE TABLE IF NOT EXISTS `typerecompensepersonne` (
  `idtyperecompensepersonne` int(11) NOT NULL AUTO_INCREMENT,
  `nomtyperecompensepersonne` varchar(255) NOT NULL,
  PRIMARY KEY (`idtyperecompensepersonne`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;
