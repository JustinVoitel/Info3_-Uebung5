package Bruecke;

import java.util.ArrayList;

public class CDSpieler implements IAbspielgeraetImpl {
	
	public CDSpieler() {

	}

	@Override
	public void springeZuTrack(int trackNr) {
		
		System.out.println("Lesekopf spring zu " + trackNr);
		this.leseDaten();
		
		
	}

	@Override
	public void leseDaten() {

		System.out.println("Lese digitale Daten von CD!");
		
	}

	@Override
	public void ausschalten() {

		System.out.println("Schalte CD-Player aus!");
		
	}
	
}
