/*
	在类方法中不可操作实例变量，也不可以调用实例方法
*/
public class Static_func
{
	public static void main(String []args)
	{
		int result = A.getContinueSum(1, 100);	//不需要创建对象就可以用类方法
		System.out.println("result = "+ result);
	}
}

class A
{
	int x, y, z;
	static int getContinueSum(int start, int end)	//类方法，在该类被加载到内存时，就分配了相应的入口的地址
	{
		int sum = 0;
		for (int i = start; i <= end; i++)
		{
			sum += i;
		}
		return sum;
	}

		
}
