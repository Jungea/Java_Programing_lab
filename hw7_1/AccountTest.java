package hw7_1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: 정은애 \n");

		Scanner scan = new Scanner(System.in);

		// (1) 다음과 같은 4개의 계좌 생성
		NormalAccount acc1 = new NormalAccount(11, 1000);  // 일반 계좌(계좌번호 11, 잔액 1000로 초기화)
		NormalAccount acc2 = new NormalAccount(22);  // 일반 계좌(계좌번호 22로 초기화)
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);  // 마이너스통장 계좌(계좌번호 33, 잔액 1000, 대출한도 500로 초기화)
		MinusAccount acc4 = new MinusAccount(44, 500);  // 마이너스통장 계좌(계좌번호 44, 대출한도 500로 초기화)

		//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금가능액");
		System.out.println("acc1 = "+acc1.getBalance());
		System.out.println("acc2 = "+acc2.getBalance());
		System.out.println("acc3 = "+(acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = "+(acc4.getBalance()+acc4.getLimit()));

		// (3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.print("\n출금액 입력: ");
		int a = scan.nextInt();
		acc1.withdraw(a);
		acc2.withdraw(a);
		acc3.withdraw(a);
		acc4.withdraw(a);

		// (4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("\n입금액 입력: ");
		a = scan.nextInt();
		acc1.deposit(a);
		acc2.deposit(a);
		acc3.deposit(a);
		acc4.deposit(a);

		// (5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("\n최대 출금가능액");
		System.out.println("acc1 = "+acc1.getBalance());
		System.out.println("acc2 = "+acc2.getBalance());
		System.out.println("acc3 = "+(acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = "+(acc4.getBalance()+acc4.getLimit()));
	}

}
