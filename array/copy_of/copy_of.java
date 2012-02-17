import java.util.*;
public class copy_of {
	public static void main(String args[]) {
		int [] a = {10, 20, 30, 40, 50, 60}, b, c, d;

		b = Arrays.copyOf(a, 10);
		System.out.println("数组a的各个元素中的值:");
		System.out.println(Arrays.toString(a));
		
		System.out.println("数组b的各个元素中的值:");
		System.out.println(Arrays.toString(b));
		System.out.println("数组b元素个数 = "+ b.length);

		c = Arrays.copyOfRange(a, 3, 5);
		System.out.println("数组c的各个元素中的值:");
		System.out.println(Arrays.toString(c));
		System.out.println("数组c元素个数 = "+ c.length);

		d = Arrays.copyOfRange(a, 3, 9);
		System.out.println("数组d的各个元素中的值:");
		System.out.println(Arrays.toString(d));
		System.out.println("数组d元素个数 = "+ d.length);		
	}
}
