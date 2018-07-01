package hw7_1;

public class MinusAccount extends BankAccount {
	private int limit;  // 대출한도(잔액의 마이너스 한도)

	// 계좌번호, 잔액, 대출한도를 매개변수로 받아 초기화하는 생성자
	public MinusAccount(int id, int balance, int limit) {
		super(id, balance);
		this.limit = limit;
	}

	// 계좌번호, 대출한도를 매개변수로 받아 초기화하는 생성자 - 잔액은 0으로 초기화
	public MinusAccount(int id, int limit) {
		super(id);
		this.limit = limit;
	}

	// 출금 메소드 오버라이드 - 대출한도 초과시 출금 수행하지 않고 오류메시지 출력
	@Override
	public void withdraw(int amount) { // 출금
		if(getBalance()+limit<amount) 
			System.out.println("계좌 " + id + ": 잔액 부족으로 출금 실패");
		else
			super.withdraw(amount);
	}

	// 대출한도 getter
	public int getLimit() {
		return limit;
	}
}
