/*
 * �ۼ���: ������
 * �ۼ���: 2018. 03. 27.
 * ���ϳ���: �迭 ������ ��
 */

package lab4_2;

import java.util.Scanner;

public class ArrayParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab4_2: ������");
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���� �Է�: ");
		int num = input.nextInt();
		
		System.out.print(num+"���� ���� �Է�: ");
		int[] a = new int[num];
		for(int i=0; i<a.length; i++)
			a[i] = input.nextInt();
		
		int sum = sumArr(a);
		
		System.out.println("�� = "+sum);
	}
	private static int sumArr(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		
		return sum;
	}

}
