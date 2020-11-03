package Homework;

public class Fee extends Account {

	@Override
	void initialAmount() {
		// TODO Auto-generated method stub
		super.initialAmount();
	}

	@Override
	void endMonthCharge() {
		// TODO Auto-generated method stub
		setBalance(getBalance() - 5);
	}

}
