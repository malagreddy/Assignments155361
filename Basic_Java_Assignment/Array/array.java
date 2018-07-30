import java.util.*;
class array
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[15];
		System.out.println("Enter elements of array");
		for(int i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int number=sc.nextInt();
		for(int k=0;k<15;k++)
		{
			if(number==arr[k])
		{
			System.out.println("number is in array");
		}
		else
		{
			System.out.println("number is no in array");
		}
			
		}	
	}
}