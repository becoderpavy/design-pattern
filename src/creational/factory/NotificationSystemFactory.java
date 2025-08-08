package creational.factory;

public class NotificationSystemFactory {

	public static void main(String[] args) {
		Notification nf = NotificationFactory.sendNotification("WP");
		nf.send("Hello");
	}
}

class NotificationFactory {
	public static Notification sendNotification(String type) {
		switch (type) {
		case "EMAIL":
			return new EmailService();
		case "SMS":
			return new SmsService();
		case "WP":
			return new WhatsappService();
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}

interface Notification {
	public void send(String type);
}

class EmailService implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Send Notification By Email");
	}
}

class SmsService implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Send Notification By SMS");
	}
}

class WhatsappService implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Send Notification By Whatsapp");
	}
}
