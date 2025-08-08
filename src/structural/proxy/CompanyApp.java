package structural.proxy;

import structural.proxy.proxy.EmployeeServiceProxy;

public class CompanyApp {
	public static void main(String[] args) {
		EmployeeServiceProxy proxy = new EmployeeServiceProxy("ADMIN");
		proxy.getEmpRecords();
	}
}
