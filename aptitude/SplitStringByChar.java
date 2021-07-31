package com.xworkz.aptitude;

import java.util.Scanner;

public class SplitStringByChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine();
	
		for (String s : str.split(","))
			System.out.println(s);
	}
}
