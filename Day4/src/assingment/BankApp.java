package assingment;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		private int accountId;
//		private String accountHolderName;
//		private double openingBalance;
//		private double currentBalance;
		AccountType a1=AccountType.CurrentAccount;
		System.out.println(a1);
		if(a1.equals(AccountType.CurrentAccount))
			System.out.println("true");
		BankAccount b1=new BankAccount(101,"Rajesh",1000,20000,a1);
		b1.depositAmount(100);
		b1.displayTotalBalance();
		b1.withdrawAmount(200000);
		b1.displayTotalBalance();
		System.out.println(b1.getAccountType());
		
//		BankAccount b2=new BankAccount();
//		BankAccount b3=new BankAccount();
	}

}
