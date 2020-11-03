package Homework;

import java.util.Random;

public class Gambler extends Account {
	Random ramdom = new Random();

//	public Gambler() {
//		// TODO Auto-generated constructor stub
//		initialAmount();
//	}

	@Override
	void withdraw(int amount) {
		int a = ramdom.nextInt(99);
		// TODO Auto-generated method stub
		if (a >= 51) {
			setBalance(getBalance() - (amount * 2));
			setTransaction(getTransaction() + 1);
			System.out.println(a);
		} else {
			setTransaction(getTransaction() + 1);
		}

	}

	@Override
	void endMonthCharge() {
		// TODO Auto-generated method stub

	}
}
