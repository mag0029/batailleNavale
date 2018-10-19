package com.mgiraud.bataillenavale.entities.manager;

import com.mgiraud.bataillenavale.entities.bateaux.Corvette;
import com.mgiraud.bataillenavale.entities.bateaux.Croiseur;
import com.mgiraud.bataillenavale.entities.bateaux.Destroyer;
import com.mgiraud.bataillenavale.entities.bateaux.PorteAvion;
import com.mgiraud.bataillenavale.entities.cartes.Carte;
import com.mgiraud.bataillenavale.entities.joueurs.Joueur;

public class Jeu {
	
	private int nbTours;
	
	public Jeu () {
		nbTours = 0;
		
	}

	public void initialiseBateaux(Joueur joueurInit,Carte map, int nbCorvette, int nbDestroyer, int nbCroiseur, int nbPorteAvion) {
		char id = 'a';
		for (int i = 0; i < nbCorvette; i++) {
			joueurInit.ajoutBateau(new Corvette(" "+id+" "), map);
			id++;
		}
		for (int i = 0; i < nbDestroyer; i++) {
			joueurInit.ajoutBateau(new Destroyer(" "+id+" "), map);
			id++;
		}
		for (int i = 0; i < nbCroiseur; i++) {
			joueurInit.ajoutBateau(new Croiseur(" "+id+" "), map);
			id++;
		}
		for (int i = 0; i < nbPorteAvion; i++) {
			joueurInit.ajoutBateau(new PorteAvion(" "+id+" "), map);
			id++;
		}
	}
	
	public void lancerTour(Joueur joueurActif, Joueur joueurCible) {
		
		
	}
	
}
