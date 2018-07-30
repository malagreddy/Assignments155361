//class PublicTraining inherits class Training
public class PublicTraining extends Training{
	private int participants;
	private int cost;
	
	public PublicTraining(int id,String subject,int fees,int participants)
	{
		super(id,subject,fees);
		this.participants=participants;
	}
	public void getOrderValue()
	{
		this.cost=getFees()*participants;
	}
	public int getCost() {
		return cost;
	}

}
