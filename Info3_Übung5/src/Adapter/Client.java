package Adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPayment payPalPayment = new PayPalAdapter(new PayPalPayment("Max Mustermann","passwort123","Brillenshop GmbH"));
		payPalPayment.pay(100);
		IPayment webShopPayment = new WebShopPayment();
		webShopPayment.pay(80);
	}

}
