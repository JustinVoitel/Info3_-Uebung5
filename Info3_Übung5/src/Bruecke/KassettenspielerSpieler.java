package Bruecke;

import java.util.ArrayList;

public class KassettenspielerSpieler implements IAbspielgeraetImpl {

	private ArrayList<String> tracks;
	
	public KassettenspielerSpieler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void springeZuTrack(int trackNr) {
		// TODO Auto-generated method stub
		this.spuleZuTrack(trackNr);
		this.leseDaten();
		
	}

	@Override
	public void leseDaten() {
		// TODO Auto-generated method stub
		System.out.println("Lese Daten vom Tonband!");
	}

	@Override
	public void ausschalten() {
		// TODO Auto-generated method stub
		
		System.out.println("Kassettenspieler ausschalten!");
		
	}
	
	public void spuleZuTrack(int trackNr) {
		System.out.println("Spule vor zu track "+ trackNr);
	}

	@Override
	public ArrayList<String> getTracks() {
		// TODO Auto-generated method stub
		return tracks;
	}

}
