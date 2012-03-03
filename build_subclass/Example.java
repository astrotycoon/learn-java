public class Example {
	public static void main(String[] args) {
		B b =new B();

		b.setX(888);	//x尽管是A类私有的，但方法setX是共有的，所以继承这个方法，所以通过这个方法能操作x
		System.out.println("子类对象为继承的x的值是: "+b.getX());

		b.y = 12.678;
		System.out.println("子类对象的实例变量y的值是: "+ b.getY());
	}
}
