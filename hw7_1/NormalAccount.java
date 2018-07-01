package hw7_1;

public class NormalAccount extends BankAccount {

	// ���¹�ȣ�� �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	// ���¹�ȣ�� �Ű������� �޾� �ʱ�ȭ�ϴ� ������ - �ܾ��� 0���� �ʱ�ȭ
	public NormalAccount(int id) {
		super(id, 0);
	}

	// ��� �޼ҵ� �������̵� - �ܾ׺����� ��� �������� �ʰ� �����޽��� ���
	@Override
	public void withdraw(int amount) { // ���
		if(getBalance()<amount)
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");

		else {
			super.withdraw(amount);
		}
	}
}
