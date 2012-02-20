public class for_array {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		char b[] = {'a', 'b', 'c', 'd'};

		//传统方式
		for (int n = 0; n < a.length; n++) {
			System.out.println(a[n]);
		}

		for (int n = 0; n < b.length; n++) {
			System.out.println(b[n]);
		}
		
		//改进方式
		for (int i: a) {
			System.out.println(i);
		}
		
		for (char i:b) {
			System.out.println(i);
		}
	}
}
