
public class SalaryExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//boolean b=calculateSalary(50000,0);
			try {
				calculateSalary(5000,7);
			} catch (SalaryException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getLocalizedMessage());
				//return 0;
				System.out.println(e.getMessage());
			}
			
		}

	private static void calculateSalary(int i,int j) throws SalaryException {
		// TODO Auto-generated method stub
		
		if(i/j<8000)
			throw new SalaryException();
		
	}

}
