/*
 * �ۼ���: ������
 * �ۼ���: 2018.05.31.
 * ���ϳ���: ����� ����ϱ�
 */

package lab14_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: ������");

		int[] values = new int[] {1, 2, 3, -1}; 
		int sum = arraySum(values);   // (��) breakpoint ����
		System.out.print("���� ");
		System.out.println(sum);
	}

	private static int arraySum(int[] array) {
		int sum = 0;     
		for (int i = 0; i < array.length; i++) {  
			sum += array[i];   // (��) =+ ����
		} 
		return sum;     // (��) breakpoint ���� �� ����
	}
}