package com.it;

import java.util.ArrayList;

public class PrimeRing {
	// 求1～n素数环
	public static void loop(ArrayList<Integer> src, ArrayList<Integer> dest, int n) {
		if (dest.size() == n) {
			Integer start = dest.get(0);
			Integer end = dest.get(dest.size() - 1);
			if (isPrime(start + end)) {
				System.out.println(dest);
			}
			return;
		}
		for (int i = 0; i < src.size(); i++) {
			Integer element = src.remove(i);
			if (dest.isEmpty()) {
				dest.add(element);
			} else {
				Integer tmp = dest.get(dest.size() - 1);
				if (isPrime(tmp + element)) {
					dest.add(element);
				} else {
					src.add(i, element);
					continue;
				}
			}
			loop(src, dest, n);
			src.add(i, element);
			dest.remove(dest.size() - 1);
		}
	}

	// 判断m是否为素数
	public static boolean isPrime(int m) {
		boolean flag = false;
		int temp = (int) Math.sqrt(m);
		if (m <= 3) {
			flag = true;
		} else {
			for (int j = 2; j <= temp; j++) {
				if (m % j == 0) {
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

	public static void main(String args[]) {
		int n = 10;
		ArrayList<Integer> src = new ArrayList<Integer>();
		ArrayList<Integer> dest = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			src.add(i);
		}
		loop(src, dest, n);
	}
}
