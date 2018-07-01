package lab7_4;

public class Circle {

	private double radius;  // 반지름
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "반지름 = "+radius;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Circle) 
//			return radius == ((Circle)obj).radius;
//		else
//			return false;
//		
//		// Circle other = (Circle)obj;
//	}
}
