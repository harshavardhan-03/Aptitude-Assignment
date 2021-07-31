package com.xworkz.aptitude;

import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine();
		System.out.println("Enter a word to search:");
		String s = sc.nextLine();
		System.out.println(str.contains(s));
		
	}

}
