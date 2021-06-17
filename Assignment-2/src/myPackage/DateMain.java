package myPackage;
/*
* Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 * */

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created two Date objects.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();

		// Initialize data members with initDate methods
		date1.initDate(04, 12, 1999);
		date2.initDate(06, 2, 2000);

		// print date to console
		date1.printDate();
		date2.printDate();
	}

}
