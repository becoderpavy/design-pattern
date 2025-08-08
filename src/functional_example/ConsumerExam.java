package functional_example;

import java.util.function.Consumer;

public class ConsumerExam {
	public static void main(String[] args) {
		Consumer<String> details = (name) -> System.out.println(name.toUpperCase());
		details.accept("Nice");
	}
}
