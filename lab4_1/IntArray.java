/*
 * �ۼ���: ������
 * �ۼ���: 2018. 3. 22.
 * ���� ���� ����: ���� �迭
 */

package lab4_1;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab4_1: ������ \n");

		// Scanner�� ���� scan�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����
		Scanner scan = new Scanner(System.in);

		// �迭�� ���� �Է� ����
		System.out.print("�迭 ���� �Է�: ");
		int size = scan.nextInt();

		// ����ڷκ��� size ���� �������� �Է¹޾� �迭�� ����
		System.out.printf("%d���� ���� �Է�: ", size);
		int[] intArr = new int[size];
		for(int i=0; i<size; i++) 
			intArr[i] = scan.nextInt();

		// �迭�� ���Ҹ� ������� ��� ���(2��)
		for(int i=0; i<2; i++) {
			System.out.print("�迭 = ");

			for(int j=0; j<size; j++) 
				System.out.print(intArr[j]+" ");

			System.out.print("\n");
		}	
	}

}
