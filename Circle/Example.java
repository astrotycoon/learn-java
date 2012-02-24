public class Example {
	public static void main(String args[]) {
		Circle circle = new Circle(10);
		System.out.println("main方法中circle的引用: "+ circle);
		System.out.println("main方法中circle的半径"+ circle.getRadius());

		Circular circular = new Circular(circle, 20);
		System.out.println("circular圆锥的bottom的引用: "+ circular.bottom); 	//因该与circle在main中的引用一样
		System.out.println("圆锥的 bottom 的半径: "+ circular.getBottomRadius());	//circular.getBottomRadius() == circle.getRadius()
		System.out.println("圆锥的体积: "+ circular.getVolme());

		double r = 8888;
		System.out.println("圆锥更改底圆bottom的半径: "+ r);
		circular.setBottomRadius(r);
		System.out.println("圆锥的 bottom 的半径: "+ circular.getBottomRadius());
		System.out.println("圆锥的体积: "+ circular.getVolme());
		
		System.out.println("main方法中circle的半径: "+ circle.getRadius()); 	//8888
		System.out.println("main方法中circle的引用没有变化，但实体将发生变化");
		System.out.println("现在circle的引用为: "+ circle);

		circle = new Circle(100);
		System.out.println("现在main方法中circle的引用: "+ circle);
		System.out.println("main方法中circle的半径: "+ circle.getRadius());
		System.out.println("但是不影响circular圆锥的bottom的引用");
		System.out.println("circular圆锥的bottom的引用: "+ circular.bottom);
		System.out.println("圆锥的 bottom 的半径: "+ circular.getBottomRadius());
	}
}

/* 对于两个同类型的引用型变量，如果具有同样的引用，就会有相同的实体，因此，如果改动其中一个变量的实体，则另一个变量的实体也同样变化， 但如果改变一个变量的引用，并不改变另一个变量的应用 
   其实就是同个同类型的指针指向同一块内存空间，用其中随便一个指针都能改变内存空间的值，但改变一个指针的指向，并不影响另一个指针的指向，既依然指向原来的内存块
*/
