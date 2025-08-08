package creational.singleton;

public class SingleClass {

	public static void main(String[] args) {
		Employee instance = Employee.getInstance();
		System.out.println(instance);
	}
}

class Employee {
	private static final Employee emp = null;

	private Employee() {
	}

	public static Employee getInstance() {
		if (emp == null) {
			return new Employee();
		}
		return emp;
	}
}