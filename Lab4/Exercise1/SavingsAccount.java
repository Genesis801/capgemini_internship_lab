package lab4;

public class SavingsAccount extends Account{
	final double minimumBalance;
	
	SavingsAccount(long accNum,double balance,Person accHolder){
		super(accNum,balance,accHolder);
		this.minimumBalance = 500;
	}
	@Override
	public void withdraw(double amt) {
		if(balance >= minimumBalance)
			balance-=amt;
		else
			System.out.println("Insufficient Funds, Cannot Withdraw");
	}
}
