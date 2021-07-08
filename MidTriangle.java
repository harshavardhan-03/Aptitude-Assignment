package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class MidTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Rows and columns:");
		int rc = sc.nextInt();
		int center = (rc / 2) + 1;
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= center && r + c >= rc + 1 && c <= r)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
