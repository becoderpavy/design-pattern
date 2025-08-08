package creational.abstract_factory.payment_app.service;

import creational.abstract_factory.payment_app.factory.PaymentFactory;
import creational.abstract_factory.payment_app.type.Payment;

public class PaymentService {

	public final PaymentFactory paymentFactory;

	public PaymentService(PaymentFactory paymentFactory) {
		super();
		this.paymentFactory = paymentFactory;
	}

	public void doPayment(Double amt) {
		Payment type = paymentFactory.initPaymentType();
		type.pay(amt);
	}

}
