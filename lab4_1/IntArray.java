/*
 * 작성자: 정은애
 * 작성일: 2018. 3. 22.
 * 파일 내용 설명: 정수 배열
 */

package lab4_1;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab4_1: 정은애 \n");

		// Scanner형 변수 scan에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		Scanner scan = new Scanner(System.in);

		// 배열의 길이 입력 받음
		System.out.print("배열 길이 입력: ");
		int size = scan.nextInt();

		// 사용자로부터 size 개의 정수값을 입력받아 배열에 저장
		System.out.printf("%d개의 정수 입력: ", size);
		int[] intArr = new int[size];
		for(int i=0; i<size; i++) 
			intArr[i] = scan.nextInt();

		// 배열의 원소를 순서대로 모두 출력(2번)
		for(int i=0; i<2; i++) {
			System.out.print("배열 = ");

			for(int j=0; j<size; j++) 
				System.out.print(intArr[j]+" ");

			System.out.print("\n");
		}	
	}

}
