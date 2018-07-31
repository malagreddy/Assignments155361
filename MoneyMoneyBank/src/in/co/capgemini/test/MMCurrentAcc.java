package in.co.capgemini.test;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accName, float accBal, float CreditLimit) {
		super(accNo, accName, accBal, CreditLimit);
	}

	@Override
	public void withdraw(float money) {
		float CL=getCreditLimit();
		float AB=getAccBal();
		if((getAccBal()+getCreditLimit())-money)>=0){
			setAccBal(getAccBal()-money);
		}else{
			System.out.println("Insufficient funds.");
			System.exit(0);
		}
	}

}
