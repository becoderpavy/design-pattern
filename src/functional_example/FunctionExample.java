package functional_example;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> fun = (name) -> name.length();
		System.out.println(fun.apply("Nice"));
	}
}
