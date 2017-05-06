package com.typewrite;

import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

class TimeIsOut extends TimerTask {
	@Override
	public void run() {
		System.out.println("时间到");
	}
}

public class Begin {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] ch = new char[6];
		int n = 10;
		int count = 0;
		while (n > 0) {
			for (int i = 0; i < ch.length; i++) {
				int index = random.nextInt(str.length());
				ch[i] = str.charAt(index);
			}
			String str2 = new String(ch);
			System.out.println(str2);
			System.out.println("开始");
			MyThread mt = new MyThread();
			mt.start();
			while(mt.isAlive()){
				System.out.println("请输入上面的字符");
				String inputStr = sc.nextLine();
				if (inputStr.equals(str2)) {
					count++;
				}
			}
			n--;
				continue;			
		}
		sc.close();
		System.out.println("一共输入正确了" + count + "次,错误了" + (10 - count) + "次");
	}

}
