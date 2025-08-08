package structural.facade.order_app.subsystem;

public class ProductService {
	public boolean validateProduct(String productId) {
		System.out.println("Validating product: " + productId);
		return true;
	}
}