import java.util.Scanner;
public class scanner {
	public static void main(String args[]) {
		System.out.println("请输入若干个数，每输入一个数回车确认");
		System.out.println("最后输入数字0结束输入操作");
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		double x = reader.nextDouble();
		while (x != 0){
			m = m + 1;
			sum = sum + x;
			x = reader.nextDouble();
		}
		System.out.println(m+"个数的和为"+sum);
		System.out.println(m+"个数的平均值"+sum/m);
		System.out.println(":" +123+"大于"+122);
	}
}
