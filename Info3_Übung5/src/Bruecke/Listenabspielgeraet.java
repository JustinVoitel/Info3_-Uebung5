package Bruecke;


import java.util.Collections;
import java.util.Random;

public class Listenabspielgeraet extends Abspielgeraet {

	private Random r = new Random();
	private Liste playList;
	
	public Listenabspielgeraet(IAbspielgeraetImpl imp, Liste list) {
		super(imp);
		this.playList = list;
	}
	
	public void shuffleTracks() {
		
		//System.out.println("Playlist before shuffling: " + this.playList.getList().toString()); // zum Testen 
		
		for (int i = 0; i < playList.getLenght(); i++) {
			int track1 = r.nextInt(playList.getLenght() - 1);
			int track2 = r.nextInt(playList.getLenght() - 1);
			
			Collections.swap(this.playList.getList(), track1, track2);
		}
		
		System.out.println("Liste wurde geshuffled!");
		
		//System.out.println("Playlist after shuffling: " + this.playList.getList().toString()); // zum Testen

	}
	
	public void playPlaylist() {
		
		for(int i = 0; i < playList.getLenght(); i++) {
			abspielgeraet.springeZuTrack(this.playList.getTrackNr(i));
		}
		
	}

}
