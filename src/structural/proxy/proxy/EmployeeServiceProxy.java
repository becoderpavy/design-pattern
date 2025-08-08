package structural.proxy.proxy;

import structural.proxy.service.EmployeeService;
import structural.proxy.service.impl.EmpServiceImpl;

public class EmployeeServiceProxy {

	private final EmployeeService employeeService;
	private final String role;

	public EmployeeServiceProxy(String role) {
		super();
		this.employeeService = new EmpServiceImpl();
		this.role = role;
	}

	public void getEmpRecords() {
		if ("ADMIN".equals(role)) {
			employeeService.empRecords();
		} else {
			System.out.println("Access Denied: You are not authorized to view employee records.");
		}
	}
}
