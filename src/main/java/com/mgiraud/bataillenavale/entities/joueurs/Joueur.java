package com.mgiraud.bataillenavale.entities.joueurs;

import java.util.ArrayList;

import com.mgiraud.bataillenavale.entities.bateaux.*;

public class Joueur {
	
	CasesArrayList casesAttaque;
	ArrayList<Default_bateau> bateaux;
	
	public Joueur() {
		// TODO Auto-generated constructor stub
		casesAttaque = new CasesArrayList();
		bateaux = new ArrayList<Default_bateau>();
	}
	
	public void AjoutBateau (Default_bateau newBateau) {
		bateaux = newBateau.placerBateau(bateaux);
	}
}
