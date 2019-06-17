package Bruecke;

import java.util.ArrayList;

public class Liste {

	ArrayList<String> tracks;
	
	public Liste(int nrOfTracks) {
		tracks = new ArrayList<>();
		this.initTracks(nrOfTracks);
	}

	public void initTracks(int nrOfTracks) {
		
		for (int i = 0; i < nrOfTracks; i++) {
			this.tracks.add("Track " + (i + 1));
		}

	}
	
	public ArrayList<String> getList() {
		return this.tracks;
	}
	
	public int getLenght() {
		return tracks.size();
	}

}
