package az;

import java.util.Scanner;

public class Show {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("��ã���������ѧԱ");
//		System.out.println("�ҵ����ֽг�־��");
//		System.out.println("���䣺15��");
//		System.out.println("���ã�������");
		Scanner input = new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع������ϵͳ");
		System.out.println("***************************************************************");
		System.out.println("\n\t\t1.��½ϵͳ\n");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("***************************************************************");
		System.out.print("��ѡ���������֣�");
		int num = input.nextInt();
		switch (num) {
			case 1:
				System.out.println("\t��ӭʹ���������ع������ϵͳ");
				System.out.println("***************************************************************");
				System.out.println("\n\t\t1.�ͻ���Ϣ����\n");
				System.out.println("\t\t2.�������\n");
				System.out.println("\t\t3.�������\n");
				System.out.println("\t\t4.ע��\n");
				System.out.println("***************************************************************");
				System.out.print("��ѡ���������֣�");
				break;
			case 2:
				System.out.println("��ӭ�ٴ�ʹ�ã�");
				break;
			default:
				System.out.println("��������");
				break;
		}
	}

}
