package functional_example;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExam {
	public static void main(String[] args) {
		Supplier<Integer> num = () -> new Random().nextInt();
		System.out.println(num.get());
	}
}
