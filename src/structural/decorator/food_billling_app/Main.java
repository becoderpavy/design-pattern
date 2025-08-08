package structural.decorator.food_billling_app;

import structural.decorator.food_billling_app.component.Burger;
import structural.decorator.food_billling_app.component.FoodItem;
import structural.decorator.food_billling_app.decorator.ChesseDecorator;

public class Main {
	public static void main(String[] args) {
		FoodItem burger = new Burger();
		burger = new ChesseDecorator(burger);
		System.out.println(burger.getDescription() + "=" + burger.getCost());
	}
}
