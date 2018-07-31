package in.co.capgemini.test;

public class EntryPoint {

	public static void main(String[] args) {
		BankFactory mmBankFactory=new MMBankFactory();
		SavingsAcc mmSavingsAcc=mmBankFactory.getNewSavingsAcc(101, "Mala", 7000, true);
		CurrentAcc mmCurrentAcc=mmBankFactory.getNewCurrentAcc(102, "sam", 5000, 10000);
		
		mmSavingsAcc.withdraw(7000);
		System.out.println(mmSavingsAcc);
		mmSavingsAcc.withdraw(2000);
		System.out.println(mmSavingsAcc);
		
		mmCurrentAcc.withdraw(2000);
		System.out.println(mmCurrentAcc);
		mmCurrentAcc.withdraw(6000);
		System.out.println(mmCurrentAcc);
		
		mmCurrentAcc.deposit(4000);
		System.out.println(mmCurrentAcc);
		
		SavingsAcc mmSavingsAcc1=mmBankFactory.getNewSavingsAcc(103, "mala", 7000, false);
		mmSavingsAcc1.withdraw(3000);
	}

}
