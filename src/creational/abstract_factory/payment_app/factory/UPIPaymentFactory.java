package creational.abstract_factory.payment_app.factory;

import creational.abstract_factory.payment_app.type.Payment;
import creational.abstract_factory.payment_app.type.UPIPayment;

public class UPIPaymentFactory implements PaymentFactory {

	@Override
	public Payment initPaymentType() {
		return new UPIPayment();
	}

}
