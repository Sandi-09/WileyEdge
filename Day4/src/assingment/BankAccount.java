package assingment;

public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private AccountType accountType;
	


	private double totalBalance;

	public BankAccount(int accountId, String accountHolderName, double openingBalance, double currentBalance,
			AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = currentBalance;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public void getTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void depositAmount(double amount) {
		double balance = 0;
		if (amount > 0) {
			balance = getCurrentBalance() + amount;
			setCurrentBalance(balance);
		} else
			System.out.println("Invalid deposit amount");
	}

	public void withdrawAmount(double amount) {
		double balance = 0;
		if (getOpeningBalance() > 0 && amount < getCurrentBalance()) {
			System.out.println("the amount can be withdrawn " + amount);
			balance = getCurrentBalance() - amount;
			setCurrentBalance(balance);
		} else
			System.out.println("Enter proper amount to be withdrawn");
	}

	public double getCurrentBalance() {
		return this.currentBalance;
	}

	public void displayTotalBalance() {
		if (getOpeningBalance() > 0) {
			double total = getCurrentBalance() + getOpeningBalance();
			System.out.println(total);
		} else
			System.out.println("Enter deposit amount greater than 0");
	}
}
