package Chap4;

import java.util.*;

public class p4_10 {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = sc.nextInt();

			if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�������ϴ�.");
				System.out.print("�õ�Ƚ���� "+count+"���Դϴ�.1");
				break;
			}

		} while (true);

	}

}
