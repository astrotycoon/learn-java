public class example {
	public static void main(String[] args) {
		rect rectangle;
		rectangle = new rect();
		rectangle.width = 1.819;
		rectangle.height = 1.5;
		double area = rectangle.getArea();
		System.out.printf("矩形的面积:"+ area);
	}
}

class rect {
	double width;
	double height;
	double getArea() {
		return width * height;
	}
}
