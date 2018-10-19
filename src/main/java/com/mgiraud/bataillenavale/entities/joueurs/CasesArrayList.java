package com.mgiraud.bataillenavale.entities.joueurs;

import java.util.ArrayList;
import com.mgiraud.bataillenavale.entities.cartes.Cases;


public class CasesArrayList extends ArrayList<Cases> {

	public int CaseIndex(int posX, int posY) {
		int result = -1;
		Cases caseX;
		for (int i = 0; i< this.size();i++) {
			caseX = this.get(i);
			if (caseX.getPosX() == posX && caseX.getPosY()== posY) {
				result = i;
			}
		}
		
		return result;
	}
	
	public boolean CaseExiste(int posX, int posY) {
		boolean result = false;
		Cases caseX;
		for (int i = 0; i< this.size();i++) {
			caseX = this.get(i);
			if (caseX.getPosX() == posX && caseX.getPosY()== posY) {
				result = true;
			}
		}
		
		return result;
	}
	
	
}
