/*
 * �ۼ���: ������
 * �ۼ���: 2018. 03. 25.
 * ����: ���Ѱ� ���� �������� �� ������ �л���
 */

package hw4_1;

import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("hw4_1: ������ \n");

		// ����, ����, �л� �� �Է� ����
		System.out.print("���� ���� �Է�: ");
		int minimum = input.nextInt();  // ����
		System.out.print("���� ���� �Է�: ");
		int maximum = input.nextInt();  // ����
		System.out.print("�л� �� �Է�: ");
		int studentNum = input.nextInt();  // �л� �� 
		System.out.println("");
		
		int[] age = new int[studentNum];  // ����
		int[] ageNum = new int[maximum-minimum+1];  // ���� �� �л� ��
		
		for(int i=0 ; i< studentNum ; i++) {  // �л� �� ��ŭ ���� �Է�
			while (true){
				System.out.print("���� �Է�: ");
				age[i]= input.nextInt();
				
				if(maximum>=age[i] && age[i]>=minimum)
					break;
				
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���");
			}
			
			ageNum[age[i]-minimum]++;  // ���� �� �л� �� ����
		}

		// ���̺� �л� �� ���
		System.out.println("\n���� �л���");
		for(int i=0 ; i<maximum-minimum+1 ; i++ )
			System.out.println(i+minimum +" "+ ageNum[i]);
	}
}