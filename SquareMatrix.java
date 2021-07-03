package com.xworkz.aptitude.demomatric;

public class SquareMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 1; i <= arr.length; i++) {
			if (i == 1) {
				for (int j = 1; j <= arr.length; j++)
					System.out.print(i + "" + j + " ");
			} else if (i <= 4) {
				for (int j = 1; j <= arr.length; j++)
					if (j > 1 && j <= 4)
						System.out.print("   ");

					else
						System.out.print(i + "" + j + " ");
			} else
				for (int j = 1; j <= arr.length; j++)
					System.out.print(i + "" + j + " ");
			System.out.println();
		}
	}
}
