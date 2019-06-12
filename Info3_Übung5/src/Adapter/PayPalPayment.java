package Adapter;

public class PayPalPayment {

		private String username;
		private String passwort;
		private int amount;
		private String recipient;
		private boolean loggedIn = false;
		
		public boolean login(String username, String password) {
	
			if(username != null && password != null) {
				loggedIn = true;
			}
			
			return loggedIn;
		}
		
		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
		
		public void setAmount(int amount) {
			this.amount = amount;
		}
		
		public void confirm() {
			
			if(loggedIn && username != null && passwort != null && amount >= 0 && recipient != null) {
				System.out.println("Payment is confirmed!");
				System.out.println(amount + " Payed with PayPal.");
			}
			else {
				System.out.println("Payment unconfirmed!");
			}
		}

		/**
		 * @return the loggedIn
		 */
		public boolean isLoggedIn() {
			return loggedIn;
		}
		
	
}
