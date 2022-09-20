
public class StudentApp {


	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student1 = new Student("sam", 91);
		System.out.println(student1);
		System.out.println(student1.hashCode());
		
		System.out.println("-------------------------------------------------------------------");
		
		Student student2 = new Student("sandipt", 84);
		System.out.println(student2);
		System.out.println(student2.hashCode());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(student1.equals(student2));
		
		System.out.println("-------------------------Deep Copy-----------------------------------");
		
		//deep copy using clone
		Student student3 = (Student)student2.clone();
		System.out.println(student3);
		System.out.println(student3.hashCode());
		
		student2.setName("Rahul");
		System.out.println(student2.getName());
		System.out.println(student3.getName());
		
		
		if(student3 == student2)
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		if(student3.hashCode() == student2.hashCode())
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		System.out.println("------------------------Shallow Copy------------------------");
		//shallow copy
		Student student4 = student1;
		System.out.println(student4);
		System.out.println(student4.hashCode());
		
		student1.setName("Mathur");
		System.out.println(student1.getName());
		System.out.println(student4.getName());
		
		
		if(student4 == student1)
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		if(student4.hashCode() == student4.hashCode())
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		System.out.println("----------------------------Deep Copy without clone--------------------");
		//deep copy without clone
		Student student5 = student2.clone2();
		System.out.println(student5);
		System.out.println(student5.hashCode());
		
		student2.setName("Rahul");
		System.out.println(student2.getName());
		System.out.println(student5.getName());
		
		
		if(student5 == student2)
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		if(student5.hashCode() == student2.hashCode())
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		System.out.println("----------------------copy constructor for cloning-----------------");
		//copy constructor for cloning
		Student student6 = new Student(student1);
		System.out.println(student6);
		System.out.println(student6.hashCode());
		
		student1.setName("Rohini");
		System.out.println(student1.getName());
		System.out.println(student6.getName());
		
		
		if(student6 == student1)
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		if(student6.hashCode() == student1.hashCode())
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		System.out.println("------------------------------Deep Copy with clone----------------------------");
		
		//prototype design pattern
		//deep copy with clone method
		Student student7 = student6.getClone();
		System.out.println(student7);
		System.out.println(student7.hashCode());
		
		//wrapper class Integer --> int (primitive type)
		Integer integer1 = new Integer(50);
		System.out.println(integer1);
		
		if(integer1.equals(50))
		System.out.println("Yes");
		
		int a = integer1.intValue();
		System.out.println(a);
		
		Integer integer2 = Integer.MAX_VALUE;
		System.out.println(integer2);
		Integer integer3 = Integer.MIN_VALUE;
		System.out.println(integer3);
		
		a = 77;
		Integer integer4 = Integer.valueOf(a);
		System.out.println(integer4);
		
		System.out.println(Integer.toBinaryString(integer4));
		System.out.println(Integer.toBinaryString(8+a));
	
		
	}
}