package com.it.demo;

import java.util.ArrayList;
import java.util.List;

public class PrimeRing {
	// 求1～n素数环
	public PrimeRing(int n) {
		List<Integer> src = new ArrayList<Integer>();
		List<Integer> dest = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			src.add(i);
		}
		loop(src, dest, n);
	}

	public void loop(List<Integer> src, List<Integer> dest, int n) {
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

	// 判断k是否为素数
	public boolean isPrime(int k) {
		if (k == 2)
			return true;
		if (k < 2 || k > 2 && k % 2 == 0)
			return false;
		int j = (int) Math.sqrt(k); // Math.sqrt(k)返回k的平方根值
		if (j % 2 == 0)
			j--; // 获得测试范围内的最大奇数
		while (j > 2 && k % j != 0)
			j -= 2;
		return j < 2;
	}

	public static void main(String args[]) {
		new PrimeRing(8);
	}
}
