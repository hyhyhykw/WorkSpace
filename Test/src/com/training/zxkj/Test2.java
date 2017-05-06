package com.training.zxkj;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		 test1();
//		 test2();
//		 test3();
//		 test4();
//		 test5();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入金额：");
		double money = sc.nextDouble();
		while (money < 0) {
			System.out.println("请重新输入金额：");
			money = sc.nextDouble();
		}
		
		System.out.println("请选择：(1)会员  (2)不是会员");
		int isVip = sc.nextInt();
		while (isVip != 1 && isVip != 2) {
			System.out.println("请输入1或者2");
			System.out.println("请选择：(1)会员    (2)不是会员");
			isVip = sc.nextInt();
		}
		sc.close();
		
		if (isVip == 2) {
			if (money >= 100) {
				money *= 0.9;
			} else {
				money *= 1;
			}
		} else if (isVip == 1) {
			if (money >= 200) {
				money *= 0.75;
			} else if (money >= 100) {
				money *= 0.8;
			} else {
				money *= 1;
			}
		}
		System.out.println("打折后的结果为：" + money);
	}

	public static void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("小明的成绩：");
		int score = sc.nextInt();
		while (score > 100 || score < 0) {
			System.out.println("请输入1~100之间的数:");
			score = sc.nextInt();
		}
		sc.close();
		if (score >= 90) {
			System.out.println("父亲给她买辆车");
		} else if (score >= 80) {
			System.out.println("母亲给她买笔记本电脑");
		} else if (score >= 60) {
			System.out.println("母亲给她买一部手机");
		} else {
			System.out.println("没有奖励");
		}
	}

	public static void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("压岁钱数目：");
		int money = sc.nextInt();
		sc.close();
		if (money > 1000) {
			System.out.println("捐助失学儿童");
		} else if (money > 500) {
			System.out.println("购买航模");
		} else if(money>0){
			System.out.println("购买百科全书");
		}else {
			System.out.println("什么都不干");
		}
	}

	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("输入您的存款(万)：");
		int money = sc.nextInt();
		sc.close();
		if (money > 500) {
			System.out.println("买凯迪拉克");
		} else if (money > 100) {
			System.out.println("买帕萨特");
		} else if (money > 50) {
			System.out.println("买依兰特");
		} else if (money > 10) {
			System.out.println("买奥托");
		} else {
			System.out.println("买捷安特");
		}
	}

	public static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int a = sc.nextInt();
		System.out.print("请输入第二个数：");
		int b = sc.nextInt();
		sc.close();
		if (a % b == 0 || a + b > 1000) {
			System.out.println("a=" + a);
		} else {
			System.out.println("b=" + b);
		}
	}

	public static void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入Java成绩：");
		int javaScore = sc.nextInt();
		System.out.print("请输入音乐成绩：");
		int musicScore = sc.nextInt();
		sc.close();
		if ((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)) {
			System.out.println("老师奖励他");
		} else {
			System.out.println("老师不奖励他");
		}
	}

}
