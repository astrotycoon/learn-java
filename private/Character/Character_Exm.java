/*
	调用java.lang.Character类中的toLowerCase()和toUpperCase()类方法
*/
public class Character_Exm {
	public static void main(String args[]) {
		char [] a = {'a', 'b', 'c', 'D', 'E', 'F'};

/*		for (char ch: a) {
			if (ch > 'a'&& ch < 'z') {
				ch = Character.toUpperCase(ch);
			} else {
				ch = Character.toLowerCase(ch);
			}
		}*/

/*		for (char ch: a) {
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			}
		}*/
/*		for (int i = 0; i < a.length; i++) {
			if (Character.isLowerCase(a[i])) {
				a[i] = Character.toUpperCase(a[i]);
			} else if (Character.isUpperCase(a[i])) {
				a[i] = Character.toLowerCase(a[i]);
			}
		}*/

		for (char ch: a) {
			System.out.print(ch +" ");
		}
		System.out.println("");

		for (char ch: a) {
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				System.out.println(ch);
			} else if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				System.out.println(ch);
			}
		}

		for (char ch: a) {
			System.out.print(ch +" ");
		}

		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}

		System.out.println("");
		for (char ch: a) {
			int i = 0;
			System.out.println("ch的引用: "+ ch);
			System.out.println("a[" + i +"]的引用是: "+ a);
			i++;
		}
/*		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = Character.toUpperCase(a[i]);
			} else {
				a[i] = Character.toLowerCase(a[i]);
			}
		}

		for (char ch: a) {
			System.out.print(ch +" ");
		}
		System.out.println("");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}*/
		System.out.println("");
	}	
}


