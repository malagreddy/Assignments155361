// Exception class
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
// class factorial
public class Factorial {
	private int num;
	private int fact;
	// method to get the factorial of a number
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
