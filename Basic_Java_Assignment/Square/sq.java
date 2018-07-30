import java.util.scanner;
class sq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sq=square(num);
		System.out.println("Square ="+sq);
	}
	public static int square(int number)
	{
		int square=number*number;
		return square;
	}
}