package com.xworkz.aptitude.demomatric;

public class SquareEdgeMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 1; i <= arr.length; i++) {
			if (i >= 3) {
				for (int j = 1; j <= arr.length; j++)
					if (j >= 3 && j <= 5)
						System.out.print(i + "" + j + " ");
					else
						System.out.print("   ");
			}
			System.out.println();
		}

	}

}
