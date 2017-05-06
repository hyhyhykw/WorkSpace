package com.gebadahe;

import java.util.Scanner;

public class Ge {
	public static boolean prime(int n) {
		boolean flag = false;
		int temp = (int) Math.sqrt(n);
		if (n <= 3) {
			flag = true;
		} else {
			for (int j = 2; j <= temp; j++) {
				if (n % j == 0) {
					flag = false;
					break;
				}
				if (j >= temp) {
					flag = true;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个大于6的偶数：");
		int num = input.nextInt();
		while (num % 2 != 0 || num < 6) {
			System.out.print("输入错误，请重新输入:");
			num = input.nextInt();
		}
		input.close();
		int a = 3;
		int b = num - a;
		while (a <= num / 2) {
			boolean aIsPrime = prime(a);
			boolean bIsPrime = prime(b);
			if (bIsPrime && aIsPrime) {
				System.out.println(num + "=" + a + "+" + b);
			}
			a++;
			b = num - a;
		}
	}
}
