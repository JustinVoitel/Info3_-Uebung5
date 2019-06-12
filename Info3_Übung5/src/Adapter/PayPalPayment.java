package Adapter;

public class PayPalPayment {

		private String username;
		private String password;
		private int amount;
		private String recipient;
		private boolean loggedIn = false;
		
		public PayPalPayment( String username, String password, String recipient) {
			this.username = username;
			this.password = password;
			this.recipient = recipient;
		}
		
		public boolean login(String username, String password) {
	
			if(username != null && password != null) {
				loggedIn = true;
				System.out.println("logged in!");
			}else {
				System.out.println("login failed!");

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
			
			if(loggedIn && username != null && password != null && amount >= 0 && recipient != null) {
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
		
		public String getUsername() {
			return username;
		}



		public String getPassword() {
			return password;
		}



		public String getRecipient() {
			return recipient;
		}
		
	
}
