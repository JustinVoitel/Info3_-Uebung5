package Bruecke;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abspielgeraet geraetA = new Abspielgeraet(new CDSpieler());
		geraetA.spieleAb(3);
		
		Abspielgeraet geraetB = new Abspielgeraet(new KassettenspielerSpieler());
		geraetB.spieleAb(5); 
		
	}

}
