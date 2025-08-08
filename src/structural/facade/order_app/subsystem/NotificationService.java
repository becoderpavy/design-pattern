package structural.facade.order_app.subsystem;

public class NotificationService {
	public void sendOrderConfirmation(String userId) {
		System.out.println("Sending order confirmation to user: " + userId);
	}
}
