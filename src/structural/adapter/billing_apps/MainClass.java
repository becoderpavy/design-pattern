package structural.adapter.billing_apps;

public class MainClass {
	public static void main(String[] args) {
		BillingAdapter adapter=new BillingAdapter();
		adapter.createInvoice(30);
	}
}
