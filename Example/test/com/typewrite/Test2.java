package com.typewrite;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0x4e00; i <= 0x9fa5; i++) {
			list.add((char) i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "	");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
