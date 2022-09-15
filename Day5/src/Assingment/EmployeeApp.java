package Assingment;

public class EmployeeApp {

	public static void main(String args[]) {

		Employee e1 = new Employee(101, "Sandipt", "IT", 10000);
		Employee e2 = new Employee(102, "Binit", "HR", 12500);
		Employee e3 = new Employee(103, "Aman", "Support", 108900);
		Employee e4 = new Employee(103, "Aekagra", "QA", 20000);
		Employee e5 = new Employee(104, "Roman", "Buisness", 17000);

		Employee[] empArr = new Employee[] { e1, e2, e3, e4, e5 };

		// System.out.println(empArr[0].getEmpName());

		// to display the list of Employess
		// EmployeeHelper.displayEmployess(empArr);
		EmployeeHelper eh = new EmployeeHelper();
		Employee[] arr = eh.sortEmployees(empArr);
		for (Employee e : arr) {
			System.out.println(e.getGrossSalary() + " " + e.getEmpName());
		}

		// sub-task 2 to overide the equals method
		// System.out.println(e1.equals(e2));
		// System.out.println("the total salary of the employee is :
		// "+e1.calculateGrossSalary());
	}

}
