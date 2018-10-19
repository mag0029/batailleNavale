package com.mgiraud.bataillenavale.entities.cartes;

import java.util.ArrayList;

import com.mgiraud.bataillenavale.entities.joueurs.CasesArrayList;

public class Carte {

	private int tailleX;
	private int tailleY;
	
	public Carte(int tailleX, int tailleY) {
		// TODO Auto-generated constructor stub
		this.tailleX = tailleX;
		this.tailleY = tailleY;
		
	}
	
	public void AfficheCartePartie(CasesArrayList attaques) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < tailleY; i++) {
			for (int j = 0; j < tailleX; j++) {
				if (attaques.CaseExiste(j,i)) {
					builder.append(attaques.get(attaques.CaseIndex(j,i)).getType());
				}else {
					builder.append("{ }");
				}
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());		
	}
}
