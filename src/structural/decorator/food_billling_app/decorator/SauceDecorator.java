package structural.decorator.food_billling_app.decorator;

import structural.decorator.food_billling_app.component.FoodItem;

public class SauceDecorator extends FoodDecorator{

	public SauceDecorator(FoodItem foodItem) {
		super(foodItem);
	}

	public String getDescription() {
		return super.getDescription();
	}

	public Double getCost() {
		return super.getCost();
	}

	
	
}
