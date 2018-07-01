/*
 * 작성자: 정은애
 * 작성일: 2018.04.19.
 * 파일내용: 은행계좌 프로그램
 */

package hw6_2;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw6_2: 정은애 \n");

		Scanner scan = new Scanner(System.in);
		
		// (1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자)
		BankAccount account1 = new BankAccount(1, "kim", 9000);

		//(2) 계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
		BankAccount account2 = new BankAccount(2,"lee");
		
		//(3) 사용자로부터 입금액을 입력받아 account2에 입금
		System.out.print("입금액: ");
		int m = scan.nextInt();
		account2.deposit(m);
		
		//(4) 사용자로부터 출금액을 입력받아 account2에서 출금
		System.out.print("출금액: ");
		m = scan.nextInt();
		account2.withdraw(m);
		
		//(5) 사용자로부터 입금액을 입력받아 account2에 입금
		System.out.print("입금액: ");
		m = scan.nextInt();
		account2.deposit(m);
		
		//(6) 사용자로부터 출금액을 입력받아 account2에서 출금
		System.out.print("출금액: ");
		m = scan.nextInt();
		account2.withdraw(m);
		
		//(7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.print("송금액: ");
		m = scan.nextInt();
		account2.transfer(account1, m);
		
		//(8) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.print("송금액: ");
		m = scan.nextInt();
		account2.transfer(account1, m);
		
		//(9) account2의 예금주명을 park으로 수정
		account2.setName("park");
		
		//(10) account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println("account2 = "+account2.toString());
		
		//(11) account1의 계좌번호, 예금주명, 잔액 출력
		System.out.println("account1 = "+account1.toString());
	}

}
