package lab6_2;

public class Circle {
	private double r;  // ������(�Ǽ���)

	// �Ű����� ���� �������� 1.0���� �ʱ�ȭ�ϴ� constructor
	public Circle() {
		r=1.0;
	}

	// �������� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor
	public Circle(double r) {
		this.r=r;
	}

	// ������ getter
	public double getR() {
		return r;
	}

	// ������ setter
	public void setR(double r) {
		this.r=r;
	}

	// ������� �޼ҵ� - �Ű����� ����
	public double area() {
		return r*r*3.14;
	}
}
