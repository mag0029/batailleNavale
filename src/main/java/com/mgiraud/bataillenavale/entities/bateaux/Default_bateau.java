package com.mgiraud.bataillenavale.entities.bateaux;

import java.util.ArrayList;

import com.mgiraud.bataillenavale.entities.cartes.*;
import com.mgiraud.bataillenavale.entities.joueurs.CasesArrayList;

public abstract class Default_bateau {

	private int posX;
	private int posY;
	private int taille;
	private String id;
	CasesArrayList placement;
	
	public Default_bateau(int taille,String id) {
		// TODO Auto-generated constructor stub
		this.taille = taille;
		this.id = id;
	}
	
	public void setPosition(int posX, int posY) {
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

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void setPlacement() {
		this.placement.add(new Cases())
	}
	public ArrayList<Default_bateau> placerBateau(ArrayList<Default_bateau> listeBateaux) {
		
		
		
		listeBateaux.add(this);
		
		return listeBateaux;
		
	}
	
	
}
