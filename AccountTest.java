package Homework;

public class AccountTest {
	public static void main(String[] args) {
		Fee user1 = new Fee();
		NickleNDime user2 = new NickleNDime();
		Gambler user3 = new Gambler();

		System.out.println("Fee:");
		user1.deposit(100);
		user1.withdraw(5);
		user1.endMonth();
		System.out.println();

		System.out.println("NickleNDime: ");
		user2.deposit(100);
		user2.withdraw(5);
		user2.endMonth();
		System.out.println();

		System.out.println("Gambler: ");
		user3.deposit(100);
		user3.withdraw(5);
		user3.endMonth();
		System.out.println();
	}
}
