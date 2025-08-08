package creational.abstract_factory.notification_app.factory;

import creational.abstract_factory.notification_app.product.formatter.EmailFormatter;
import creational.abstract_factory.notification_app.product.formatter.MessageFormatter;
import creational.abstract_factory.notification_app.product.sender.EmailSender;

public class EmailNotificationFactory implements NotificationFactory {

	public EmailSender createSender() {
		return new EmailSender();
	}

	public MessageFormatter createFormatter() {
		return new EmailFormatter();
	}
}