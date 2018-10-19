package com.mgiraud.bataillenavale.entities.joueurs;

import java.util.ArrayList;

import com.mgiraud.bataillenavale.entities.bateaux.*;
import com.mgiraud.bataillenavale.entities.cartes.Carte;

public class Joueur {
	
	CasesArrayList casesAttaque;
	ArrayList<Default_bateau> bateaux;
	
	public Joueur() {
		// TODO Auto-generated constructor stub
		casesAttaque = new CasesArrayList();
		bateaux = new ArrayList<Default_bateau>();
	}
	
	public void ajoutBateau (Default_bateau newBateau,Carte map) {
		bateaux = newBateau.placerBateau(bateaux, map);
	}
	
	public ArrayList<Default_bateau> getBateaux(){
		return this.bateaux;
	}
}
