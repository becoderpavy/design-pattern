package structural.adapter.billing_apps;

public class LegacyBillingSystem {
	public void generateBill(double amount) {
		System.out.println("Legacy invoice generated for: ₹" + amount);
	}
}
