/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.19.
 * ���ϳ���: ������� ���α׷�
 */

package hw6_2;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw6_2: ������ \n");

		Scanner scan = new Scanner(System.in);
		
		// (1) ���¹�ȣ 1, �����ָ� kim, �ܾ� 9000���� �ʱ�ȭ�� ������� ����(account1 �̶�� ����)
		BankAccount account1 = new BankAccount(1, "kim", 9000);

		//(2) ���¹�ȣ 2, �����ָ� lee�� �ʱ�ȭ�� ������� ����(account2 ��� ����)
		BankAccount account2 = new BankAccount(2,"lee");
		
		//(3) ����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
		System.out.print("�Աݾ�: ");
		int m = scan.nextInt();
		account2.deposit(m);
		
		//(4) ����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
		System.out.print("��ݾ�: ");
		m = scan.nextInt();
		account2.withdraw(m);
		
		//(5) ����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
		System.out.print("�Աݾ�: ");
		m = scan.nextInt();
		account2.deposit(m);
		
		//(6) ����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
		System.out.print("��ݾ�: ");
		m = scan.nextInt();
		account2.withdraw(m);
		
		//(7) ����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
		System.out.print("�۱ݾ�: ");
		m = scan.nextInt();
		account2.transfer(account1, m);
		
		//(8) ����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
		System.out.print("�۱ݾ�: ");
		m = scan.nextInt();
		account2.transfer(account1, m);
		
		//(9) account2�� �����ָ��� park���� ����
		account2.setName("park");
		
		//(10) account2�� ���¹�ȣ, �����ָ�, �ܾ� ���
		System.out.println("account2 = "+account2.toString());
		
		//(11) account1�� ���¹�ȣ, �����ָ�, �ܾ� ���
		System.out.println("account1 = "+account1.toString());
	}

}
