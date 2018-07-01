/*
 * 작성자: 정은애
 * 작성일: 2018. 3. 16.
 * 파일 내용 설명: 달러 환전
 */

package hw2_1;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw2_1: 정은애\n");

		// Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		Scanner input = new Scanner(System.in);

		// 500원 갯수, 100원 갯수, 50원 갯수, 10원 갯수  입력받음
		System.out.print("500원 갯수 입력: ");
		int fiveHundredWon = input.nextInt();

		System.out.print("100원 갯수 입력: ");
		int oneHundredWon = input.nextInt();

		System.out.print("50원 갯수 입력: ");
		int fiftyWon = input.nextInt();

		System.out.print("10원 갯수 입력: ");
		int tenWon = input.nextInt();

		// 환율을 상수로 선언
		final int EXCHANGE_RATE = 1060;

		// 저금 총액을 계산
		int total = 500*fiveHundredWon + 100*oneHundredWon + 50*fiftyWon + 10*tenWon;

		// 저금 총액, 달러 액수, 남은 한화를 출력
		System.out.println("\n저금 총액 = " + total);

		int dallar = (int)(total/EXCHANGE_RATE);
		System.out.println("달러 액수 =  " + dallar);

		System.out.println("남은 한화 = " + (total-(dallar*EXCHANGE_RATE)));
	}

}
