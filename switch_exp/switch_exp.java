/*
	switch语句中的值必须是byte, short, int, char型和 枚举类型
	如果本列中long x = 96l会报错
*/
enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}

public class switch_exp {
	public static void main(String args[]) {
		int x = 96, y = 1;
		Season season = Season.SPRING;

		switch(x+y) {
		case 1:
			System.out.println(x+y);
			break;
		case 'a':
			System.out.println(x+y);
		case 10:
			System.out.println(x+y);
			break;
		default:
			System.out.println("没有般配的"+ (x+y));
		}
		
		switch(season) {
		case WINTER:
			System.out.println("WINTER");
		case SPRING:
			System.out.println("SPRING");
		case AUTUMN:
			System.out.println("AUTUMN");
			break;
		case SUMMER:
			System.out.println("SUMMER");	
		}
	}
}
