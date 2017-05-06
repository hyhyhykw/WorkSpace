package com.it;

import java.util.Scanner;

public class Sovle {
	static int num;

	public static int rootNum(int a, int b, int c) {
		num = b * b - 4 * a * c;
		if (num > 0) {
			return 2;
		} else if (num < 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static String root(int rootNum, int a, int b) {
		if (rootNum == 2) {
			double root1 = (-b + Math.sqrt(num)) / 4 / a;
			double root2 = (-b - Math.sqrt(num)) / 4 / a;
			return "解1为:" + root1 + ",解2为:" + root2;
		} else if (rootNum == 1) {
			double root = b / -2 / a;
			return "解为：" + root;
		} else {
			return "无解";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ax^2+bx+c=0");
		System.out.print("请输入a的值：");
		int a = sc.nextInt();
		System.out.print("请输入b的值：");
		int b = sc.nextInt();
		System.out.print("请输入c的值：");
		int c = sc.nextInt();
		sc.close();
		String abc;
		if (a == 1) {
			abc = "*x^2" + "+" + b + "*x" + "+" + c + "=0";
		} else {
			abc = a + "*x^2" + "+" + b + "*x" + "+" + c + "=0";
		}
		int rootNum = rootNum(a, b, c);
		String root = root(rootNum, a, b);
		if (num < 0) {
			System.out.println(abc + root);
		} else {
			System.out.println(abc + "有" + rootNum + "个解," + root);
		}
	}
}
