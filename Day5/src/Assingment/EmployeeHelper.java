package Assingment;

public class EmployeeHelper {
	public boolean searchEmployee(Employee e[],int id)
	{
		boolean flag=false;
		for(Employee emp:e)
		{
			if(emp.getEmpId()==id)
				return true;
		}
		return flag;
	}
	public static void displayEmployess(Employee[] empArr) {
		// TODO Auto-generated method stub
		for(Employee emp:empArr)
			{
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
				System.out.println(emp.getEmpDept());
				//System.out.println();
				System.out.println("----------------x------------------");
			}
	}
		
	}

