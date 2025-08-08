package creational.factory.payment_app;

import creational.factory.payment_app.factory.PaymentFactory;
import creational.factory.payment_app.type.Payment;

public class PaymentService {

	public static void main(String[] args) {
		Payment pay = PaymentFactory.doPayment("CREDIT_CARD");
		pay.pay(30.00);
	}

}
