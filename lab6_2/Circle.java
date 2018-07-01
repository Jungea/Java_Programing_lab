package lab6_2;

public class Circle {
	private double r;  // 반지름(실수형)

	// 매개변수 없이 반지름을 1.0으로 초기화하는 constructor
	public Circle() {
		r=1.0;
	}

	// 반지름을 매개변수로 받아 초기화하는 constructor
	public Circle(double r) {
		this.r=r;
	}

	// 반지름 getter
	public double getR() {
		return r;
	}

	// 반지름 setter
	public void setR(double r) {
		this.r=r;
	}

	// 면적계산 메소드 - 매개변수 없음
	public double area() {
		return r*r*3.14;
	}
}
