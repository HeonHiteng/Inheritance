
public class Triangle extends GeometricObject {
	public double side1,side2,side3 = 1.0;
	
	public Triangle(){
	}
	
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public double getArea() {
		return (side1 + side2 + side3) / 2;
	}
	
	public double getPerimeter(double side1,double side2,double side3) {
		double area = 0;
		double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				 " side3 = " + side3;
	}
}
