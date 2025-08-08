package structural.decorator.food_billling_app.component;

public class Burger implements FoodItem {

	@Override
	public String getDescription() {
		return "Burger";
	}

	@Override
	public Double getCost() {
		return 200.00;
	}

}
