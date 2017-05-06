package com.it.test1027;

import java.util.Scanner;

public class JiuGongGe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个大于等于3的奇数");
		int length = s.nextInt();
		while (length < 3 || length % 2 == 0) {
			System.out.println("输入的数字不合法！重新输入");
			length = s.nextInt();
		}
		s.close();
		int[][] nineTable = new int[length][length];
		int indexX = 0;
		int indexY = 0;
		indexY = (nineTable.length - 1) / 2;
		nineTable[indexX][indexY] = 1;
		for (int i = 1; i < nineTable.length * nineTable.length; i++) {
			indexX--;
			indexY++;
			if (indexY >= nineTable.length && indexX >= 0) {
				indexY = 0;
			} else if (indexX < 0 && indexY < nineTable.length) {
				indexX = nineTable.length - 1;
			} else if (indexY >= nineTable.length && indexX < 0) {
				indexY--;
				indexX = indexX + 2;
			} else if (nineTable[indexX][indexY] != 0) {
				indexY--;
				indexX = indexX + 2;
			}
			nineTable[indexX][indexY] = i + 1;

		}
		for (int i = 0; i < nineTable.length; i++) {
			for (int j = 0; j < nineTable[i].length; j++) {
				System.out.print(nineTable[i][j] + "	");
			}
			System.out.println();
			System.out.println();
		}

	}

}
