package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class MyDateT {
	// declaration of private data members
	private int day;
	private int month;
	private int year;

	MyDateT() {
		super();
		this.day = 01;
		this.month = 02;
		this.year = 2020;
		}

	// Parameterized Constructor
	public MyDateT(int day, int month, int year) {
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
