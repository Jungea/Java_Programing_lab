/*
 * 작성자: 정은애
 * 작성일: 2018.04.04.
 * 내용: 은행계좌 프로그램 작성
 */

package lab5_3;

public class BankAccount {  // 은행계좌를 나타내는 클래스
	int ballance;  // 잔액
	
	void deposit(int amount) {  // 입금
		ballance+=amount;
	}
	int getBalance() {  // 잔액조회
		return ballance;
	}
	void withdraw(int amount) {  // 출금
		ballance-=amount;
	}
}
