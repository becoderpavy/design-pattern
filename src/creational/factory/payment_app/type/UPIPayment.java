package creational.factory.payment_app.type;

public class UPIPayment implements Payment {

	@Override
	public void pay(Double amt) {
		System.out.println("Pay By UPI=" + amt);
	}

}
