package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class MyDateP {
	// declaration of private data members
	private int day;
	private int month;
	private int year;

	public MyDateP() {
		day = 01;
		month = 01;
		year = 2000;
	}

	public MyDateP(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// method to print date to console
	public void printDate() {
		System.out.println("Date is: " + day + "/" + month + "/" + year);
	}

}
