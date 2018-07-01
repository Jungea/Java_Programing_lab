package hw7_1;

public class NormalAccount extends BankAccount {

	// 계좌번호와 잔액을 매개변수로 받아 초기화하는 생성자
	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	// 계좌번호를 매개변수로 받아 초기화하는 생성자 - 잔액은 0으로 초기화
	public NormalAccount(int id) {
		super(id, 0);
	}

	// 출금 메소드 오버라이드 - 잔액부족시 출금 수행하지 않고 오류메시지 출력
	@Override
	public void withdraw(int amount) { // 출금
		if(getBalance()<amount)
			System.out.println("계좌 " + id + ": 잔액 부족으로 출금 실패");

		else {
			super.withdraw(amount);
		}
	}
}
