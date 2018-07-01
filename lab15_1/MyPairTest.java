/*
 * �ۼ���: ������
 * �ۼ���: 2018.06.07.
 * ���ϳ���: MyPair ��ü�� �����ϰ� �̿��ϴ� ���α׷�
 */

package lab15_1;

public class MyPairTest {

	public static void main(String[] args) {
		System.out.println("lab15_1: ������\n");

		// ���ڿ��� ��/�� ���ҷ� ���� MyPair ��ü pair�� ����
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");

		String master = pair.getMaster();  // �� ���Ҹ� ������ ���� �� ���
		System.out.println(master + "��");

		System.out.println(pair);  // pair�� ���

		pair.swap();  // pair�� ��/�� ���Ҹ� ��ȯ

		System.out.println(pair);  // pair�� ���
		System.out.println();
		
		
		// �л�(Student) ��ü�� �� �� ����
		Student s1 = new Student("kim"); 
		Student s2 = new Student("park");
		
		MyPair<Student> stuentPair = new MyPair<Student>(s1,s2);
		// �� �� Student ��ü�� ��/�� ���ҷ� ���� MyPair ��ü studentPair�� ����
		
		System.out.println(stuentPair);  // studentPair�� ���
		
		stuentPair.swap();  // studentPair�� ��/�� ���Ҹ� ��ȯ
		
		System.out.println(stuentPair);  // studentPair�� ���
		System.out.println();
		
		// ����(Integer) ��ü �� �� ����
		Integer i1 = new Integer(11);
		Integer i2 = new Integer(22);
		
		MyPair<Integer> integerPair = new MyPair<Integer>(i1,i2); // (11,22) autoBoxing
		// �� �� Integer ��ü�� ��/�� ���ҷ� ���� MyPair ��ü integerPair�� ����
		
		System.out.println(integerPair);  // integerPair�� ���
		
		integerPair.swap();  // integerPair�� ��/�� ���Ҹ� ��ȯ
		
		System.out.println(integerPair);  // integerPair�� ���

	}
}


// String�� ��/�� ���Ҹ� �����ϴ� Ŭ����
class MyPair<T> {
	private T master; // �� ����
	private T slave; // �� ����

	public MyPair(T master, T slave) { // ������
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  ��/�� ���Ҹ� ��ȯ�ϴ� �޼ҵ�
		T temp = master;
		master = slave;
		slave = temp;
	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "��=" + master + " ��=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}