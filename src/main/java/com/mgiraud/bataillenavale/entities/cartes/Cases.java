package com.mgiraud.bataillenavale.entities.cartes;

/* case () : eau
 * case 0 : coulé
 * case X : touché
 */
public class Cases {
	
	private String type;
	private int idType;
	private int posX;
	private int posY;
	
	public Cases(int positionX, int positionY/*, int type*/) {
		// TODO Auto-generated constructor stub
		this.posX = positionX;
		this.posY = positionY;
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
	
	public int getIdType() {
		return this.idType;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	
}
