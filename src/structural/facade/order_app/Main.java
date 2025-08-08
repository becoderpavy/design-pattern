package structural.facade.order_app;

import structural.facade.order_app.facade.OrderServiceFacade;

public class Main {
	public static void main(String[] args) {
		OrderServiceFacade order = new OrderServiceFacade();
		order.placeOrder("1", "121", 3000.00);
	}
}
