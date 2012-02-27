/*
	使用java.util.Date类创建对象来显示本地时间
*/

import java.util.Date;
public class Time {
	public static void main(String args[]) {
		Date date = new Date();
		System.out.println("本地机器的时间：");
		System.out.println(date);
	}	
}
