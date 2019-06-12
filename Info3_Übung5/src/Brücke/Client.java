package Brücke;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abspielgerät gerätA = new Abspielgerät(new CDSpieler());
		gerätA.spieleAb(3);
		
		Abspielgerät gerätB = new Abspielgerät(new KassettenspielerSpieler());
		gerätB.spieleAb(5); 
	}

}
