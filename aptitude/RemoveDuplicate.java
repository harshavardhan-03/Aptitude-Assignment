package com.xworkz.aptitude;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string input:");
		String str = sc.nextLine(); // harsha
		char[] c = str.toCharArray(); // ['h','a','r','s','h','a']
		for (int i = 0; i < str.length(); i++) { // 0 == h 1 == a
			for (int j = i + 1; j < str.length(); j++) { // 1 a 2 r 3 s 4 h 5 a
				if (c[i] == c[j])
					c[i] = '!';// h = 4 c[i] = '!'
				else
					System.out.print("");
			}
			if (c[i] != '!')
				System.out.print(c[i]);
		}
	}
}