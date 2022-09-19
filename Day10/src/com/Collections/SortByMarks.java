package com.Collections;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o2.getStudentMarks()==o1.getStudentMarks())
		{
			return(o1.getStudentName().compareTo(o2.getStudentName()));
			//return 0;
		}
			
		else if(o2.getStudentMarks()>o1.getStudentMarks())
			return 1;
		else 
			return -1;
	}

}
