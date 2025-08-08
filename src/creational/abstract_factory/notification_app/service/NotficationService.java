package creational.abstract_factory.notification_app.service;

import creational.abstract_factory.notification_app.factory.NotificationFactory;
import creational.abstract_factory.notification_app.product.formatter.MessageFormatter;
import creational.abstract_factory.notification_app.product.sender.MessageSender;

public class NotficationService {
	private final NotificationFactory notificationFactory;

	public NotficationService(NotificationFactory notificationFactory) {
		super();
		this.notificationFactory = notificationFactory;
	}

	public void notifyUser(String msg) {
		MessageFormatter formatter = notificationFactory.createFormatter();
		MessageSender sender = notificationFactory.createSender();
		String format = formatter.format(msg);
		sender.send(format);
	}
}
