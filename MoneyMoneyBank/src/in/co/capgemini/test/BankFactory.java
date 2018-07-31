package in.co.capgemini.test;

abstract public class BankFactory {
	abstract public SavingsAcc getNewSavingsAcc(int accNo, String accName, float accBal, boolean isSalaried);

	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float CreditLimit);
}
