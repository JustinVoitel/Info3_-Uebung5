package Bruecke;

import java.util.ArrayList;

public class Abspielgeraet {
	
	IAbspielgeraetImpl abspielgeraet;
	
	public Abspielgeraet(IAbspielgeraetImpl geraet) {
		this.abspielgeraet = geraet;
	}
	
	public void spieleAb(int trackNr) {
		abspielgeraet.springeZuTrack(trackNr);
	}
	
	public void ausschalten() {
		abspielgeraet.ausschalten();
	}
	
	public ArrayList getTracks(){
		return abspielgeraet.getTracks();
	}
}
