package com.xworkz.aptitude.demomatric;

public class Lmatrix {

	public static void main(String[] args) {
//		int [][] arr = new int [5][5];

		for (int i = 1; i <= 3; i++) {
			if (i == 3) {
				for (int j = 1; j <= 3; j++)
					System.out.print(i + "" + j + " ");
			} else {
				System.out.print("      ");
				System.out.print(i + "" + 3);
				System.out.println();
			}
		}

	}

}
