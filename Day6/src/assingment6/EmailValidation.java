package assingment6;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> emails= new ArrayList<>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user_name@domain.co.in");
		emails.add("user-name@domain.co.in");
		emails.add("user@domaincom");
		 
		//Invalid emails
		emails.add("@yahoo.com");
		emails.add("9856@yahoo.com");
		 
		String regex = "^[A-Za-z+_.-]+@(.+)";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		  Matcher matcher = pattern.matcher(email);
		  System.out.println(email +" : "+ matcher.matches());
		}

	}

}
