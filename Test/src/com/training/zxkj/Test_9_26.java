package com.training.zxkj;

import java.util.Scanner;

public class Test_9_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		switch (num) {
		case 1:
			test();
			break;

		case 2:
			add();
			break;
		}

	}

	static int test() {
		if (add()) {
			return 1;
		} else {
			return 2;
		}
	}

	static boolean add() {
		return false;
	}
}
