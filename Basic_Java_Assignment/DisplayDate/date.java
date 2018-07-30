import java.util.*;
class date
{
	public static void main(String args[])
	{
		int date,month,year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date,month,year in the form of DD MM YYYY");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		String m=null;
		switch(month)
		{
			case 1: m="january";
			break;
			case 2: m="febraury";
			break;
			case 3: m="march";
			break;
			case 4: m="april";
			break;
			case 5: m="may";
			break;
			case 6: m="june";
			break;
			case 7: m="july";
			break;
			case 8: m="august";
			break;
			case 9: m="september";
			break;
			case 10: m="october";
			break;
			case 11: m="november";
			break;
			case 12: m="december";
			break;
		}
		System.out.println(date+"/"+m+"/"+year);
	}
}