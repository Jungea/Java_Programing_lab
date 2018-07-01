package hw6_2;

public class BankAccount {
	private int account;  // ���¹�ȣ
	private String name; // �����ָ�
	private int money; // �ܾ�

	// ���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor
	public BankAccount(int account, String name, int money) {
		this.account=account;
		this.name=name;
		if(money<0) this.money=0;
		else this.money=money;

	}

	// ���¹�ȣ, �����ָ��� �Ű������� �پ� ��ȭ�ϴ� constructor - ���� constructor�� ȣ��
	public BankAccount(int account, String name) {
		this(account, name, 0);
	}

	public int getAccount() {  // ���¹�ȣ getter
		return account;
	}

	public String getName() {  // �����ָ� getter
		return name;
	}

	public void setName(String name) {  // �����ָ� setter
		this.name=name;
	}

	public int getMoney() {  // �ܾ� getter
		return money;
	}

	public void deposit(int m) {  // �Ա�
		money+=m;
	}

	public void withdraw(int m) {  // ���(�ܾ� ������ ���� �޽��� ���)
		if((money-m) < 0) System.out.println("�ܾ��� �����մϴ�.");
		else money-=m;
	}

	@Override
	public String toString() {
		return "[account=" + account + ", name=" + name + ", money=" + money + "]";
	}

	public void transfer(BankAccount b, int m) {  // �۱�
		if((money-m)<0) System.out.println("�ܾ��� �����մϴ�.");
		else {
			money-=m;
			b.money+=m;
		}
	}
}
