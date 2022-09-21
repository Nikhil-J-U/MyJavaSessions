package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		EcommApp user = new EcommApp();
		
		user.login("nik@gmail.com", "nik122")
					.search("apple")
						.addToCart("apple")
							.doPayment("123b 9899 899", 123)
								.generateOrderId()
									.logout();
		
		user.login("nik@gmail.com", "nik122")
					.addToCart("apple")
						.doPayment("nik@okicici")
							.generateOrderId()
								.logout();
		
		user.login()
			.addToCart("apple")
				.logout();
		
	

	}

}
