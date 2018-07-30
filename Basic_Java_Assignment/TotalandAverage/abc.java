import java.util.*;
class abc
{
	public static void main(String []args)
	{
		int total,t,a,average;
		Scanner sc=new Scanner(System.in);
		int m1[]=new int[3];
		int m2[]=new int[3];
		int m3[]=new int[3];
		System.out.println("Enter marks of 3 students");
		for(int i=0;i<3;i++)
		{
			m1[i]=sc.nextInt();
			m2[i]=sc.nextInt();
			m3[i]=sc.nextInt();
			
		}
		for(int i=0;i<3;i++)
		{
			total=m1[i]+m2[i]+m3[i];
			average=total/3;
			System.out.println("total of marks student="+total);
			System.out.println("average="+average);
		}
		
		t=m1[1]+m2[1]+m3[1];
		a=t/3;
		System.out.println("total of subject="+t);
		System.out.println("average="+a);
	}
}