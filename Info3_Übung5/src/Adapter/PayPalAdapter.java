package Adapter;

public class PayPalAdapter implements IPayment {

	private PayPalPayment payPal;
	
	public PayPalAdapter(PayPalPayment payPal) {
		this.payPal = payPal;
	}
	
	@Override
	public void pay(int amount) {
		
		payPal.login(this.payPal.getUsername(), this.payPal.getPassword());
		if(payPal.isLoggedIn()) {
			
			payPal.setAmount(amount);
			payPal.setRecipient(this.payPal.getRecipient());
			payPal.confirm();
		}
		
	}
	
}
