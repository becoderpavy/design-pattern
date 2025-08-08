package creational.factory.payment_app.type;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(Double amt) {
		System.out.println("Pay By Credit Card=" + amt);
	}

}
