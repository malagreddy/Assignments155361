
public class Sub1 extends Base1{
	int k;
	public Sub1(int i,int j,int k)
	{super(i,j);
		this.k=k;
	}
	public Sub1(int j,int k)
	{
		super(j);
		this.k=k;
	}
	public void Sub1(int k) {
		this.k=k;
	}	
	 public void disp()
	 {
		 System.out.println(getI()+","+getJ()+","+k);
	 }
}
