package com.Collections;

public class Student implements Comparable<Student>{
	private int studentRegNo;
private String studentName;
private double studentMarks;

public Student(int studentRegNo, String studentName, double studentMarks) {
	super();
	this.studentRegNo = studentRegNo;
	this.studentName = studentName;
	this.studentMarks = studentMarks;
}



public int getStudentRegNo() {
	return studentRegNo;
}



public void setStudentRegNo(int studentRegNo) {
	this.studentRegNo = studentRegNo;
}



public String getStudentName() {
	return studentName;
}



public void setStudentName(String studentName) {
	this.studentName = studentName;
}



public double getStudentMarks() {
	return studentMarks;
}



public void setStudentMarks(double studentMarks) {
	this.studentMarks = studentMarks;
}



@Override
public String toString() {
	return "Student [studentRegNo=" + studentRegNo + ", studentName=" + studentName + ", studentMarks=" + studentMarks
			+ "]";
}



@Override
public int compareTo(Student s) {
	if(this.getStudentMarks()==s.getStudentMarks())
		return 0;
	else if(this.getStudentMarks()>s.getStudentMarks())
		return 1;
	else
		return -1;

}
}
