/*
	方法重写：返回类型、参数个数、参数类型一定要相同
	方法重载：返回类型与方法名不比较，但参数个数或参数类型一定要不同
*/
public class Override {
	public static void main(String args[]) {
		B b = new B();
		
		double result = b.f(10.0f, 20.0f);
		System.out.println("10 * 20 = "+ result);

	}
}

class A {
	double f(float x, float y) {
		return x+y;
	}

	public int g(int x, int g) {
		return x+g;
	}
}

class B extends A {
	double f(float x, float y)	//方法重写
	{
		return x * y;
	}

	float f(int x, int y) {		//方法重载
		return x * y;
	}

	double f(int x, float y) {	//方法重载
		return x * y;
	}
}
