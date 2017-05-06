package com.gebadahe;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	/* 题目：将一个正整数分解因数。例如：输入90,打印出90=2*3*3*5。 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = input.nextInt();
		input.close();
		int m = n;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 2; i <= m; i++) {
			while (m % i == 0) {
				array.add(i);
				m /= i;
			}
		}
		System.out.print(n + "=" +1+"*" + array.get(0));
		for (int i = 1; i < array.size(); i++) {
			System.out.print("*" + array.get(i));
		}
	}
}
