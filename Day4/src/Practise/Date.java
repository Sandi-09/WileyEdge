package Practise;

public class Date {
	private int month;
	private int day;
	private int year;
	public Date()
	{
		
	}
	public Date(int day, int month, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean validateDate()
	{
		int month=this.getMonth();
		int year=getYear();
		int day=getDay();
		if(month<1 || month>12 )
			return false;
		if(day<1 || day>32)
			return false;
		return true;
	}
	public String displayDate()
	{
		return day+"/"+month+"/"+year;
	}
	
}
