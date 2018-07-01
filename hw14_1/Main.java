/*
 * 작성자: 정은애
 * 작성일: 2018.06.08.
 * 파일내용: 자동차 가속
 */

package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallExcepteion {
		System.out.println("hw14_1: 정은애 \n");

		Car myCar = new Car(50);  // 속도가 50인 자동차 생성하여 자동차 정보 출력
		System.out.println(myCar);

		try {
			Scanner scan = new Scanner(System.in);  // 가속량을 입력받아 자동차 가속
			System.out.print("\n가속량 입력: ");
			int value = scan.nextInt();

			myCar.speedUp(value);

		} catch (SpeedUpException e) {
			System.out.println("최대 속도 초과로 가속 불가능하여 자동차를 멈춥니다.");
			myCar.stop();

		} catch (InputMismatchException e) {
			System.out.println("가속량 입력 오류로 가속 불가능합니다.");

		} finally {
			System.out.println(myCar);  // 자동차 정보 출력
		}
	}
}

class SpeedUpException extends Exception {}  //최대속도 초과

class TooSmallExcepteion extends Exception {  // 가속량  기준 미달
	public TooSmallExcepteion(int value) {
		super("기준 미달 "+value);
	}
}

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallExcepteion {  // 가속
		if(speed+value > MAX_SPEED)  // 최대속도 초과
			throw new SpeedUpException();
		else if(value<=0)  // 가속량 0 이하
			throw new TooSmallExcepteion(value);
		speed += value;
	}

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}