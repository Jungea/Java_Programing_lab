/*
 * 작성자: 정은애
 * 작성일: 2018. 03. 25.
 * 내용: 하한과 상한 범위내의 각 연령의 학생수
 */

package hw4_1;

import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("hw4_1: 정은애 \n");

		// 하한, 상한, 학생 수 입력 받음
		System.out.print("나이 하한 입력: ");
		int minimum = input.nextInt();  // 하한
		System.out.print("나이 상한 입력: ");
		int maximum = input.nextInt();  // 상한
		System.out.print("학생 수 입력: ");
		int studentNum = input.nextInt();  // 학생 수 
		System.out.println("");
		
		int[] age = new int[studentNum];  // 나이
		int[] ageNum = new int[maximum-minimum+1];  // 나이 별 학생 수
		
		for(int i=0 ; i< studentNum ; i++) {  // 학생 수 만큼 나이 입력
			while (true){
				System.out.print("나이 입력: ");
				age[i]= input.nextInt();
				
				if(maximum>=age[i] && age[i]>=minimum)
					break;
				
				System.out.println("범위를 벗어났습니다. 다시 입력하세요");
			}
			
			ageNum[age[i]-minimum]++;  // 나이 별 학생 수 증가
		}

		// 나이별 학생 수 출력
		System.out.println("\n나이 학생수");
		for(int i=0 ; i<maximum-minimum+1 ; i++ )
			System.out.println(i+minimum +" "+ ageNum[i]);
	}
}