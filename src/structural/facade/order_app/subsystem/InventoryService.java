package structural.facade.order_app.subsystem;

public class InventoryService {
	public boolean checkStock(String productId) {
		System.out.println("Checking stock for: " + productId);
		return true;
	}
}