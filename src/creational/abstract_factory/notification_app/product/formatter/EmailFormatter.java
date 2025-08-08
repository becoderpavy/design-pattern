package creational.abstract_factory.notification_app.product.formatter;

public class EmailFormatter implements MessageFormatter {

	public String format(String msg) {
		return msg.toUpperCase();
	}
}
