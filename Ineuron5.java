package com.ineuron;

public class Ineuron5 {
	public static void main(String[] args) {

		int n = 14;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == n - 1) || i == 0 || j == 0 || i == 1 && j < 6 || i == 2 && j < 5 || i == 3 && j < 4
						|| i == 4 && j < 3 || i == 3 && j < 2 || i == 6 && j < 2 || i == 7 && j < 3 || i == 8 && j < 4
						|| i == 9 && j < 5 || i == 10 && j < 6 || i == 11 && j < 7 || i == 12 && j < 8)

				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
