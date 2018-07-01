package lab6_4;

public class BankAccount {

	private int num;  // ���¹�ȣ
	private int balance;  // �ܾ�
	private static int numbers = 0;  // ���¼�
	public static final int MIN = 100;  // ��� �ּ� ����

	public BankAccount() {
		numbers++;
		num=numbers;
		balance = 0;
	}

	@Override
	public String toString() {  //  toString() - ���¹�ȣ, �ܾ��� ���ڿ��� ����
		return "BankAccount [num=" + num + ", balance=" + balance + "]";
	}

	// ���¼� ��ȸ - ���� �޼ҵ�μ�, �Ű������� ����, ���¼��� ����
	public static int getNumbers() {
		return numbers;
	}
}