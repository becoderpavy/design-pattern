package structural.decorator.pizza_app;

import structural.decorator.pizza_app.decorator.Chesse;
import structural.decorator.pizza_app.decorator.Musroom;
import structural.decorator.pizza_app.pizza.IPizza;
import structural.decorator.pizza_app.pizza.VegPizza;

public class MainClass {

	public static void main(String[] args) {

		IPizza vegPizza = new VegPizza();
		vegPizza = new Chesse(vegPizza);
		vegPizza = new Musroom(vegPizza);

		System.out.println(vegPizza.getDescription() + "=" + vegPizza.getCost());

	}

}
