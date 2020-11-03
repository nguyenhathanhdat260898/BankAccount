package Homework;

import java.util.Scanner;

public abstract class  Account {
	private int balance;
	private int transaction;
	
	void initialAmount(){
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập số tiền ban đầu");
			balance= input.nextInt();
	}
	
	void deposit(int amount) {
		balance+=amount;
		transaction++;
	}
	
	 void withdraw(int amount) {
		balance-=amount;
		transaction++;
	}
	
	abstract void endMonthCharge();
	
	 void endMonth() {
		endMonthCharge();
		System.out.println("balance :" +balance);
		System.out.println("transaction: "+transaction);
		transaction=0;
	}
	 int getBalance() {
		return balance;
	}
	 void setBalance(int balance) {
		this.balance = balance;
	}
	 int getTransaction() {
		return transaction;
	}
	 void setTransaction(int transaction) {
		this.transaction = transaction;
	}

	
}

