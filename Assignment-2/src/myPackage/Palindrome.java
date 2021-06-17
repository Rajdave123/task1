package myPackage;
/*
 * Author: Raj Dave 
 * CreationDate: 9/6/2021
 * version: 1.0.0
 * copyRight: Sterlite Technology Ltd.
 */

import java.util.Scanner;

//class checking for if string is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// taking user input from keyboard
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		// method call to checkPalindrome
		checkPalindrome(str);
		sc.close();
	}

	private static void checkPalindrome(String str) {
		// TODO Auto-generated method stub
		// initializing indexes for string 
		int i;
		int j = str.length() - 1;
		int cnt = 0;
		for (i = 0; i < str.length(); i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				cnt++;
			}
		}
		if (cnt > 0) {
			System.out.println(str + " : is not a palindrome string");
		} else {
			System.out.println(str + ": is a palindrome string");
		}
	}

}
