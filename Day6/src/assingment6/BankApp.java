package assingment6;

public class BankApp {
public static void main(String args[])
{
	AccountType at=AccountType.savings;
	AccountType at1=AccountType.current;
	BankAccount b=new BankAccount("101","Raju,",at);
	BankAccount b1=new BankAccount("101","Rahul,",at1);
	try {
			System.out.println("The interest calculated is-->"+b1.calculateTotalInterest(-500, 8));
		
	} catch (DepositAmountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		System.out.println("The interest calculated is-->"+b.calculateTotalInterest(500, 8));
	} catch (DepositAmountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
