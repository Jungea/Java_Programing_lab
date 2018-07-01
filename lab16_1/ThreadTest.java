/*
 * 작성자: 정은애
 * 작성일: 2018.06.14.
 * 내용: Thread*/

package lab16_1;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("lab16_1: 정은애 \n");
		Thread t1 = new Thread(new MyClass());
		t1.start();
		
		for(int i = 21; i <= 30; i++)
			System.out.print(i + " ");
	}
}

class MyClass implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
			System.out.print(i + " ");

	}
}

/* 람다식 사용
 * System.out.println("lab16_1: 정은애 \n");
		Thread t1 = new Thread(() -> {
		for(int i = 1; i <= 10; i++)
			System.out.print(i + " ");

	});
 */