/*
 * �ۼ���: ������
 * �ۼ���: 2018. 3. 25.
 * ����: ��������, ������, ������� Ȯ��
 */

package hw3_1;

import java.util.Scanner;
import java.util.Random;

public class MultiplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// Scanner�� ���� input�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����

		System.out.println("hw3_1: ������ \n");
		System.out.println("���� ������ ���� �Է��ϼ���(����Ϸ��� 0�� �Է�)\n");
		Random generator = new Random();

		int rightAnswer = 0;  // ���� ��
		int wrongAnswer = 0;  // ���� ��

		for(int i=0;i<5; i++) {
			int x = generator.nextInt(9)+1;  //1~9���� ����
			int y = generator.nextInt(9)+1;  //1~9���� ����

			System.out.print(x +" * "+ y+" = ");
			int answer = input.nextInt();  // ������� �Է�
			if(answer==0)  // ���
				System.out.println("��� \n");
			else if(answer==x*y) {  // ����
				System.out.println("�����Դϴ�. \n");
				rightAnswer++;
			}
			else {  //����
				System.out.println("Ʋ�Ƚ��ϴ�. \n");
				wrongAnswer++;
			}
		}

		int result = rightAnswer*20+wrongAnswer*(-10);  //���� ���
		if(result<0)  // ������ ������ ���
			result=0;

		String s =( (result>=50)? "�հ�" : "���հ�" );  // ��� ���� Ȯ��

		System.out.println("����� "+rightAnswer+" ����� "+wrongAnswer+ " ���� "+result+" --> "+s);
	}

}
