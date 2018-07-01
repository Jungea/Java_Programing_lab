package mid1_1;

public class PiggyBank {

	// (1) 2���� private �ʵ� :
	//    500�� ����(������)�� 100�� ����(������)
	private int five;
	private int one;

	// (2) 500�� ����, 100�� ������ �Ű������� �޾�
	//    �ʱ�ȭ �ϴ� ������
	public PiggyBank(int five, int one) {
		this.five = five;
		this.one = one;
	}

	// (3) add() - 500�� ����, 100�� ������ �Ű������� �޾�
	//     �����ϴ� �޼ҵ�
	public void add(int five, int one) {
		this.five += five;
		this.one += one;
	}

	// (4) open() -������������ ���� ���ݾ��� �����ϴ� �޼ҵ�
	//     �������� ���� ���� ���� ������ ��� 0�� �ȴ�.
	public int open() {
		int result = five*500 + one*100;
		five = 0;
		one = 0;
		return result;
	}
}