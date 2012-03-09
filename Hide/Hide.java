public class Hide {
	public static void main (String args[]) {
		Student stu = new Student();
		stu.x = 100;
//		stu.x = 100.0; //错误，这里x是int型的
		stu.setIntX(1000);
//		stu.setIntX(100.0);//错误，这里参数应是int型的
		
		System.out.println("对象stu的x的值是: "+ stu.getIntX());

		stu.setDoubleX(1000.0);	//子类调用继承的方法操作隐藏的变量x
		double m = stu.getDoubleX();//子类调用继承的方法操作隐藏的变量x
		System.out.println("对象隐藏的x的值是: "+ m);

	}
}

class People {
	public double x;

	public void setDoubleX(double x) {
		this.x = x;
	}

	public double getDoubleX() {
		return x;
	}
}

class Student extends People {
	int x;		//x与People类中的x同名，隐藏People类中的x

	public void setIntX(int x) {
	//	this.x = 2.0; 错误，因为这里的x是Student类的x，是int型的
		this.x = x;
	}

	public int getIntX() {
		return x;
	}
}
