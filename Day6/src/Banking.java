
public class Banking {
private int id;
private int balance;
public Banking(int id, int balance) throws BankingException {
	super();
	this.id = id;
	this.balance = balance;
	
	if(balance<1000)
		//throw new BankingException("Insufficient Balance 1 inside the constructor");
	check(balance);
}
public void check(int i) throws BankingException
{
	if(i>1000)
	{
		System.out.println("amount is sufficient");
	}
	else
		throw new BankingException("insufficient balance");
}
}
