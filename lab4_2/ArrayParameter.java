/*
 * 작성자: 정은애
 * 작성일: 2018. 03. 27.
 * 파일내용: 배열 원소의 합
 */

package lab4_2;

import java.util.Scanner;

public class ArrayParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab4_2: 정은애");
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수의 개수 입력: ");
		int num = input.nextInt();
		
		System.out.print(num+"개의 정수 입력: ");
		int[] a = new int[num];
		for(int i=0; i<a.length; i++)
			a[i] = input.nextInt();
		
		int sum = sumArr(a);
		
		System.out.println("합 = "+sum);
	}
	private static int sumArr(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		
		return sum;
	}

}
