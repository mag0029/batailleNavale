package com.mgiraud.bataillenavale;

import com.mgiraud.bataillenavale.entities.bateaux.*;
import com.mgiraud.bataillenavale.entities.cartes.Carte;
import com.mgiraud.bataillenavale.entities.cartes.Cases;
import com.mgiraud.bataillenavale.entities.joueurs.Joueur;
import com.mgiraud.bataillenavale.entities.manager.Jeu;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		Carte modeleCarte = new Carte(8,8);
		Jeu game = new Jeu();
		
		game.initialiseBateaux(j1, modeleCarte, 1, 2, 2, 1);
		for (Default_bateau b : j1.getBateaux()) {
			for (Cases casex : b.getPlacement()) {
				System.out.println(casex.getType()+" "+casex.getPosX()+" "+casex.getPosY());
			}
			
		}
		
		j2.ajoutBateau(new Corvette(" a "), modeleCarte);
		j2.ajoutBateau(new Destroyer(" b "), modeleCarte);
		j2.ajoutBateau(new Destroyer(" c "), modeleCarte);
		j2.ajoutBateau(new Croiseur(" d "), modeleCarte);
		j2.ajoutBateau(new Croiseur(" e "), modeleCarte);
		j2.ajoutBateau(new PorteAvion(" f "), modeleCarte);
		
		modeleCarte.AfficheCarteBateaux(j1.getBateaux());
		modeleCarte.AfficheCarteBateaux(j2.getBateaux());
		
		
		
		
		
		
	}

}
