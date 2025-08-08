package structural.composite;

public class MenuItem implements MenuComponent {

	private String name;

	public MenuItem(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println(" --" + name);
	}

}
