package Br�cke;

public class Abspielger�t {
	
	IAbspielger�tImpl abspielger�t;
	
	public Abspielger�t(IAbspielger�tImpl ger�t) {
		this.abspielger�t = ger�t;
	}
	
	public void spieleAb(int trackNr) {
		abspielger�t.springeZuTrack(trackNr);
	}
	
	public void ausschalten() {
		System.out.println("Schalte Abspielger�t aus!");
	}
}
