package Adapter;

public class WebShopPayment implements IPayment {

	@Override
	public void pay(int amount) {
		
		System.out.println(amount + " payed" + " with IBAN");
		
	}

}
