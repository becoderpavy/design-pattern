package structural.decorator.food_billling_app.decorator;

import structural.decorator.food_billling_app.component.FoodItem;

public class ChesseDecorator extends FoodDecorator {

	public ChesseDecorator(FoodItem item) {
		super(item);
	}

	public String getDescription() {
		return foodItem.getDescription() + "+Chesse";
	}

	public Double getCost() {
		return foodItem.getCost()+10.00;
	}

}
