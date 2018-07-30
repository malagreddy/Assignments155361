package television;

public class Television {
	private int currentChannel;	//instance members
	private int currentVolume;
	private String currentState;
	
	public int getCurentChannel() {
		return currentChannel;
	}
	public void setCurentChannel(int curentChannel) {
		this.currentChannel = curentChannel;
	}
	public int getCurrentVloume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int increaseVolume(int increaseVolume){
		currentVolume=currentVolume+increaseVolume; //increase the volume
		return increaseVolume;
	}
	public int decreaseVolume(int decreaseVolume)
	{
		currentVolume=currentVolume-decreaseVolume; //decrease the volume
		return decreaseVolume;
	}
	public int changeChannel(int changeChannel)
	{
		currentChannel=changeChannel; //change channel from current channel
		return changeChannel;
	}
	//to change the state of a tv
	public void changeState(String state)
	{
		currentState=state;
		if(state.equals("on"))
		{
			System.out.println("tv is switched on");
		}
		else if(state.equals("off"))
		{
			System.out.println("tv is switched off");
			System.exit(0);
		}
		else
		{
			System.out.println("enter valid state");
		}
	}
}
