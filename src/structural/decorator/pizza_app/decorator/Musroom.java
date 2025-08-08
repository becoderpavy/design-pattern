package structural.decorator.pizza_app.decorator;

import structural.decorator.pizza_app.pizza.IPizza;

public class Musroom extends TopingDecorator {

	private final IPizza basePizza;

	public Musroom(IPizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public String getDescription() {
		return basePizza.getDescription() + "+Musroom";
	}

	@Override
	public Double getCost() {
		return basePizza.getCost() + 59.00;
	}

}
