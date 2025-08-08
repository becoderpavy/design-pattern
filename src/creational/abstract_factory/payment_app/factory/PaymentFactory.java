package creational.abstract_factory.payment_app.factory;

import creational.abstract_factory.payment_app.type.Payment;

public interface PaymentFactory {

	public Payment initPaymentType();

}
