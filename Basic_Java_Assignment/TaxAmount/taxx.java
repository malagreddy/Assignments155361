import java.util.*;
class taxx
{
	public static void main(String args[])
	{
		double tax;
		int income;
		Scanner sc=new Scanner(System.in);
		income=sc.nextInt();
		if((income>=0) && (income<=180000))
		{
			tax=(0*income)/100;
			System.out.println("tax is ="+tax);
		}
		else if((income>=181001) && (income<=300000))
		{
			tax=income*0.1;
			System.out.println("tax is ="+tax);
		}
		else if((income>=300001) && (income<=500000))	
		{
			tax=income*0.2;
			System.out.println("tax is ="+tax);
		}
		else if((income>=500001) && (income<=1000000))
		{
			tax=income*0.3;
			System.out.println("tax is ="+tax);
		}
		
	
	}
}