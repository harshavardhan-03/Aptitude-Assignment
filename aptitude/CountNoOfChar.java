package com.xworkz.aptitude;

import java.util.Scanner;

public class CountNoOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the character to be searched:");
		char c = sc.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}
		System.out.println("Number of characters in a given string:\n" + count);
	}

}
