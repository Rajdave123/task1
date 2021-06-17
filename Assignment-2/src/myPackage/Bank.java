package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bank Interest Rate is: " + Account.getInterestRate());
		System.out.println();
		// default constructor
		Account acc = new Account();

		acc.setAccNo(1111);
		acc.setBalance(10000);
		acc.setDurationYears(2);
		acc.setOwnerName("Raj");
		// calculate interest

		// printing account details
		System.out.println("Bank Account Details (Using default Constructor)");
		System.out.println("###################################");
		System.out.println("Account number: " + acc.getAccNo());
		System.out.println("Account holder Name: " + acc.getOwnerName());
		System.out.println("Account Balance: " + acc.getBalance());
		System.out.println("Account Years: " + acc.getDurationYears());
		acc.calculateInterest();
		System.out.println("###################################");
		System.out.println();
		Account acc1 = new Account();

		// Parameterized constructor
		Account acc2 = new Account(2222, "Jay", 23400, 5f);

		// printing details
		acc2.printDetails();

		// total obj created
		System.out.println();
		System.out.println("total obj creared till now are: " + Account.getCount());
	}

}
