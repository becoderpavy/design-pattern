package structural.decorator.pizza_app.pizza;

public class VegPizza implements IPizza {

	@Override
	public String getDescription() {
		return "Veg Pizza";
	}

	@Override
	public Double getCost() {
		return 200.00;
	}

}
