package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class MyDateSG {

	// declaration of private data members
	private int day;
	private int month;
	private int year;

	// default constructor
	MyDateSG() {
	}

	// Parameterized Constructor
	public MyDateSG(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// setters and getters methods
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// method to print date to console
	public void printDate() {
		System.out.println("Date is: " + day + "/" + month + "/" + year);
	}
}
