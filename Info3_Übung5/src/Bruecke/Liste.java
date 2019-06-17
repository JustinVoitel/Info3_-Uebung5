package Bruecke;

import java.util.ArrayList;

public class Liste {

	ArrayList<Integer> tracks;
	
	public Liste(int nrOfTracks) {
		tracks = new ArrayList<>();
		this.initTracks(nrOfTracks);
	}

	public void initTracks(int nrOfTracks) {
		
		for (int i = 0; i < nrOfTracks; i++) {
			this.tracks.add(i,i + 1);
		}

	}
	
	public ArrayList<Integer> getList() {
		return this.tracks;
	}
	
	public int getLenght() {
		return tracks.size();
	}
	
	public int getTrackNr(int index) {
		return tracks.get(index);
	}

}
