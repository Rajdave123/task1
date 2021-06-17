package myPackage;

/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

//Account class
public class Account {
	// Private data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;

	// static data member
	private static float interestRate;
	private static int count;

	// init static block
	static {
		interestRate = 0.09f;
	}

	// Parameterized Constructor
	public Account(int accNo, String ownerName, double balance, float durationYears) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = durationYears;
		count++;
	}

	// default constructor
	public Account() {
		this.accNo = 1234;
		this.ownerName = "Jay";
		this.balance = 12000;
		this.durationYears = 3;
		count++;
	}

	// setters and getters methods
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getDurationYears() {
		return durationYears;
	}

	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}

	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	public static int getCount() {
		return count;
	}

	// calculateInterest method
	public void calculateInterest() {
		System.out.println("Total Interest is: --> " + (balance * interestRate * durationYears));
	}

	// print account details to the console
	public void printDetails() {
		System.out.println("Bank Account Details (Parametrized Constructor)");
		System.out.println("###################################");
		System.out.println("Account number: " + accNo);
		System.out.println("Account holder Name: " + ownerName);
		System.out.println("Account Balance: " + balance);
		System.out.println("Account Years: " + durationYears);
		System.out.println("###################################");
	}

}
