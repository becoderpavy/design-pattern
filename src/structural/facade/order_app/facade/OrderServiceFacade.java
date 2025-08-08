package structural.facade.order_app.facade;

import structural.facade.order_app.subsystem.InventoryService;
import structural.facade.order_app.subsystem.NotificationService;
import structural.facade.order_app.subsystem.PaymentService;
import structural.facade.order_app.subsystem.ProductService;

public class OrderServiceFacade {
	private final ProductService productService;
	private final InventoryService inventoryService;
	private final PaymentService paymentService;
	private final NotificationService notificationService;

	public OrderServiceFacade() {
		this.productService = new ProductService();
		this.inventoryService = new InventoryService();
		this.paymentService = new PaymentService();
		this.notificationService = new NotificationService();
	}

	public void placeOrder(String userId, String productId, double amount) {
		if (!productService.validateProduct(productId))
			return;
		if (!inventoryService.checkStock(productId))
			return;
		if (!paymentService.processPayment(userId, amount))
			return;

		notificationService.sendOrderConfirmation(userId);
		System.out.println("Order placed successfully!");
	}
}