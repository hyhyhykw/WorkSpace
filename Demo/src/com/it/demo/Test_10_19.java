package com.it.demo;


import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_10_19 {
	public static void main(String[] args) {
		Random random=new Random();
		int num=random.nextInt(5);
		switch (num) {
		case 0:
			System.out.println("沙县");
			break;
		case 1:
			System.out.println("牛肉面");
			break;
		case 2:
			System.out.println("包子");
			break;
		case 3:
			System.out.println("臊子面");
			break;
		case 4:
			System.out.println("砂锅");
			break;
			
		}
	}

	public static void pattern() {
		Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{1,3}\\.\\d{1,3}");
		Matcher matcher = pattern.matcher("sdfsdsd192.168.0.1");
		boolean isIp = matcher.matches();
		boolean isEmail = Pattern.matches("\\w{6,10}@\\w+\\.com", "hyhyhykw@gmail.com");
		System.out.println(isEmail);
		isIp=matcher.find();
		System.out.println(isIp);
	}

	public static void test7() {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DATE, 9);
		long time=cal.getTimeInMillis();
		System.out.println(time/1000/60/60/24);
	}

	public static void test4() {
		Random random = new Random();
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			int num = random.nextInt(2);
			if (num == 0) {
				count++;
			}
		}
		System.out.println("正面的次数："+count+"\n反面的次数："+(1000-count));
	}

	public static void test3() {
		StringBuffer sbf = new StringBuffer();
		for (int i = 97; i < 123; i++) {
			sbf.append((char) i);
		}
		sbf.reverse();
		sbf.delete(0, 5);
		System.out.println(sbf);
	}

	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.println("输入：");
		String str = input.nextLine();
		input.close();
		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		System.out.println(str + "\n" + sbf);
	}


}
