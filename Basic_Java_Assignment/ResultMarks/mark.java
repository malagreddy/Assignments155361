import java.util.*;
class mark
{
	public static void main(String args[]){
	int m1,m2,m3;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the maks of 3 sub");
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	if((m1>60) && (m2>60) && (m3>60))
	{
		System.out.println("passed");
	}
	else if(((m1>60) && (m2>60)) || ((m2>60) && (m3>60)) || ((m1>60) && (m3>60)) )
	{
		System.out.println("promoted");
	}
	else
	{
		System.out.println("failed");
	}
	}
}