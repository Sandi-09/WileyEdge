package Assingments;
public class Fibonacci {
	int first, last;
	public Fibonacci(int first, int last) {
		this.first = first;
		this.last = last;
	}

	public void calculateFibonacci()
	{
		int a=0;
		int b=1;
		int c = a+b;
		for(int i=1; c<this.last; i++)
		{
			a=b;
			b=c;
			c= a+b;
			if (c >= this.first && c <= this.last)
				System.out.print(c + " ");
		}
	}

	
	public static void main(String[] args)
	{
		Fibonacci obj = new Fibonacci(10, 100);
		obj.calculateFibonacci();
	}
}