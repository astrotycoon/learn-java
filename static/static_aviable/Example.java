/*
	类变量（静态变量）是所有对象所共享的
*/
public class Example
{
	public static void main(String[] args)
	{
		//创建对象
		Lader.low_bottom = 100;	//Lader的字节码内加载到内存，通过类名操作类变量
		
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		//设置上底
		laderOne.setHigh_bottom(28);
		laderTwo.setHigh_bottom(66);

		System.out.println("laderOne的上底: "+ laderOne.getHigh_bottom());
		System.out.println("laderOne的下底: "+ laderTwo.getLow_bottom());
		System.out.println("laderTwo的上底: "+ laderTwo.getHigh_bottom());
		System.out.println("laderTwo的下底: "+ laderTwo.getLow_bottom());
	}
}
