package structural.facade.order_app.subsystem;

public class PaymentService {
	public boolean processPayment(String userId, double amount) {
		System.out.println("Processing payment of ₹" + amount + " for user: " + userId);
		return true;
	}
}
