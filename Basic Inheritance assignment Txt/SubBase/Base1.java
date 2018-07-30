
abstract public class Base1 {
	int i,j;
	public Base1(int i,int j)
	{
		super();
		this.i=i;
		this.j=j;
	}
	public Base1(int i)
	{
		super();
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	abstract public void disp();
}
