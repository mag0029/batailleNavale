package com.mgiraud.bataillenavale.entities.cartes;

import java.util.ArrayList;

import com.mgiraud.bataillenavale.entities.bateaux.Default_bateau;
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
	
	public void AfficheCarteBateaux(ArrayList<Default_bateau> bateaux) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < tailleY; i++) {
			for (int j = 0; j < tailleX; j++) {
				for (int k=0; k<bateaux.size();k++) {
					if (bateaux.get(k).placement.CaseExiste(j,i)) {
						int index = bateaux.get(k).placement.CaseIndex(j,i);
						builder.append(bateaux.get(k).placement.get(index).getType());
					}else {
						builder.append("{ }");
					}
				}
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());		
	}
}
