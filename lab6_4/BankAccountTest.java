/*
 * 작성자: 정은애
 * 작성일: 2018.04.24.
 * 파일내용: 은행계좌 프로그램
 */

package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_4: 정은애 \n");

		// (1) BankAccount 클래스의 계좌수를 조회하여 출력 --> 0이 출력될 것임
		System.out.println("계좌수 : "+BankAccount.getNumbers());

		// (2) BankAccount 클래스의 출금 최소단위 출력
		System.out.println("출금 최소단위 : "+BankAccount.MIN);

		// (3) 은행계좌 객체 2개 생성(account1, account2 라고 하자)
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		// (4) BankAccount 클래스의 계좌수를 조회하여 출력 --> 2가 출력될 것임
		System.out.println("계좌수 : "+BankAccount.getNumbers());

		// (5) account1, account2의 정보를 출력(toString() 호출)
		System.out.println("account1 = "+account1.toString());
		System.out.println("account1 = "+account2.toString());
	}

}
