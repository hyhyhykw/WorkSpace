package com.it.demo;

import java.util.Scanner;

public class Test {
	/*
	 * 打印一个 n*n 的方阵，n 为每边字符的个数（ 3〈n〈20 ），
	 * 要求最外层为 “x”，第二层为“y”，从第三层起每层依次打印数字
	 * 0，1，2，3，... 例子：当 n =5，打印出下面的图形：
	 *x x x x x
	 *x y y y x
	 *x y 0 y x 
	 *x y y y x 
	 *x x x x x
	 */
	public static void main(String[] args) {
		String[] s = new String[10];
		s[0]="x";
		s[1]="y";
		for (int i = 2; i < s.length; i++) {			
			s[i] = String.valueOf(i-2);
		}
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个大于3小于20的数：");
		int num=input.nextInt();
		while (num<3||num>20) {
			System.out.print("输入错误，请重新输入：");
			num=input.nextInt();
		}
		input.close();
		int num2=(num-1)/2;
		String [][] array=new String[num][num];		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i==j) {
					array[i][j]=s[i];
				}else if (i==num2-1&&j==num2) {
					
				}
				
				if (i==0||j==0||i==num-1||j==num-1) {
					array[i][j]=s[i];
				}else {
					array[i][j]="y";
				}
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
