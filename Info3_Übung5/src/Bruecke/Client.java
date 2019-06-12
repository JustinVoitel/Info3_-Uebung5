package Bruecke;

public class Client {

	public static void main(String[] args) {
		
		Abspielgeraet geraetA = new Abspielgeraet(new CDSpieler());
		geraetA.spieleAb(3);
		geraetA.ausschalten();
		
		Abspielgeraet geraetB = new Abspielgeraet(new KassettenspielerSpieler());
		geraetB.spieleAb(5); 
		geraetB.ausschalten();
		
		
		Listenabspielgeraet geraetC = new Listenabspielgeraet(new CDSpieler());
		geraetC.shuffleTracks();
		geraetC.playPlaylist();
		geraetC.ausschalten();
	}

}
