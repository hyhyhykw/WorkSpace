package com.it;

public class Triangle {
	public static void main(String[] args) {
		int[][] arr = new int[7][];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.print("	");
			}
			arr[i] = new int[i + 1];
			for (int k = 0; k <= i; k++) {
				if (k == 0 || i == k) {
					arr[i][k] = 1;
				} else {
					arr[i][k] = arr[i - 1][k] + arr[i - 1][k - 1];
				}
				System.out.print(arr[i][k] + "		");
			}
			System.out.println();
		}
	}
}
