package assingment6;

public enum AccountType {
	savings(5), current(10);
	private int i;
	private AccountType(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	
	public int getInterest() {
		return i;
	}
	
}
