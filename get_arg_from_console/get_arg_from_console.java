import java.io.*;
public class get_arg_from_console {
	public static void main(String args[]) {
		try{
			/* 输入流，从键盘接收数 */
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			/* 从控制台读取数 */
			System.out.println("请输入第一个数");
			String a1 = br.readLine();
			System.out.println("请输入第二个数");
			String a2 = br.readLine();
			
			/* String --> float */
			float num1 = Float.parseFloat(a1);
			float num2 = Float.parseFloat(a2);
			System.out.println("num1 = "+ num1 +",num2 = "+ num2);
			if (num1 > num2) {
				System.out.println("num1 > num2");
			} else if (num1 < num2){
				System.out.println("num1 < num2");
			} else {
				System.out.println("num1 == num2");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
