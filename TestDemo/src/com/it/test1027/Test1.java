package com.it.test1027;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> src = new ArrayList<>();
		ArrayList<Integer> dest = new ArrayList<>();
		for (int i = 1; i <= 33; i++) {
			src.add(i);
		}
		int num = 1;
		while (num <= 7) {
			Thread.sleep(2000);
			Random random = new Random();
			int ranNum = random.nextInt(src.size());
			Integer i = src.remove(ranNum);
			System.out.print(i + "\t");
			dest.add(i);
			num++;
		}
		Thread.sleep(1000);
		System.out.println();
		System.out.println("本次的彩票号码是" + dest);
	}
}
