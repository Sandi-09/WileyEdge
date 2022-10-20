package com.DependencyInjection;

public class Employee {

	private int empId;
	private String EmpName;
	private String DeptName;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName,String deptName) {
		super();
		this.empId = empId;
		EmpName = empName;
		DeptName=deptName;
	}

public void setDeptName(String deptName) {
	DeptName=deptName;
}
public String getDeptName() {
	return DeptName;
}
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return EmpName;
	}



	public void setEmpName(String empName) {
		EmpName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", EmpName=" + EmpName + ", DeptName=" + DeptName + "]";
	}
	
}
