/*
 * 작성자: 정은애
 * 작성일: 2018. 3. 25.
 * 내용: 곱셈문제, 시험결과, 통과여부 확인
 */

package hw3_1;

import java.util.Scanner;
import java.util.Random;

public class MultiplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정

		System.out.println("hw3_1: 정은애 \n");
		System.out.println("곱셈 문제의 답을 입력하세요(통과하려면 0을 입력)\n");
		Random generator = new Random();

		int rightAnswer = 0;  // 정답 수
		int wrongAnswer = 0;  // 오답 수

		for(int i=0;i<5; i++) {
			int x = generator.nextInt(9)+1;  //1~9까지 랜덤
			int y = generator.nextInt(9)+1;  //1~9까지 랜덤

			System.out.print(x +" * "+ y+" = ");
			int answer = input.nextInt();  // 사용자의 입력
			if(answer==0)  // 통과
				System.out.println("통과 \n");
			else if(answer==x*y) {  // 정답
				System.out.println("정답입니다. \n");
				rightAnswer++;
			}
			else {  //오답
				System.out.println("틀렸습니다. \n");
				wrongAnswer++;
			}
		}

		int result = rightAnswer*20+wrongAnswer*(-10);  //총점 계산
		if(result<0)  // 총점이 음수일 경우
			result=0;

		String s =( (result>=50)? "합격" : "불합격" );  // 통과 여부 확인

		System.out.println("정답수 "+rightAnswer+" 오답수 "+wrongAnswer+ " 총점 "+result+" --> "+s);
	}

}
