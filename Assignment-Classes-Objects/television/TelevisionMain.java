/*Program to create a class,create an instance, turn on, increase and decrease the volume ,
change channels,get information about the state,volume,channel and finally turn it off.*/
package television;
import java.util.*;
public class TelevisionMain {

	public static void main(String[] args) {
		Television television=new Television();
		Scanner sc=new Scanner(System.in);
		System.out.println("DO you want to switch on the television");
		String currentState=sc.nextLine();
		television.setCurrentState(currentState);
		if( currentState.equals("yes"))
		{
			System.out.println("tv is switched on");
		}
		else
		{
			System.exit(0);
		}
		
		System.out.println("enter the current channel");
		int currentChannel=sc.nextInt();
		television.setCurentChannel(currentChannel);
		
		System.out.println("enter the current volume");
		int currentVolume=sc.nextInt();
		television.setCurrentVolume(currentVolume);
		
		System.out.println("Do you want to increase the volume");
		String ansincreasevol=sc.next();
		//if yes to increase volume
		if(ansincreasevol.equals("yes"))
		{
			System.out.println("enter the volume to be increased");
			int increasevol=sc.nextInt();
			television.increaseVolume(increasevol);
			System.out.println("thecurrent volume is"+television.getCurrentVloume());
		}
		//if no to increase volume
		else if(ansincreasevol.equals("no"))
		{
			System.out.println("thecurrent volume remains same"+television.getCurrentVloume());
		}
		
		System.out.println("Do you want to decrease the volume");
		String ansdecreasevol=sc.next();
		//if yes to decrease volume
		if(ansdecreasevol.equals("yes"))
		{
			System.out.println("enter the volume to be decreased");
			int decreasevol=sc.nextInt();
			television.decreaseVolume(decreasevol);
			System.out.println("thecurrent volume is"+television.getCurrentVloume());
		}
		//if no to decrease volume
		else if(ansdecreasevol.equals("no"))
		{
			System.out.println("thecurrent volume remains same"+television.getCurrentVloume());
		}

		System.out.println("Do you want to chnage channel");
		String anschangechannel=sc.next();
		//if yes to change channel
		if(anschangechannel.equals("yes"))
		{
			System.out.println("enter the channel number");
			int changechannel=sc.nextInt();
			television.changeChannel(changechannel);
			System.out.println("the new channel is"+television.getCurentChannel());
		}
		//if no to change channel
		else if(anschangechannel.equals("no"))
		{
			System.out.println("the channel remains same"+television.getCurentChannel());
		}
		System.out.println("Do you want to switchoff the tv");
		String ansswitch=sc.next();
		//to switch off the TV
		if(ansswitch.equals("yes"))
		{
			System.out.println("the tv is switched off");
			System.exit(0);
		}
		
	}

}
