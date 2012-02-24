/*
	java参数类型匹配问题
*/

public class Argument {
	public static void main(String args[]) {
		float result;
		Add add = new Add();
		result = add.add(1, 2.0f, 3.0f);	//正确，结果为float型
		System.out.println(result);

/*		result = add.add(1, 1.0, 2.0);	//不正确，应为1.0 2.0 默认为double类型的，会有精度丢失
		System.out.println(result);*/

		result = add.add(1, 2, 3);		//正确，会把1和2转化成float类型的，结果为float型
		System.out.println(result);
	}
}

class Add {
	public float add (int num1, float num2, float num3) {
		return (num1 + num2 + num3);
	}
}
