package structural.composite;

public class App {
	public static void main(String[] args) {
		Menu m1=new Menu("Service");
		m1.add(new MenuItem("App Development"));
		m1.add(new MenuItem("Website Design"));
		
		Menu mainMenu=new Menu("Main Menu");
		MenuItem home=new MenuItem("Home");
		MenuItem about=new MenuItem("About");
		
		mainMenu.add(home);
		mainMenu.add(about);
		mainMenu.add(m1);
		
		mainMenu.display();
		
	}
}
