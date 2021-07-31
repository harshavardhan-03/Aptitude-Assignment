package com.xworkz.aptitude;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine();
		System.out.println("Enter which character you want to change:");
		char c = sc.nextLine().charAt(0);
		System.out.println("Enter to which this character to be changed:");
		char d = sc.nextLine().charAt(0);
		char[] cArr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				cArr[i] = d;
			System.out.print(cArr[i]);
		}

	}

}
