/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.12.
 * ���� ����: ȸ�� ���α׷� 
 */

package hw5_1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw5_1: ������ \n");

		// (1) ȸ�� 5���� ���� - ȸ�� �迭�� ����� ��
		Member[] m = new Member[5];
		for(int i=0; i<5; i++) 
			m[i] = new Member();

		// (2) ȸ�� 5���� ����� 1, 2, 3, 4, 5�� ���� 
		for(int i=0; i<5; i++) 
			m[i].rate(i+1);

		// (3) ȸ�� 5���� ����Ʈ ���� 
		for(int i=0; i<5; i++) 
			m[i].pointPayment();

		// (4) ȸ�� 5���� ����Ʈ ���� 
		for(int i=0; i<5; i++) 
			m[i].pointPayment();

		// (5) ȸ�� 5���� ���η��� ��ȸ�Ͽ� ���
		for(int i=0; i<5; i++) 
			System.out.println("ȸ��"+(i+1)+" ���η� : "+m[i].discountRate());
	}

}
