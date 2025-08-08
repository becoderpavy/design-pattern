package creational.abstract_factory.notification_app.product.sender;

public class EmailSender implements MessageSender {
	public void send(String msg) {
		System.out.println("Message send by email=" + msg);
	}
}
