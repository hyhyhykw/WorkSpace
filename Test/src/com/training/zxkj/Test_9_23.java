package com.training.zxkj;

import java.util.Arrays;

public class  Test_9_23 {
	public static void main(String[] args) {
		double height=100;
		double sum=0;
		for(int i=1;i<=10;i++){
			height/=2;
			sum+=height;
			System.out.println(height);
		}
		System.out.println(sum);
	}

	public static void t6() {
		int[] arr = { 23, 80, 12, 34, 33, 43, 55, 45, 31, 15 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void xuanzepaixu() {
		int[] arr = { 23, 80, 12, 34, 33, 43, 55, 45, 31, 15 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
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

	public static void t5() {
		// 冒泡排序
		int[] arr = { 23, 80, 12, 34, 33, 43, 55, 45, 31, 15 };
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
			System.out.print(i + "\t");
		}
	}

	public static void t4() {
		int[] arr = { 1, 13, 24, 34, 45, 56, 67, 78, 89, 94 };
		int index = Arrays.binarySearch(arr, 24);
		System.out.println(index);
	}

	public static void t3() {
		int[] arr = { 1, 13, 24, 34, 45, 56, 67, 78, 89, 94 };
		int min = 0;
		int max = arr.length - 1;
		int num = 12;
		int index = -1;
		while (max >= min) {
			int mid = (min + max) / 2;
			if (num > arr[mid]) {
				min = mid + 1;
			} else if (num < arr[mid]) {
				max = mid - 1;
			} else {
				index = mid;
				break;
			}
		}
		System.out.println(index);
	}

	public static void t2() {
		int[] arr = { 1, 13, 24, 34, 45, 56, 67, 78, 89, 94 };
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		int num = 45;
		while (num != arr[mid]) {
			if (num > arr[mid]) {
				min = mid + 1;
			} else if (num < arr[mid]) {
				max = mid - 1;
			}
			mid = (min + max) / 2;
			if (min > max) {
				mid = -1;
				break;
			}
		}
		System.out.println(mid);
	}

	public static void t1() {
		int[] arr = { 12, 3, 45, 89, 23, 2, 4 };
		int num = 12;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
