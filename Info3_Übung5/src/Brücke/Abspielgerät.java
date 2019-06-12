package Brücke;

public class Abspielgerät {
	
	IAbspielgerätImpl abspielgerät;
	
	public Abspielgerät(IAbspielgerätImpl gerät) {
		this.abspielgerät = gerät;
	}
	
	public void spieleAb(int trackNr) {
		abspielgerät.springeZuTrack(trackNr);
	}
	
	public void ausschalten() {
		System.out.println("Schalte Abspielgerät aus!");
	}
}
