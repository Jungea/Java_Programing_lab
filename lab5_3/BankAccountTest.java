/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.04.
 * ����: ������� ���α׷� �ۼ�
 */

package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_3: ������ \n");
		int b;

		BankAccount bank = new BankAccount();
		// ������� ��ü�� �ϳ� ����

		bank.deposit(2000);  // ���¿� 2000���� �Ա�
		bank.deposit(3000);  // ���¿� 3000���� �Ա�
		System.out.println("�ܾ� = "+bank.ballance+"��");  // ������ �ܾ� �ʵ带 ���

		b=bank.getBalance();
		System.out.println("�ܾ� = "+b+"��");  // �ܾ���ȸ(getBalance()ȣ��) �� ���
		
		bank.withdraw(1000);  // ���¿��� 1000���� ���
		
		b=bank.getBalance();
		System.out.println("�ܾ� = "+b+"��");  // �ܾ���ȸ(getBalance()ȣ��) �� ���
	}

}
