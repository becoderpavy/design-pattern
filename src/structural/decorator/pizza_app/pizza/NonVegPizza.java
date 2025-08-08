package structural.decorator.pizza_app.pizza;

public class NonVegPizza implements IPizza {

	@Override
	public String getDescription() {
		return "Non Veg Pizza";
	}

	@Override
	public Double getCost() {
		return 300.00;
	}

}
