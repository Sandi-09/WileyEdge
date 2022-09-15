package assingment6;

public class BankAccount {
	private String accountId, accountHolderName;
	private AccountType accountType;

	public BankAccount(String accountId, String accountHolderName, AccountType accountType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;	
	}

	public String getAccountId() {
		return this.accountId;
	}

	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}
	public double calculateTotalInterest(double amount,int years) throws DepositAmountException
	{
		double ans=0;
		int interest=0;
		if(amount>0) {
		if(this.accountType.name().equals("savings"))
		{
			interest=this.accountType.getInterest();
			ans=(amount*years*interest)/100;
		}
		else if(this.accountType.name().equals("current")) {
			interest=this.accountType.getInterest();
		   ans=(amount*years*interest)/100;
		}
		return ans;
		}
		else
			throw new DepositAmountException("Please Enter a positive amount");
	}
}