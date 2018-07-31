package in.co.capgemini.test;

public abstract class SavingsAcc extends BankAcc {
	private boolean isSalary;
	private static final float minBal = 1000;

	// constructor
	public SavingsAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal);
		this.isSalary = isSalary;
	}

	public abstract void withdraw(float money);

	@Override
	public String toString() {
		return "SavingsAcc [isSalary=" + isSalary + "]";
	}
}
