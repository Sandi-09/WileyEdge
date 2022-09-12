package Assingments;

public class Circle 
{
	private double radius, area;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double calculateArea()
	{
		if (this.radius < 0)
			System.out.println("Enter a value greater than 0!");
		else
			area= radius * radius * 3.14;
		return area;
	}
	
	public static void main(String[] args)
	{
		Circle c= new Circle(10);
		System.out.println("Area of the circle: " + c.calculateArea());
	}

}