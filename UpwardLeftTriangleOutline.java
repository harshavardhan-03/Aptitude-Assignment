package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class UpwardLeftTriangleOutline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter square matrix:");

		int rc = sc.nextInt();
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r == c || c == 1 || r == rc) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
