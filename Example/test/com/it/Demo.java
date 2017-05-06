package com.it;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/* 判断一个数是否是 2 的指数次幂。 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		input.close();
		int i = num;
		int count = 0;
		while (i % 2 == 0) {
			i /= 2;
			count++;
		}
		if (i == 1) {
			System.out.println(num + "=" + "2^" + count);
		} else {
			System.out.println(num + "不是2的指数次幂数");
		}
	}
}
