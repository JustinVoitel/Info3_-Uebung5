package Bruecke;

public class Client {

	public static void main(String[] args) {
		
		Abspielgeraet geraetA = new Abspielgeraet(new CDSpieler());
		geraetA.spieleAb(3);
		geraetA.ausschalten();
		
		System.out.println("\n");
		
		Abspielgeraet geraetB = new Abspielgeraet(new Kassettenspieler());
		geraetB.spieleAb(5); 
		geraetB.spieleAb(3);
		geraetB.ausschalten();
		
		System.out.println("\n");
		
		Liste list = new Liste(12);
		Listenabspielgeraet geraetC = new Listenabspielgeraet(new CDSpieler(), list);
		geraetC.shuffleTracks();
		geraetC.playPlaylist();
		geraetC.ausschalten();
	}

}
