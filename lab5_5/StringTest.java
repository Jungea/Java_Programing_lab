/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.10.
 * ���ϳ���: String ����*/

package lab5_5;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_2: ������ \n");

		Scanner s = new Scanner(System.in);

		System.out.print("���ڿ� s1 �Է�(���̰� 5�̻�): ");
		String s1 = s.nextLine();
		System.out.print("���ڿ� s2 �Է�(���̰� 5�̻�): ");
		String s2 = s.nextLine();
		// (1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���

		System.out.println("\ns1�� ���� = "+s1.length());
		// (2) s1�� ���� ���

		System.out.println("s1�� ù��° ���� = "+s1.charAt(0));
		// (3) s1�� ù��° ���� ���

		System.out.println("s1�� �ι�°~�׹�° �κй��ڿ� = "+s1.substring(1,4));
		// (4) s1�� �ι�°~�׹�° �κй��ڿ�(��, ���� 3��) ���

		System.out.println("s1�� �빮�ڷ� ���� = "+s1.toUpperCase());
		// (5) s1�� �빮�ڷ� ������ ��� ��� - ����: s1�� ����Ǹ� �ȵ�

		System.out.println("s1�� s2�� �������� ���� = "+s1.equals(s2));
		// (6) s1�� s2�� �������� ���� ���

		System.out.println("s1�� s2�� ��ҹ��� ���� ���ָ� �������� ���� = "+s1.equalsIgnoreCase(s2));
		// (7) s1�� s2�� ��ҹ��� ���� ���ָ� �������� ���� ���

		System.out.println("s1�� s2�� ���������� ���� ��� = "+s1.compareTo(s2));
		// (8) s1�� s2�� ���������� ���� ��� ���(����, 0, ���)
	}

}
