//parent class training 
abstract public class Training {
	private int id;
	private String subject;
	private int fees;
	
	public Training(int id,String subject,int fees)
	{
		super();
		this.id=id;
		this.subject=subject;
		this.fees=fees;
		
	}
	public int getFees() {
		return fees;
	}
	
	abstract public int getCost();
	abstract public void getOrderValue();

}
