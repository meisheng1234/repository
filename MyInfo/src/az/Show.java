package az;

import java.util.Scanner;

public class Show {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("你好，我是青鸟学员");
//		System.out.println("我的名字叫陈志宏");
//		System.out.println("年龄：15岁");
//		System.out.println("爱好：打篮球");
		Scanner input = new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("***************************************************************");
		System.out.println("\n\t\t1.登陆系统\n");
		System.out.println("\t\t2.退出\n");
		System.out.println("***************************************************************");
		System.out.print("请选择，输入数字：");
		int num = input.nextInt();
		switch (num) {
			case 1:
				System.out.println("\t欢迎使用我行我素购物管理系统");
				System.out.println("***************************************************************");
				System.out.println("\n\t\t1.客户信息管理\n");
				System.out.println("\t\t2.购物结算\n");
				System.out.println("\t\t3.真情回馈\n");
				System.out.println("\t\t4.注销\n");
				System.out.println("***************************************************************");
				System.out.print("请选择，输入数字：");
				break;
			case 2:
				System.out.println("欢迎再次使用！");
				break;
			default:
				System.out.println("输入有误！");
				break;
		}
	}

}
