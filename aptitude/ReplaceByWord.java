package com.xworkz.aptitude;

import java.util.Scanner;

public class ReplaceByWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine();
		System.out.println("Enter a word to replace:");
		String oldWord = sc.nextLine();
		System.out.println("Enter a new word to replace with:");
		String newWord = sc.nextLine();

		if (str.contains(oldWord)) {
			str = str.replaceAll(oldWord, newWord);
			System.out.println(str);
		}

	}

}
