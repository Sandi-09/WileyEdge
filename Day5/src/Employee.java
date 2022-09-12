
public class Employee {
private int empId;
private String name;
public Employee(int empId, String name) {
	super();
	this.empId = empId;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + "]";
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.empId*8;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	Employee e=(Employee)obj;
	if(this.empId==e.empId)
	{
		return true;
	}
	return false;
}
}
