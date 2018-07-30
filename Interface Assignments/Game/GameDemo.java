//program to implement interface
public class GameDemo {
	public static void perform(Game game)   //perform() takes interface reference as a parameter 
	{
		game.play();   //play() method is invoked
	}
	public static void main(String[] args) {
		
		Game game[]=new Game[3];
		game[0]=new Cricket();
		game[1]=new FootBall();
		game[2]=new Tennis();
		
		perform(game[0]);
		perform(game[1]);
		perform(game[2]);
	}
		

}
