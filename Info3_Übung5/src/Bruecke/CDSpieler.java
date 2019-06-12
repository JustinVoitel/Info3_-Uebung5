package Bruecke;

import java.util.ArrayList;

public class CDSpieler implements IAbspielgeraetImpl {

	private ArrayList<String> tracks;
	
	public CDSpieler() {

		tracks = new ArrayList<>();
		this.initTracks(20);
	}

	@Override
	public void springeZuTrack(int trackNr) {
		
		System.out.println("Lesekopf spring zu "+ tracks.get(trackNr));
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
	
	public void initTracks(int trackCount) {
		for(int i = 0;i<trackCount;i++) {
			this.tracks.add("Track "+ (i+1) );
		}
	}

	@Override
	public ArrayList<String> getTracks() {

		return tracks;
	}


}
