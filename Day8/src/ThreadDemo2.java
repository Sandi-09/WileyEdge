
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread() {
			public void run() {
			System.out.println("run method is invoked");	
			}
		};
		thread.start();
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run method is invoked from runnable");	
			}
			
		};
		Thread d=new Thread(r);
		d.start();
	}

}
