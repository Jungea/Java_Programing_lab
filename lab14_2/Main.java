package lab14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: 정은애");
		Scanner scan = new Scanner(System.in);

		int x, y, result;

		try {
			System.out.print("정수 x 입력: ");
			x = scan.nextInt();
			System.out.print("정수 y 입력: ");
			y = scan.nextInt();

			result = x / y;

		} catch(ArithmeticException e) {  // 0으로 나눔
			result = 0;
			
		} catch(InputMismatchException e) {  // 문자 입력
			result = 1;
		}
		
		System.out.println("result = " + result);
	}
}