/*
 * 작성자: 정은애
 * 작성일: 2018.04.04.
 * 내용: 은행계좌 프로그램 작성
 */

package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_3: 정은애 \n");
		int b;

		BankAccount bank = new BankAccount();
		// 은행계좌 객체를 하나 생성

		bank.deposit(2000);  // 계좌에 2000원을 입금
		bank.deposit(3000);  // 계좌에 3000원을 입금
		System.out.println("잔액 = "+bank.ballance+"원");  // 계좌의 잔액 필드를 출력

		b=bank.getBalance();
		System.out.println("잔액 = "+b+"원");  // 잔액조회(getBalance()호출) 후 출력
		
		bank.withdraw(1000);  // 계좌에서 1000원을 출금
		
		b=bank.getBalance();
		System.out.println("잔액 = "+b+"원");  // 잔액조회(getBalance()호출) 후 출력
	}

}
