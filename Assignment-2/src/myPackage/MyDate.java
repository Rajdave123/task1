package myPackage;
/*
* Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 * */

public class MyDate {
	private int day;
	private int month;
	private int year;

	// Constructor
	public void initDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	// method to print date to console
	public void printDate() {
		System.out.println("Date is: " + day + "/" + month + "/" + year);
	}

}
