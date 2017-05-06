package com.gebadahe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestList {
	public static void main(String args[]) {
		// 输入10个不同的数,取出两个数组合，打印所有的可能
		Scanner input = new Scanner(System.in);
		List<Integer> src = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			System.out.print("请输入第" + i + "个数：");
			int num = input.nextInt();
			src.add(num);
		}
		input.close();
		List<Integer> dest = new ArrayList<Integer>();
		for (int i = 0; i < src.size() - 1; i++) {
			Integer tmp;
			for (int j = 0; j <= src.size() - i; j++) {
				tmp = src.remove(i);
				dest.add(tmp);
				if (dest.size() == 2) {
					System.out.println(dest);
					tmp = dest.remove(dest.size() - 1);
					src.add(tmp);
				}
			}
			tmp = dest.remove(dest.size() - 1);
			src.add(i, tmp);
		}
		System.out.println(src);
	}
}
