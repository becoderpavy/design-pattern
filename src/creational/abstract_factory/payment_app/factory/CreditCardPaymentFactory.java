package creational.abstract_factory.payment_app.factory;

import creational.abstract_factory.payment_app.type.CreditCardPayment;
import creational.abstract_factory.payment_app.type.Payment;

public class CreditCardPaymentFactory implements PaymentFactory {

	@Override
	public Payment initPaymentType() {
		return new CreditCardPayment();
	}

}
