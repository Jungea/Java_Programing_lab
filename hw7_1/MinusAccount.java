package hw7_1;

public class MinusAccount extends BankAccount {
	private int limit;  // �����ѵ�(�ܾ��� ���̳ʽ� �ѵ�)

	// ���¹�ȣ, �ܾ�, �����ѵ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public MinusAccount(int id, int balance, int limit) {
		super(id, balance);
		this.limit = limit;
	}

	// ���¹�ȣ, �����ѵ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������ - �ܾ��� 0���� �ʱ�ȭ
	public MinusAccount(int id, int limit) {
		super(id);
		this.limit = limit;
	}

	// ��� �޼ҵ� �������̵� - �����ѵ� �ʰ��� ��� �������� �ʰ� �����޽��� ���
	@Override
	public void withdraw(int amount) { // ���
		if(getBalance()+limit<amount) 
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");
		else
			super.withdraw(amount);
	}

	// �����ѵ� getter
	public int getLimit() {
		return limit;
	}
}
