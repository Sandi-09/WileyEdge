package Assingment;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private int empBasicSalary;
	private int grossSalary;
	
	public Employee(int empId, String empName, String empDept, int empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDept() {
	return empDept;
}
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
public int getEmpBasicSalary() {
	return empBasicSalary;
}
public void setEmpBasicSalary(int empBasicSalary) {
	this.empBasicSalary = empBasicSalary;
}


public int calculateGrossSalary()
{
	//int salary=0;
	int basicSalary=this.empBasicSalary;
	int HRA=(int) (0.12*basicSalary);
	int DA=(int) (0.8*basicSalary);
	this.grossSalary=(int)(basicSalary+HRA+DA);
	return this.grossSalary;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	Employee e=(Employee)obj;
	if(this.empId==e.empId && this.empName==e.empName)
	{
		return true;
	}
	return false;
}
}

