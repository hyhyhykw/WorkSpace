package com.training.zxkj;

import java.util.Scanner;

public class Test_9_25 {
	public static void main(String[] args) {
		
	
	}

	public static void xuanzepaixu() {
		int[] arr = { 2, 43, 12, 28, 32, 23, 65 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void maopaopaixu() {
		int[] arr = { 2, 43, 12, 28, 32, 23, 65 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void reward() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入利润：");
		int profit = sc.nextInt();
		sc.close();
		double reward = 1;
		if (profit > 0 && profit <= 10) {
			reward = profit * 0.1;
		} else if (profit <= 20) {
			reward = 10 * 0.1 + (profit - 10) * 0.075;
		} else if (profit <= 40) {
			reward = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
		} else if (profit <= 60) {
			reward = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
		} else if (profit <= 100) {
			reward = 20 * 0.175 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
		} else if (profit > 100) {
			reward = 20 * 0.175 + 40 * 0.08 + 40 * 0.015 + (profit - 100) * 0.01;
		}
		System.out.println("应该提取的奖金是 " + reward + "万");
	}

	public static void ball() {
		double height = 100;
		double sum = 0;
		for (int i = 1; i <= 10; i++) {
			height /= 2;
			sum += height;
			System.out.println(height);
		}
		System.out.println(sum);
	}

	public static void test1() {
		// 斐波那契数列 1 1 2 3 5 8 13 21 34 55 89
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		sc.close();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			if (i <= 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		System.out.println("第" + num + "个月有" + arr[num - 1] + "对兔子");
	}
}
