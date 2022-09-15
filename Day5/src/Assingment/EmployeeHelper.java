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
	public  void displayEmployess(Employee[] empArr) {
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
	public Employee[] sortEmployees(Employee [] empArr)
	{
		int n=empArr.length;
		Employee temp;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				int val1=empArr[j-1].getGrossSalary();
				int val2=empArr[j].getGrossSalary();
				//System.out.println(val1+" "+val2);
				if(val1>val2)
				{
					temp=empArr[j-1];
					empArr[j-1]=empArr[j];
					empArr[j]=temp;
				}
			}
		}
//		for(int i=0;i<n;i++) {
//		System.out.println(empArr[i].getEmpBasicSalary());
//		}
		return empArr;
	}
		
	}

