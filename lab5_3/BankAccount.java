/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.04.
 * ����: ������� ���α׷� �ۼ�
 */

package lab5_3;

public class BankAccount {  // ������¸� ��Ÿ���� Ŭ����
	int ballance;  // �ܾ�
	
	void deposit(int amount) {  // �Ա�
		ballance+=amount;
	}
	int getBalance() {  // �ܾ���ȸ
		return ballance;
	}
	void withdraw(int amount) {  // ���
		ballance-=amount;
	}
}
