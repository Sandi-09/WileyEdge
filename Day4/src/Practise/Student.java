package Practise;

public class Student {
	private int regNo;
	private String Name;
	private Date admissionDate;
	//private static counter;

	public Student(int regNo, String name, Date admissionDate) {
		super();
		this.regNo = regNo;
		Name = name;
		this.admissionDate = admissionDate;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(getName());
		System.out.println(getRegNo());
		System.out.println(getAdmissionDate().displayDate());
	}

}
