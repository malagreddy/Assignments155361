import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Person {

	private int day;
	private String name;
	private int month;
	private int year;

	LocalDate today, dob, dob1, dob2;
	Period p;

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		today = LocalDate.now();
		dob = LocalDate.of(year, Month.of(month),day);
		p = Period.between(dob, today);
	}

public void olderOne(Person person1,Person person2)
{
	int p1year=person1.year;
	int p1month=person1.month;
	int p1day=person1.day;
	int p2year=person2.year;
	int p2month=person2.month;
	int p2day=person2.day;
	String p1name=person1.name,p2name=person2.name;
	dob1=LocalDate.of(p1year,Month.of(p1month),p1day);
	dob2=LocalDate.of(p2year,Month.of(p2month),p2day);
	p=Period.between(dob1,dob2);
	
	if(p1year==p2year)
	{
		if(p1month==p2month)
		{
			if(p1day==p2day)
			{
				System.out.println("They are of same age");
			}
			else if(p1day<p2day)
			{
				System.out.println(p1name+" is older than "+p2name+" by");
			}
			else
			{
				System.out.println(p2name+" is older than "+p1name+" by");
			}
		}
			else if(p1month<p2month)
			{
				System.out.println(p1name+" is older than "+p2name+" by");
			}
			else
			{
				System.out.println(p2name+" is older than "+p1name+" by");
			}
		}
		else if(p1year<p2year)
			{
				System.out.println(p1name+" is older than "+p2name+" by");
			}
			else
			{
				System.out.println(p2name+" is older than "+p1name+" by");
			}
		System.out.println(""+p.getYears()+"Years,"+p.getMonths()+"months"+p.getDays()+"days");
	}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("DOB:"+day+"/"+month+"/"+year);
	System.out.println("Name:"+name);
	System.out.println(""+p.getYears()+"Years,"+p.getMonths()+"months"+p.getDays()+"days");
}
}

