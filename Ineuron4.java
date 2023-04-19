package com.ineuron;

public class Ineuron4 {
	public static void main(String[] args) {

		int n = 14;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == n - 1) || j == 0 && i > 5 || j == (n - 1) && i > 5 || i == n - 2 || i == n - 3 && j < 6
						|| i == n - 3 && j > 7 || i == n - 4 && j < 5 || i == n - 4 && j > 8 || i == n - 5 && j < 4
						|| i == n - 5 && j > 9 || i == n - 6 && j < 3 || i == n - 6 && j > 10 || i == n - 7 && j < 2
						|| i == n - 7 && j > 11)

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
