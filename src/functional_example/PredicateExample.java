package functional_example;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> value = (num) -> num % 2 == 0;
		System.out.println(value.test(3));
	}

}

//interface checkOddd{
//	public void 
//}
