/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.24.
 * ���ϳ���: ������� ���α׷�
 */

package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_4: ������ \n");

		// (1) BankAccount Ŭ������ ���¼��� ��ȸ�Ͽ� ��� --> 0�� ��µ� ����
		System.out.println("���¼� : "+BankAccount.getNumbers());

		// (2) BankAccount Ŭ������ ��� �ּҴ��� ���
		System.out.println("��� �ּҴ��� : "+BankAccount.MIN);

		// (3) ������� ��ü 2�� ����(account1, account2 ��� ����)
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		// (4) BankAccount Ŭ������ ���¼��� ��ȸ�Ͽ� ��� --> 2�� ��µ� ����
		System.out.println("���¼� : "+BankAccount.getNumbers());

		// (5) account1, account2�� ������ ���(toString() ȣ��)
		System.out.println("account1 = "+account1.toString());
		System.out.println("account1 = "+account2.toString());
	}

}
