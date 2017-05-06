package com.training.zxkj;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入消费额：");
		double money = sc.nextDouble();
		while (money <= 0) {
			System.out.print("输入错误，请重新输入：");
			money = sc.nextDouble();
		}//输入消费额
		
		System.out.println("是否参加优惠换购活动：\n"
		        + "1:满50元，加2元换购百事可乐饮料一瓶\n" 
				+ "2:满100元，加3元换购500ml可乐一瓶\n"
				+ "3:满100元，加10元换购5公斤面粉\n" 
				+ "4:满200元，加10元换购一个苏泊尔炒菜锅\n" 
				+ "5:满200元，加20元换购欧莱雅爽肤水一瓶\n" 
				+ "0:不换购\n"
		        +"请选择："); 
		int num = sc.nextInt();//选择需要的服务
		
		//判断能否参见活动
		if (money < 50) {
			System.out.println("您的消费不足50元，无法参加换购活动");
			num = 0;
		} else if (money < 100) {
			while (num > 1 && num <= 5) {
				System.out.println("您的消费不足100元，无法参加此活动，请重新选择");
				num = sc.nextInt();
			}
		} else if (money < 200) {
			while (num > 3) {
				System.out.println("您的消费不足200元，无法参加此活动，请重新选择");
				num = sc.nextInt();
			}
		}//判断结束
        sc.close();
		
		switch (num) {
		case 0:
			break;
		case 1:
			money += 2;
			System.out.println("成功换购：百事可乐饮料一瓶");
			break;
		case 2:
			money += 3;
			System.out.println("成功换购：500ml可乐一瓶");
			break;
		case 3:
			money += 10;
			System.out.println("成功换购：5公斤面粉");
			break;
		case 4:
			money += 10;
			System.out.println("成功换购：苏泊尔炒菜锅");
			break;
		case 5:
			money += 20;
			System.out.println("成功换购：欧莱雅爽肤水一瓶");
			break;
		}
		System.out.println("本次消费金额：" + money);

	}
}
