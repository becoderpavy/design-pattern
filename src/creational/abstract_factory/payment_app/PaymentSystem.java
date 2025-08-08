package creational.abstract_factory.payment_app;

import creational.abstract_factory.payment_app.factory.CreditCardPaymentFactory;
import creational.abstract_factory.payment_app.service.PaymentService;

public class PaymentSystem {
	public static void main(String[] args) {
		PaymentService service = new PaymentService(new CreditCardPaymentFactory());
		service.doPayment(400.00);
	}
}
