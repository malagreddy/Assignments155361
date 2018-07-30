class InvalidInputException extends Exception{
	public InvalidInputException() {
		super();
	}
}

class FactorialException extends Exception{
	public FactorialException() {
		super();
	}
}
public class Factorial {
	private int num;
	private int fact;
	public int getfactorial(int num) throws InvalidInputException,FactorialException
	{
		if(num<2) {
			throw new InvalidInputException();
		}
			long fact=1;
			for(int i=1;i<=num;i++) {
				fact*=i;
		}
			if(fact>2_147_483_647) {
				throw new FactorialException();
			}
		return (int)fact;
	}
	 
}
