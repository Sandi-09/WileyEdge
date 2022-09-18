package assingment6;

public class EmployeeDetails {
private int empId;
private String empName;
//private EmployeeAddressType empAddType;
private EmployeeAddress empAdd[]=new EmployeeAddress[5];
public EmployeeDetails(int empId, String empName, EmployeeAddress[] empAdd) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAdd = empAdd;
	//this.empAddType=empAddType;
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
public EmployeeAddress[] getEmpAdd() {
	return empAdd;
}
public void setEmpAdd(EmployeeAddress[] empAdd) {
	this.empAdd = empAdd;
}

}
