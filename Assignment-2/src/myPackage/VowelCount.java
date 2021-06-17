package myPackage;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int count = countVowels(str);
		System.out.println("Count of vowels in given string: " +str + " is: -> " + count);
		sc.close();
	}

	public static int countVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.toLowerCase().length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

}
