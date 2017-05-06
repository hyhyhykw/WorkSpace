package com.it;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestDemo {
	// String str = "\u4e00-\u9fa5";
	public static void main(String[] args) {
		File file = new File("E:/Java/a");
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (Pattern.matches("cpu\\d{1,}", pathname.getName())) {
					return true;
				}
				return false;
			}
		});
		System.out.println(files.length);
		for (File file2 : files) {
			System.out.println(file2.getName());
		}

	}

	/* 用户输入10个整数，并输出这10个整数的最大值和最小值 */
	public static void minAndMax() {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个数:");
			array[i] = input.nextInt();
		}
		input.close();
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			min = Math.min(array[i], array[i + 1]);
			max = Math.max(array[i], array[i + 1]);
		}
		System.out.println("最大值是" + max + ",最小值是" + min);
	}
}
