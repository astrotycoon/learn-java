public class Example {
	public static void main(String[] args) {
		Rect rect = new Rect();
		double w = 12.76;
		double h = 25.28;

		rect.setWidth(w);
		rect.setHeight(h);
		
		System.out.println("矩形对象的宽："+ rect.getWidth() +" 高"+ rect.getHeight());
		System.out.println("矩形的面积："+ rect.getArea());

		System.out.println("更改向对象的方法参数传值的w，h变量的值为100和256");
		w = 100;
		h = 256;
		//rect.setWidth(w);
		//rect.setHeight(h);
		System.out.println("矩形对象的宽："+ rect.getWidth() +" 高"+ rect.getHeight());
		System.out.println("矩形的面积："+ rect.getArea());
	}
}
