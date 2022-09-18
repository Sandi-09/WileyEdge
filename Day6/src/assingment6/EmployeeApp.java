package assingment6;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAddress e1=new EmployeeAddress(1,"newHights","Kasba","Kolkata",EmployeeAddressType.TemporaryAddress);
		EmployeeAddress e2=new EmployeeAddress(2,"42 Towers","Kasba1","Pune",EmployeeAddressType.PermenantAddress);
//		EmployeeAddress e3=new EmployeeAddress(3,"newHights in Town","Kasba2","Chennai");
//		EmployeeAddress e4=new EmployeeAddress(4,"UrbanHights","Kasba3","Banglore");
//		EmployeeAddress e5=new EmployeeAddress(5,"cityHights","Kasba4","Mumbai");
		EmployeeAddress []empAdd=new EmployeeAddress[] {e1,e2};
		
		for(EmployeeAddress emp:empAdd) {
			System.out.println(emp.getFlatName());
		}
		EmployeeDetails ed=new EmployeeDetails(101,"Sandipt",empAdd);
		EmployeeAddress [] result=ed.getEmpAdd();
		for(EmployeeAddress empAddress:result)
		{
			System.out.println("The address is given as : ");
			System.out.println(empAddress.toString());
		}
	}

}
