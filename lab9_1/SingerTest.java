/*
 * �ۼ���: ������
 * �ۼ���: 2018.05.24.
 * ���ϳ���: �������̽�
 */

package lab9_1;

//Singer �������̽�
interface Singer {
	void sing(); // �뷡��
}

// Singer�� ������ Person Ŭ����
class Person implements Singer {
	public void sing() {
		System.out.println("�������ļֶ�õ�");
	}
}

// Singer�� ������ Dog Ŭ���� - �۸� �̶�� �뷡��
class Dog implements Singer {
	public void sing() {
		System.out.println("�۸�");
	}
}

// MicSystem Ŭ����
class MicSystem {
	// Singer�� �Ű������� �޾� ����ũ �׽�Ʈ �ϴ� �޼ҵ�
	public void micTest(Singer singer) {
		System.out.println("����ũ �׽�Ʈ. �뷡 �����մϴ�.");
		singer.sing();
	}
}

// Singer �������̽��� �׽�Ʈ�ϴ� Ŭ����
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_1: ������ \n");

		// ����ũ �ý��� ��ü�� ����
		MicSystem mic = new MicSystem();

		// Person ��ü�� �����Ͽ� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(new Person());
		// Dog ��ü�� �����Ͽ� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(new Dog());
		// �߿� �̶�� �뷡�ϴ� ��ü�� �����Ͽ� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(new Singer() {
			@Override
			public void sing() {
				System.out.println("�߿�");
			}
		});
		// �߾�߾��̶�� �뷡�ϴ� �޼ҵ带 ���ٽ����� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(() -> System.out.println("�߾���"));
	}
}
