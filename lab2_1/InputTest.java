package lab2_1;

/*
 * ���ϸ�: InputTest.java
 * �ۼ���: 2018.3.15
 * �ۼ���: ������
 * ����:  Scanner Ŭ������ �̿��� �Է��� �����ϴ� ���α׷�
 */

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab2_1: ������\n");

		// Scanner�� ���� input�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����
		Scanner input = new Scanner(System.in);

		// ���ø�, �α�, ��� ����� �Է¹���
		System.out.print("���ø� �Է�: ");
		String city = input.nextLine();

		System.out.print("�α� �Է�(������ ����): ");
		int population = input.nextInt();

		System.out.print("��� ��� �Է�: ");
		double averageDegree = input.nextDouble();

		// ���ø�, �α�, ��� ��� ���
		System.out.println("\n���ø� = " + city);
		System.out.println("�α� = " + population +"��");
		System.out.println("��� ��� = " + averageDegree);
	}

}
