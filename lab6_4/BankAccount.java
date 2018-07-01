package lab6_4;

public class BankAccount {

	private int num;  // 계좌번호
	private int balance;  // 잔액
	private static int numbers = 0;  // 계좌수
	public static final int MIN = 100;  // 출금 최소 단위

	public BankAccount() {
		numbers++;
		num=numbers;
		balance = 0;
	}

	@Override
	public String toString() {  //  toString() - 계좌번호, 잔액을 문자열로 리턴
		return "BankAccount [num=" + num + ", balance=" + balance + "]";
	}

	// 계좌수 조회 - 정적 메소드로서, 매개변수는 없고, 계좌수를 리턴
	public static int getNumbers() {
		return numbers;
	}
}