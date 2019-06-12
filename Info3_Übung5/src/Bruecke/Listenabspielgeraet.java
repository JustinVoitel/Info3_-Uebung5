package Bruecke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Listenabspielgeraet extends Abspielgeraet {

	ArrayList<String> list = abspielgeraet.getTracks();
	Random r = new Random();
	
	public Listenabspielgeraet(IAbspielgeraetImpl imp) {
		super(imp);
	}
	
	public void shuffleTracks() {
		
		System.out.println("Playlist before shuffling: " + list.toString());
		
		for (int i = 0; i < list.size(); i++) {
			int track1 = r.nextInt(list.size() - 1);
			int track2 = r.nextInt(list.size() - 1);
			
			Collections.swap(list, track1, track2);
		}
		
		System.out.println("Playlist after shuffling: " + list.toString());
		
	}
	
	public void playPlaylist() {
		
		for(String track: this.list) {
			abspielgeraet.springeZuTrack(list.indexOf(track));
		}
		
	}

}
