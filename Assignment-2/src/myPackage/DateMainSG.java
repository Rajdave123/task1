package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created two Date objects.
		// using DC
		MyDateSG date1 = new MyDateSG();

		// using PC
		MyDateSG date2 = new MyDateSG(15, 8, 1947);

		// invoking setters methods to date1 object.
		date1.setDay(2);
		date1.setMonth(12);
		date1.setYear(2021);

		// invoking getters methods to date1 object.
		System.out.println(date1.getDay());
		System.out.println(date1.getMonth());
		System.out.println(date1.getYear());

		// invoking setters methods to date2 object.
		date2.setDay(4);
		date2.setMonth(14);
		date2.setYear(1234);

		// invoking getters methods to date2 object.
		System.out.println(date2.getDay());
		System.out.println(date2.getMonth());
		System.out.println(date2.getYear());

		// print the date to console
		date1.printDate();
		System.out.println();
		date2.printDate();
	}

}
