class intr
{
	public static void main(String []args)
	{
		double p,t,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of p");
		p=sc.nextDouble();
		System.out.println("Enter value of p");
		t=sc.nextDouble();
		System.out.println("Enter value of r");
		r=sc.nextDouble();
		si=(p*t*r)/100;
		ci=p*Math.pow(1.0+r/100.0,t)-p;
		System.out.println("si="+si);
		System.out.println("si="+ci);
	}
}