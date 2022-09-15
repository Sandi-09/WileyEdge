package StringFolder;

public class GarbageCollectors {
public static void main(String args[])
{
	long total1=Runtime.getRuntime().freeMemory();
	System.out.println("free memory "+total1);

	int [] array=new int[100];
	array[0]=1;
	if(array[0]==3) {
		return;
	}
	long total2=Runtime.getRuntime().freeMemory();
	System.out.println("free memory "+total2);
}
}
