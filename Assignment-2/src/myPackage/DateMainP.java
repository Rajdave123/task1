package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class DateMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Created two Date objects.
		MyDateP date1 = new MyDateP();
		MyDateP date2 = new MyDateP(11,12,1971);

		// print date to console
		date1.printDate();
		date2.printDate();
	}

}
