package hw6_2;

public class BankAccount {
	private int account;  // 계좌번호
	private String name; // 예금주명
	private int money; // 잔액

	// 계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor
	public BankAccount(int account, String name, int money) {
		this.account=account;
		this.name=name;
		if(money<0) this.money=0;
		else this.money=money;

	}

	// 계좌번호, 예금주명을 매개변수로 바아 쵝화하는 constructor - 위의 constructor를 호출
	public BankAccount(int account, String name) {
		this(account, name, 0);
	}

	public int getAccount() {  // 계좌번호 getter
		return account;
	}

	public String getName() {  // 예금주명 getter
		return name;
	}

	public void setName(String name) {  // 예금주명 setter
		this.name=name;
	}

	public int getMoney() {  // 잔액 getter
		return money;
	}

	public void deposit(int m) {  // 입금
		money+=m;
	}

	public void withdraw(int m) {  // 출금(잔액 부족시 오류 메시지 출력)
		if((money-m) < 0) System.out.println("잔액이 부족합니다.");
		else money-=m;
	}

	@Override
	public String toString() {
		return "[account=" + account + ", name=" + name + ", money=" + money + "]";
	}

	public void transfer(BankAccount b, int m) {  // 송금
		if((money-m)<0) System.out.println("잔액이 부족합니다.");
		else {
			money-=m;
			b.money+=m;
		}
	}
}
