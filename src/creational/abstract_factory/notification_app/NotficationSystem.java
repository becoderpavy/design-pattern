package creational.abstract_factory.notification_app;

import creational.abstract_factory.notification_app.factory.EmailNotificationFactory;
import creational.abstract_factory.notification_app.service.NotficationService;

public class NotficationSystem {
	public static void main(String[] args) {
		NotficationService notficationService = new NotficationService(new EmailNotificationFactory());
		notficationService.notifyUser("Nice");
	}
}
