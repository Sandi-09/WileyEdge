
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee(101,"Sandi");
       String s=e1.toString();
       System.out.println(s);
       Employee e2=new Employee(101,"Ram");
       if(e1.equals(e2))
       System.out.println("Barabar hai");
       else 
    	   System.out.println("Apna kam kar bhai...Ye sab moh maya hai");
       System.out.println(e1.hashCode());
	}
	
}
