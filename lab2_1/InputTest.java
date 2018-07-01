package lab2_1;

/*
 * 파일명: InputTest.java
 * 작성일: 2018.3.15
 * 작성자: 정은애
 * 내용:  Scanner 클래스를 이용한 입력을 연습하는 프로그램
 */

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab2_1: 정은애\n");

		// Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		Scanner input = new Scanner(System.in);

		// 도시명, 인구, 평균 기온을 입력받음
		System.out.print("도시명 입력: ");
		String city = input.nextLine();

		System.out.print("인구 입력(단위는 만명): ");
		int population = input.nextInt();

		System.out.print("평균 기온 입력: ");
		double averageDegree = input.nextDouble();

		// 도시명, 인구, 평균 기온 출력
		System.out.println("\n도시명 = " + city);
		System.out.println("인구 = " + population +"만");
		System.out.println("평균 기온 = " + averageDegree);
	}

}
