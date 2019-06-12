package Bruecke�cke;

public class KassettenspielerSpieler implements IAbspielgeraetImpl {

	public KassettenspielerSpieler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void springeZuTrack(int trackNr) {
		// TODO Auto-generated method stub
		this.leseDaten();
		this.spuleZuTrack(trackNr);
		
	}

	@Override
	public void leseDaten() {
		// TODO Auto-generated method stub
		System.out.println("Lese Date vom Tonband!");
	}

	@Override
	public void ausschalten() {
		// TODO Auto-generated method stub
		
		System.out.println("Kassettenspieler ausschalten!");
		
	}
	
	public void spuleZuTrack(int trackNr) {
		System.out.println("Spule vor zu track "+ trackNr);
	}

}
