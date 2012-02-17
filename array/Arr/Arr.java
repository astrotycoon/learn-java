public class Arr {
	public static void main(String args[]) {
	int a[] = {1, 2, 3, 4};
	int b[] = {100, 200, 300};
	int c[] = {7, 8, 9};
	char d[] = {'A', '你', '好', '啊', '!'};

	System.out.println("数组a的元素个数 = "+ a.length);
	System.out.println("数组b的元素个数 = "+ b.length);
	System.out.println("数组c的元素个数 = "+ c.length);

	System.out.println("数组a的引用 = "+ a);
	System.out.println("数组b的引用 = "+ b);
	System.out.println("数组cde引用 = "+ c);

	System.out.println("a == b的结果是"+ (a == b));
	a = b;
	System.out.println("数组a的元素个数 = "+ a.length);
	System.out.println("数组b的元素个数 = "+ b.length);
	System.out.println("a == b的结果是"+ (a == b));
	System.out.println("a[0] = "+ a[0] +",a[1] = "+ a[1] +",a[2] = "+ a[2]);
	System.out.println("b[0] = "+ b[0] +",b[1] = "+ b[1] +",b[2] = "+ b[2]);

	System.out.println("b == c的结果是"+ (b == c));
	b = c;
	System.out.println("数组b的元素个数 = "+ b.length);
	System.out.println("数组c的元素个数 = "+ c.length);
	System.out.println("b[0] = "+ b[0] +",b[1] = "+ b[1] +",b[2] = "+ b[2]);
	System.out.println("c[0] = "+ c[0] +",c[1] = "+ c[1] +",c[2] = "+ c[2]);

	System.out.println(d);
	System.out.println("数组d的引用"+d);
	System.out.println("数组d的元素个数 = "+ d.length);
	}
}
