/*
 * �ۼ���: ������
 * �ۼ���: 2018.06.08.
 * ���ϳ���: �ڵ��� ����
 */

package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallExcepteion {
		System.out.println("hw14_1: ������ \n");

		Car myCar = new Car(50);  // �ӵ��� 50�� �ڵ��� �����Ͽ� �ڵ��� ���� ���
		System.out.println(myCar);

		try {
			Scanner scan = new Scanner(System.in);  // ���ӷ��� �Է¹޾� �ڵ��� ����
			System.out.print("\n���ӷ� �Է�: ");
			int value = scan.nextInt();

			myCar.speedUp(value);

		} catch (SpeedUpException e) {
			System.out.println("�ִ� �ӵ� �ʰ��� ���� �Ұ����Ͽ� �ڵ����� ����ϴ�.");
			myCar.stop();

		} catch (InputMismatchException e) {
			System.out.println("���ӷ� �Է� ������ ���� �Ұ����մϴ�.");

		} finally {
			System.out.println(myCar);  // �ڵ��� ���� ���
		}
	}
}

class SpeedUpException extends Exception {}  //�ִ�ӵ� �ʰ�

class TooSmallExcepteion extends Exception {  // ���ӷ�  ���� �̴�
	public TooSmallExcepteion(int value) {
		super("���� �̴� "+value);
	}
}

class Car {
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallExcepteion {  // ����
		if(speed+value > MAX_SPEED)  // �ִ�ӵ� �ʰ�
			throw new SpeedUpException();
		else if(value<=0)  // ���ӷ� 0 ����
			throw new TooSmallExcepteion(value);
		speed += value;
	}

	public void speedDown(int value) {  // ����
		speed -= value;
	}

	public void stop() { // ����
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}