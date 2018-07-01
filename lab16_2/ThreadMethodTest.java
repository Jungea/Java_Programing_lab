/*
 * �ۼ���: ������
 * �ۼ���: 2018.06.19.
 * ����: Thread Ŭ���� �޼ҵ�
 */

package lab16_2;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run(){
		for(int i = 0; i < 5; i++) {
			// (1) 500 �и��� ���� �����ٰ� ����ϵ��� �̰��� �ڵ带 �߰��ϼ���.   

			try {
				sleep(500);  //Thread �̱� ������ Thread.�ʿ����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(getName() + i + " ");
		}
	}
}
public class ThreadMethodTest {
	public static void main(String[] args) throws InterruptedException {  //sleep�� join�κп��� interruptedException�� �߻��Ѵ�.
		System.out.println("lab16_2: ������");
		System.out.print("\n�������.");

		// �� ���� ������ t1, t2�� �����Ͽ� ����
		Thread t1 = new MyThread("A");    // ������ �̸��� "A"�� ����
		Thread t2 = new MyThread("b");    // ������ �̸��� "b"�� ����
		t1.start();
		t2.start();

		// (2) Ȱ�� ���� ������ ���� ����ϵ��� �Ʒ� ������ �����ϼ���.
		System.out.println("\nȰ������ ������ �� = "+Thread.activeCount());

		for(int i = 0; i < 5; i++) {
			// (3) 0~999 �и��� ���� �����ٰ� ����ϵ��� �̰��� �ڵ带 �߰��ϼ���.
			Thread.sleep((long)(Math.random()*1000));
			System.out.print(Thread.currentThread().getName() + i + " ");
		}

		// (4) t1, t2�� ��� ������ �Ŀ� �ȳ��������� �� ����ϵ��� �̰��� �ڵ带 �߰��ϼ���.
		t1.join();
		t2.join();
		System.out.println("\n�ȳ���������.");
	}
}