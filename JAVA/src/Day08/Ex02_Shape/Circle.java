package Day08.Ex02_Shape;

public class Circle extends Shape {
	
	double radius;

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	double area() {
		// (원주율) * (반지름) * (반지름)
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// (원주율) * (반지름) * 2
		return Math.PI * radius * 2;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

}
