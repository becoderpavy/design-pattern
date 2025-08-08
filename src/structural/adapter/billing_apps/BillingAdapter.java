package structural.adapter.billing_apps;

public class BillingAdapter implements BillingService {
	private final LegacyBillingSystem legacy = new LegacyBillingSystem();

	@Override
	public void createInvoice(double amount) {
		legacy.generateBill(amount);
	}
}
