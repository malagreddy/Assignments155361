package in.co.capgemini.test;

public class MMSavingsAcc extends SavingsAcc {
	private boolean isSalaried;
	private static final float minBal = 1000;

	public MMSavingsAcc(int accNo, String accName, float accBal, boolean isSalary, boolean isSalaried) {
		super(accNo, accName, accBal, isSalary);
		this.isSalaried = isSalaried;
	}

	// withdraw method for savings Account
	@Override
	public void withdraw(float money) {
		if (isSalaried) {
			if ((getAccBal() - money) >= 0) {
				setAccBal(getAccBal() - money);
			} else {
				System.out.println("Insufficient funds, withdraws below minBalance not allowed.");
			}
		} else {
			if ((getAccBal() - money) >= minBal) {
				setAccBal(getAccBal() - money);
			} else {
				System.out.println("Insufficient funds, withdraws below minBalance not allowed.");
			}
		}
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [isSalaried=" + isSalaried + "]";
	}
}
