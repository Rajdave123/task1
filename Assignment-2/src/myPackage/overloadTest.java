package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

public class overloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create obj me for MathEngine
		MathEngine me = new MathEngine();

		// methos calls to differnt types of overloaded methods

		// overload of type int , int
		System.out.println("Result is: " + me.multiply(5, 10));

		// overload of type int , int ,int
		me.multiply(5, 10, 15);

		// overload of type float , int
		System.out.println("Result is: " + me.multiply(5.2f, 10));

		// overload of type int , float
		System.out.println("Result is: " + me.multiply(5, 1.2f));
	}

}
