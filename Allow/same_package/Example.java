public class Example {
	public static void main(String[] args) {
		Son son = new Son();
		Grandson grandson = new Grandson();

		son.setWeight(62);
		son.setHand("一双大手");

		grandson.setWeight(29);
		grandson.setHand("一双小手");
		grandson.setFoot("一双小脚");

		System.out.println("儿子重量: "+ son.getWeight());
		System.out.println("孙子重量: "+ grandson.getWeight());

		System.out.println("儿子的手: "+ son.getHand());
		System.out.println("孙子的手: "+ grandson.getHand());
		System.out.println("孙子的脚: "+ grandson.getFoot());
	
	}
}
