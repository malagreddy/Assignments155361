import java.util.Scanner;
class armrange
{
	public static void main(String []args)
	{
		int num,c,rem,l,h;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the lower limit");
		l=s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the upper limit");		
		h=s1.nextInt();
		
		for(int j=l;j<=h;j++)
		{
		num=j;
		rem=0;
		c=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			c=c+(rem*rem*rem);
		}
		if(j==c)
		{
			System.out.print(" "+j);
		}
		}		
	}
}