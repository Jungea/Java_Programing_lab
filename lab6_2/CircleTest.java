/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.17.
 * ���ϳ���: �� ���α׷�
 */

package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab6_2: ������ \n");

		Circle c1 = new Circle();  // (1) �� ����(c1)
		Circle c2 = new Circle(2.5);  // (2) �������� 2.5�� �� ����(c2)

		// (3) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println("c1�� ������ = "+c1.getR());
		System.out.println("c2�� ������ = "+c2.getR());

		// (4) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c1�� ���� = "+c1.area());
		System.out.println("c2�� ���� = "+c2.area());

		// (5) c1�� �������� c2�� ������ ������ ����
		c2.setR(c1.getR());

		// (6) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println("c1�� ������ = "+c1.getR());
		System.out.println("c2�� ������ = "+c2.getR());

		// (7) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c1�� ���� = "+c1.area());
		System.out.println("c2�� ���� = "+c2.area());

		// (8) c2�� �������� 1.5�� ����
		c2.setR(1.5);

		// (9) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c1�� ���� = "+c1.area());
		System.out.println("c2�� ���� = "+c2.area());
	}

}
