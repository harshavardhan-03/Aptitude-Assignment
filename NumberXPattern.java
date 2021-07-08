package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class NumberXPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows and columns: ");
		int rc = sc.nextInt();
		int center = (rc / 2) + 1;

		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r + c == rc + 1)
					if (c >= center)
						System.out.print(c);
					else {
						System.out.print(r);
					}
				else if (r == c) {
					if (c < center)
						System.out.print(c);
					else if (c >= center && rc % 2 == 0) {
						center -= 1;
						System.out.print(center);
					} else {
						center -= 1;
						System.out.print(center);
					}
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
