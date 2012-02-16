public class hello {
	public static void main(String args[]) {
		System.out.println("This a simple java program!");
		student stu = new student();
		stu.speak("Hello world!");
	}
}

class student {
	public void speak(String s) {
		System.out.println(s);
	}
}
