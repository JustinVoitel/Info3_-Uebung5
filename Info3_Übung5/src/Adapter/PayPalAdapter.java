package Adapter;

public class PayPalAdapter implements IPayment {

	private PayPalPayment payPal;
	private String username;
	private String password;
	private String recipient;
	
	public PayPalAdapter(PayPalPayment payPal, String username, String password, String recipient) {
		this.payPal = payPal;
	}
	
	@Override
	public void pay(int amount) {
		
		payPal.login(username, password);
		if(payPal.isLoggedIn()) {
			
			payPal.setAmount(amount);
			payPal.setRecipient(recipient);
			
		}
		
	}
	
}
