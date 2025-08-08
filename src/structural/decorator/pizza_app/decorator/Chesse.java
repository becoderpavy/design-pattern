package structural.decorator.pizza_app.decorator;

import structural.decorator.pizza_app.pizza.IPizza;

public class Chesse extends TopingDecorator {

	private final IPizza basePizza;

	public Chesse(IPizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public String getDescription() {
		return basePizza.getDescription() + "+Cheese";
	}

	@Override
	public Double getCost() {
		return basePizza.getCost() + 29.00;
	}

}
