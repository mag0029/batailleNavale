package com.mgiraud.bataillenavale.entities.bateaux;

import com.mgiraud.bataillenavale.entities.cartes.*;

public abstract class Default_bateau {

	private int posX;
	private int posY;
	private int taille;
	private Cases cases[];
	
	public Default_bateau(int taille) {
		// TODO Auto-generated constructor stub
		this.taille = taille;
	}
	
	public void setPosition(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public Cases[] getCases() {
		return this.cases;
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

		public void setCases(Cases[] cases) {
		this.cases = cases;
	}
	
}
