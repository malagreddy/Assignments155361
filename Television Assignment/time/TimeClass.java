package time;

public class TimeClass {
	int hours;	//instance members
	int minutes;
	public TimeClass(int hours,int minutes)
	{
		super();
		this.hours=hours;
		this.minutes=minutes;	
	}
	public TimeClass()
	{
		super();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void display()
	{
		System.out.println(hours+"hours"+minutes+"minutes");
	}
	//sum function which gives total hours and minutes and calls display function
	public void sum(TimeClass t1,TimeClass t2)
	{
		hours=t1.hours+t2.hours;	//sum of two time objects 
		minutes=t1.minutes+t2.minutes;
		display();
	}
	
}
