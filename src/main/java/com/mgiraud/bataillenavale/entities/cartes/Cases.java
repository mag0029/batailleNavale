package com.mgiraud.bataillenavale.entities.cartes;

/* case () : eau
 * case 0 : coulé
 * case X : touché
 */
public class Cases {
	
	private String type;
	private int posX;
	private int posY;
	
	public Cases(int positionX, int positionY) {
		// TODO Auto-generated constructor stub
		this.posX = positionX;
		this.posY = positionY;
		this.setEau();
	}
	
	public void setTouche() {
		this.type = " X ";
	}
	
	public void setCoule() {
		this.type = " 0 ";
	}
	
	public void setEau() {
		this.type = "{ }";
	}
	
	public String getType() {
		return this.type;
	}
	
	
}
