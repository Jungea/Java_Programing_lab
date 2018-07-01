package lab14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: ������");
		Scanner scan = new Scanner(System.in);

		int x, y, result;

		try {
			System.out.print("���� x �Է�: ");
			x = scan.nextInt();
			System.out.print("���� y �Է�: ");
			y = scan.nextInt();

			result = x / y;

		} catch(ArithmeticException e) {  // 0���� ����
			result = 0;
			
		} catch(InputMismatchException e) {  // ���� �Է�
			result = 1;
		}
		
		System.out.println("result = " + result);
	}
}