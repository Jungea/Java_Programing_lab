/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.05.
 * ���� ����: x��ǥ�� ���� 1���� �� ����, �̿�
 */

package lab5_4;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_4: ������ \n");

		Point p1 = new Point();
		Point p2 = new Point();
		// (5) Point ��ü p1, p2�� ����

		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);
		// (6) p1�� 4.5  ��ŭ �̵�, p2�� -1.0��ŭ �̵�, p1�� 1.0��ŭ �ٽ� �� �� �̵�

		p1.move();  // (7) p1�� �̵�(�Ű����� ����) ********

		// p1, p2�� �Ӽ��� ���
		System.out.println(p1.toString()); // p1.toString() ��� p1 ��� ��� ��
		System.out.println(p2.toString()); // p2.toString() ��� p2 ��� ��� ��

		// (8) p1�� p2�� �Ÿ��� ��� *******
		System.out.println("p1�� p2�� �Ÿ� ��� = "+p1.distance(p2));
		System.out.println("p2�� p1�� �Ÿ� ��� = "+p2.distance(p1));
	}

}
