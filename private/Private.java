
/*
	对于私有成员变量和方法，只有在本类中创建该类的对象，这个对象才可以
	访问自己的私有成员变量和方法
*/
public class Private {
	public static void main(String args[]) {
		Student zhang = new Student();
		Student geng = new Student();

		zhang.setAge(10);
		System.out.println("zhang的年龄："+ zhang.getAge());

		geng.setAge(20);
		System.out.println("geng的年龄： "+ geng.getAge());

		//zhang.age = 10;或geng.age =20;都是非法的，因为zhang和geng
		//已经不在Student类中
//		zhang.age = 100;
	}	

}
