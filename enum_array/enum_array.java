public class enum_array {
	public static void main(String args[]) {
		WeekDays enum_arr[] = WeekDays.values();
		for (WeekDays day:enum_arr) {
			System.out.println(day);
		}

		for (Clolor a:Clolor.values()) {
			for (Clolor b:Clolor.values()) {
				for (Clolor c:Clolor.values()) {
					if (a != b && a != c && b != c) {
						System.out.println(a +","+ b +","+ c +"|");
					}	
				}
			}
		}
	}
}

enum WeekDays {
	sun, mon, tue, wed, thu, fri, sat
}

enum Clolor {
	红, 蓝, 绿, 黄, 黑
}
