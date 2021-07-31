package com.xworkz.aptitude;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine();
		int n = str.length();
		String d = "";
		for (int i = n - 1; i >= 0; i--) {
			d += str.charAt(i);
		}
		if (str.equals(d))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
