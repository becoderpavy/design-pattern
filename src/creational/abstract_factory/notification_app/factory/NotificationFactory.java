package creational.abstract_factory.notification_app.factory;

import creational.abstract_factory.notification_app.product.formatter.MessageFormatter;
import creational.abstract_factory.notification_app.product.sender.MessageSender;

public interface NotificationFactory {
	public MessageSender createSender();

	public MessageFormatter createFormatter();
}
