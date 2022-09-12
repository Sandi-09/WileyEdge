package Assingments;

import java.time.Month;

public class Date {
	
	int day, month, year;
	
	public Date(int day, int month, int year)
	{
		this.day= day;
		this.month= month;
		this.year= year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean checkDate()
	{
		if(this.month == 1 || 
				this.month == 3 || 
				this.month == 5 ||
				this.month == 7 ||
				this.month == 8 ||
				this.month == 10 ||
				this.month == 12) {
			if(this.day >= 1 && this.day<=31) {
				return true;
			}
		}
		
		else if(this.month == 2)
		{
			int year= this.year;
			if ( ((year % 4 == 0) && (year % 100 != 0)) ||
					(year % 400 == 0)) {
				if(this.day>=1 && this.day<=29) {
					return true;
				}
				return false;
			}
			else {
				if(this.day>=1 && this.day<=28) {
					return true;
				}
				return false;
			}
		}
		
		if(this.day>=1 && this.day<=30) {
			return true;
		}
		return false;
			
		
	}
	
	
	public void displayDate()
	{
		Month month= Month.of(this.month);
		System.out.println("Todays Date is: "+this.day+" "+month+", "+this.year);
	}

	
	public static void main(String[] args)
	{
		Date obj = new Date(29, 2, 2022);
		System.out.println(obj.checkDate());
		obj.displayDate();
	}
	

}