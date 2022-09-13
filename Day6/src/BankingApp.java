
public class BankingApp {
	public static void main(String Args[])
	{
		try {
			Banking b=new Banking(101,10);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
