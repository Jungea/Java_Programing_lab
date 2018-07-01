package mid1_3;

public class Account {

	private int id;   // ���̵�
	private int balance;  // �ܾ�
	private static int number = 0; // ���¼�
	public static final int FEE = 500;  // �۱ݼ�����

	// (3) ���̵�� ���»��������� 1, 2, 3, ... �� �ڵ� �ο��ϰ�
	//     �ܾ��� �Ű������� ���� ������ �ʱ�ȭ�ϴ� ������
	public Account(int balance) {
		id = ++number;
		this.balance = balance;
	}

	// (4) getNumber()-������ ���¼��� �����ϴ� static �޼ҵ�
	public static int getNumber() {
		return number;
	}

	// (5) transfer() - ���� ���¿��� ��� ���� other�� amount
	//    ��ŭ�� �۱��ϴ� �޼ҵ�
	// -�۱ݼ����� �ΰ�(�۱ݼ������ ������ ������ ��� �̿�)
	// -�ܾ� ������ �۱��� �� ������,
	// -�۱� ���� ����(true/false)�� ����
	// -�� �޼ҵ忡�� ��¹� ����
	public boolean transfer(Account other, int amount) {
		if(balance < amount+FEE)
			return false;
		else {
			balance -= (amount+FEE);
			other.balance += amount;
			return true;
		}
	}

	@Override
	public String toString() {
		return "id=" + id + ", balance=" + balance;
	}
}