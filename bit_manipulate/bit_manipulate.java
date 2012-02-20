public class bit_manipulate {
	public static void main(String args[]) {
		int i = 0xffffffff;
		int c = 110&7;

		System.out.println(i);
		System.out.println(c);

		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(c));

		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toHexString(c));
		
	}

}
