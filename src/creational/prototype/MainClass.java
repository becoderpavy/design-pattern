package creational.prototype;

import creational.Employee;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee em = new Employee(1,"Pavy","pavy@gmail.com");
		Employee clone = em.clone();
		clone.setEmail("demo@gmail.com");
		System.out.println(clone);
		System.out.println(em);
	}
}


