package lab7_4;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_4: ������ \n");
		
		// �������� 1.5�� �� c1, c2 ����
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5);
		
		// toString() ȣ���Ͽ� ���
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		// ==�� ���� ��� ���
		System.out.println(c1 == c2);
		
		// equals()�� ���� ��� ���
		System.out.println(c1.equals(c2));
	}

}
