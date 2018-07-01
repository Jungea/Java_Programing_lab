/*
 * 작성자: 정은애
 * 작성일: 2018.04.12.
 * 파일 내용: 회원 프로그램 
 */

package hw5_1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw5_1: 정은애 \n");

		// (1) 회원 5명을 생성 - 회원 배열을 사용할 것
		Member[] m = new Member[5];
		for(int i=0; i<5; i++) 
			m[i] = new Member();

		// (2) 회원 5명의 등급을 1, 2, 3, 4, 5로 지정 
		for(int i=0; i<5; i++) 
			m[i].rate(i+1);

		// (3) 회원 5명에게 포인트 지급 
		for(int i=0; i<5; i++) 
			m[i].pointPayment();

		// (4) 회원 5명에게 포인트 지급 
		for(int i=0; i<5; i++) 
			m[i].pointPayment();

		// (5) 회원 5명의 할인률을 조회하여 출력
		for(int i=0; i<5; i++) 
			System.out.println("회원"+(i+1)+" 할인률 : "+m[i].discountRate());
	}

}
