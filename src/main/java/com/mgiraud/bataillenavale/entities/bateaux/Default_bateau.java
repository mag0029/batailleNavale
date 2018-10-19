package com.mgiraud.bataillenavale.entities.bateaux;

import java.util.ArrayList;
import java.util.Random;

import com.mgiraud.bataillenavale.entities.cartes.*;
import com.mgiraud.bataillenavale.entities.joueurs.CasesArrayList;

public abstract class Default_bateau {

	private int posX;
	private int posY;
	private int taille;
	private String id;
	public CasesArrayList placement = new CasesArrayList();
	
	public Default_bateau(int taille,String id) {
		// TODO Auto-generated constructor stub
		this.taille = taille;
		this.id = id;
	}
	
	private void setPosition(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}


	public int getTaille() {
		return taille;
	}
	
	


	public CasesArrayList getPlacement() {
		return placement;
	}

	private void setCasePlacement(int pX, int pY) {
		Cases caseX = new Cases(pX,pY);
		caseX.setType(this.id);
		this.placement.add(caseX);
	}
	
	private void setPlacement(int originX, int originY, int sens) {
		for (int i = 0; i <this.taille; i++) {
			if (sens == 0) {
				originX++;
				setCasePlacement(originX, originY);
			}else {
				originY++;
				setCasePlacement(originX, originY);
			}
		}
		
	}
	
	private boolean emplacementCorrect(int x, int y, int sens,ArrayList<Default_bateau> listeBateaux) {
		boolean result = true;
		for (int i = 0; i<listeBateaux.size();i++) {
			if (sens==0) {
				for(int j = x; j < x+this.taille; j++) {
					if(listeBateaux.get(i).placement.CaseExiste(j,y)) {
						result = false;
					}
				}
			}else {
				for(int j = y; j < y+this.taille; j++) {
					if(listeBateaux.get(i).placement.CaseExiste(x,j)) {
						result = false;
					}
				}
			}
	
		}
		return result;
		
	}
	
	
	public ArrayList<Default_bateau> placerBateau(ArrayList<Default_bateau> listeBateaux, Carte map) {
		int origineX;
		int origineY;
		int sens;
		do {
			Random rand = new Random();
			sens = rand.nextInt(2);
			if (sens == 0) {
				origineX = rand.nextInt(map.getTailleX()-this.taille);
				origineY = rand.nextInt(map.getTailleY());
			}else {
				origineX = rand.nextInt(map.getTailleX());
				origineY = rand.nextInt(map.getTailleY()-this.taille);
			}
		}while (!emplacementCorrect(origineX,origineY,sens,listeBateaux));
		
		setPlacement(origineX, origineY, sens);
		this.posX = origineX;
		this.posY = origineY;
		listeBateaux.add(this);
		
		return listeBateaux;
		
	}
	
	
}
