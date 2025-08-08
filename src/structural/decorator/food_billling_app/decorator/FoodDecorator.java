package structural.decorator.food_billling_app.decorator;

import structural.decorator.food_billling_app.component.FoodItem;

public abstract class FoodDecorator implements FoodItem {

	protected final FoodItem foodItem;

	public FoodDecorator(FoodItem foodItem) {
		super();
		this.foodItem = foodItem;
	}

	public String getDescription() {
		return foodItem.getDescription();
	}

	public Double getCost() {
		return foodItem.getCost();
	}

}
