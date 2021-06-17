package myPackage;

/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */
public class MathEngine {

	int multiply(int a, int b) {
		return (a * b);
	}

	// Overloaded multiply methods
	void multiply(int a, int b, int c) {
		System.out.println("Result is: " + a * b * c);
	}

	// Overloaded multiply methods
	float multiply(float a, int b) {
		return (a * b);
	}

	// Overloaded multiply methods
	float multiply(int a, float b) {
		return (a * b);
	}
}
