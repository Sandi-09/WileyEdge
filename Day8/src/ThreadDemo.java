
public class ThreadDemo  extends Thread{

	public void run()
	{
		System.out.println("Thread demo 1 is executed");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		ThreadDemo d1=new ThreadDemo();
		d1.setName("My Thread");
		d1.start();
	}

}
