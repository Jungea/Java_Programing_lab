package hw7_1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: ������ \n");

		Scanner scan = new Scanner(System.in);

		// (1) ������ ���� 4���� ���� ����
		NormalAccount acc1 = new NormalAccount(11, 1000);  // �Ϲ� ����(���¹�ȣ 11, �ܾ� 1000�� �ʱ�ȭ)
		NormalAccount acc2 = new NormalAccount(22);  // �Ϲ� ����(���¹�ȣ 22�� �ʱ�ȭ)
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);  // ���̳ʽ����� ����(���¹�ȣ 33, �ܾ� 1000, �����ѵ� 500�� �ʱ�ȭ)
		MinusAccount acc4 = new MinusAccount(44, 500);  // ���̳ʽ����� ����(���¹�ȣ 44, �����ѵ� 500�� �ʱ�ȭ)

		//(2) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = "+acc1.getBalance());
		System.out.println("acc2 = "+acc2.getBalance());
		System.out.println("acc3 = "+(acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = "+(acc4.getBalance()+acc4.getLimit()));

		// (3) ����ڷκ��� ��ݾ� �Է¹޾� 4�� ���¿��� ���� ��� ����
		System.out.print("\n��ݾ� �Է�: ");
		int a = scan.nextInt();
		acc1.withdraw(a);
		acc2.withdraw(a);
		acc3.withdraw(a);
		acc4.withdraw(a);

		// (4) ����ڷκ��� �Աݾ� �Է¹޾� 4�� ���¿� ���� �Ա� ����
		System.out.print("\n�Աݾ� �Է�: ");
		a = scan.nextInt();
		acc1.deposit(a);
		acc2.deposit(a);
		acc3.deposit(a);
		acc4.deposit(a);

		// (5) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("\n�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = "+acc1.getBalance());
		System.out.println("acc2 = "+acc2.getBalance());
		System.out.println("acc3 = "+(acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = "+(acc4.getBalance()+acc4.getLimit()));
	}

}
