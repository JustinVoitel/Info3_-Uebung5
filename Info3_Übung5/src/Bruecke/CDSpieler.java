package Bruecke;

import java.util.ArrayList;

public class CDSpieler implements IAbspielgeraetImpl {

	private ArrayList<String> tracks;
	
	public CDSpieler() {
		// TODO Auto-generated constructor stub
		tracks = new ArrayList<>();
		this.initTracks(20);
	}

	@Override
	public void springeZuTrack(int trackNr) {
		// TODO Auto-generated method stub
		this.leseDaten();
		System.out.println("Lesekopf spring zu track "+trackNr);
		
		
	}

	@Override
	public void leseDaten() {
		// TODO Auto-generated method stub
		System.out.println("Lese digitale Daten von CD!");
		
	}

	@Override
	public void ausschalten() {
		// TODO Auto-generated method stub
		System.out.println("schalte CD-Player aus!");
		
	}
	
	public void initTracks(int trackCount) {
		for(int i = 0;i<trackCount;i++) {
			this.tracks.add("Track "+i+1);
		}
	}

}
