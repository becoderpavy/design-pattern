package creational.factory.payment_app.factory;

import creational.factory.payment_app.type.CreditCardPayment;
import creational.factory.payment_app.type.Payment;
import creational.factory.payment_app.type.UPIPayment;

public interface PaymentFactory {

	public static Payment doPayment(String type) {
		switch (type) {
		case "CREDIT_CARD":
			return new CreditCardPayment();
		case "UPI":
			return new UPIPayment();
		default:
			throw new IllegalArgumentException("Invalid Payment Type=" + type);
		}
	}
}
