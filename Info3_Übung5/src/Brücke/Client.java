package Br�cke;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abspielger�t ger�tA = new Abspielger�t(new CDSpieler());
		ger�tA.spieleAb(3);
		
		Abspielger�t ger�tB = new Abspielger�t(new KassettenspielerSpieler());
		ger�tB.spieleAb(5); 
	}

}
