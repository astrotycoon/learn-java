public class Rect {	//创建矩形的类
	double width;
	double height;
	double area;

	void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		}
	}

	void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		}
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double getArea() {
		area = width * height;
		return area;
	}
}
