package myPackage;
/*
* Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 * */

public class MyDateC {
	// declaration of private data members
	private int day;
	private int month;
	private int year;

	// Constructor
	public MyDateC() {
		day = 01;
		month = 01;
		year = 2000;
	}
//method to print date to console
	public void printDate() {
		System.out.println("Date is: " + day + "/" + month + "/" + year);
	}

}
