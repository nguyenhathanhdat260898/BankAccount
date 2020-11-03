package Homework;

public class NickleNDime extends Account {
	private int withdrawCount;

	@Override
	void initialAmount() {
		// TODO Auto-generated method stub
		super.initialAmount();
	}

	@Override
	void withdraw(int amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		withdrawCount++;
	}

	@Override
	void endMonthCharge() {
		// TODO Auto-generated method stub
		setBalance(getBalance() - (withdrawCount *= 0.5));
	}

}
