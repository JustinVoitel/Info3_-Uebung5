package Bruecke;

public class Abspielgeraet {
	
	IAbspielgeraetImpl abspielgeraet;
	
	public Abspielgeraet(IAbspielgeraetImpl geraet) {
		this.abspielgeraet = geraet;
	}
	
	public void spieleAb(int trackNr) {
		abspielgeraet.springeZuTrack(trackNr);
	}
	
	public void ausschalten() {
		System.out.println("Schalte Abspielgeraet aus!");
	}
}
