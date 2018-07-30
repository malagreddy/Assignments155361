//class CorporateTraining inherits class Training
public class CorporateTraining extends Training{
	private int days;
	private int cost;
	
	public CorporateTraining(int id,String subject,int fees,int days)
	{
		super(id,subject,fees);
		this.days=days;
	}
	public void getOrderValue()
	{
		this.cost=getFees()*days;
	}
	public int getCost() {
		return cost;
	}

}
