import java.util.Scanner;
class arm
{
	public static void main(String []args)
	{
		int c=0,num=153,rem,temp;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			c=c+(rem*rem*rem);
		}
		if(temp==c)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}
}