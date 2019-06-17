package Bruecke;

import java.util.ArrayList;

public class Kassettenspieler implements IAbspielgeraetImpl {

	private int currentTrackNr = 0;
	private int lastTrackNr = 0;
	
	public Kassettenspieler() {
		
	}

	@Override
	public void springeZuTrack(int trackNr) {
		this.currentTrackNr = trackNr;
		
		if(currentTrackNr >= lastTrackNr) this.spuleVorZuTrack(trackNr);
		else if(currentTrackNr < lastTrackNr || currentTrackNr == lastTrackNr) this.spuleZurückZuTrack(trackNr);
		this.leseDaten();
		this.lastTrackNr = trackNr;
		
	}

	@Override
	public void leseDaten() {
		System.out.println("Lese Daten vom Tonband!");
	}

	@Override
	public void ausschalten() {
		System.out.println("Kassettenspieler ausschalten!");
		
	}
	
	public void spuleVorZuTrack(int trackNr) {
		System.out.println("Spule vor zu Track "+ trackNr);
	}
	
	public void spuleZurückZuTrack(int trackNr) {
		System.out.println("Spule zurück zu Track "+ trackNr);
	}

}
