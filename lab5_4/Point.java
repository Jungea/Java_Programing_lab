/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.05.
 * ���� ����: x��ǥ�� ���� 1���� �� ����, �̿�
 */

package lab5_4;

public class Point {
	double x;  // (1) �ʵ�: double�� x ��ǥ

	// (2) move() �޼ҵ� : double�� �Ű������� �� ����ŭ x ��ǥ�� �̵�
	void move(double a) {
		x+=a;
	}

	// (3) move() �޼ҵ� : �Ű������� ���� �ʰ� x��ǥ�� 1��ŭ �̵� *******
	void move() {
		x++;
	}

	// toString() �޼ҵ�: Point�� �Ӽ��� ���ڿ��� ����� ���� - @Override, public�� 6, 7�忡�� ���
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}

	// (4) distance() �޼ҵ� : Point�� �Ű������� �޾�, �Ű������� ���� ���� ���� ���� �Ÿ��� ���Ͽ� ���� *******
	double distance(Point p) {
		return (x>p.x) ? x-p.x: p.x-x;
	}
}
