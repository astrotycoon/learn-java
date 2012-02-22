public class Example {
	public static void main(String args[]) {
		Circle circle = new Circle(10);
		System.out.println("main方法中circle的引用: "+ circle);
		System.out.println("main方法中circle的半径"+ circle.getRadius());

		Circular circular = new Circular(circle, 20);
		System.out.println("circular圆锥的bottom的引用: "+ circular.bottom); 	//因该与circle在main中的引用一样
		System.out.println("圆锥的bottom的半径: "+ circular.getBottomRadius());	//circular.getBottomRadius() == circle.getRadius()
		System.out.println("圆锥的体积: "+ circular.getVolme());

		double r = 8888;
		System.out.println("圆锥更改底圆bottom的半径: "+ r);
		circular.setBottomRadius(r);
		
		
	}
}
