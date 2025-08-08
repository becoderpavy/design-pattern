package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {

	private final String title;
	private final List<MenuComponent> items = new ArrayList<>();

	public Menu(String title) {
		super();
		this.title = title;
	}
	
	public void add(MenuComponent item) {
		items.add(item);
	}

	@Override
	public void display() {
		System.out.println("-"+title);
		for(MenuComponent item:items) {
			item.display();
		}
	}

}
