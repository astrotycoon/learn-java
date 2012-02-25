public class Lader
{
	double high_bottom;	//上底 	--> 实例变量
	double height;		//高	--> 实例变量
	static double low_bottom;	//下底 --> 类变量（静态变量  所有对象共享）

	public void setHigh_bottom(double a)
	{
		high_bottom = a;
	}
	
	public void setLow_bottom(double b)
	{
		low_bottom = b;
	}

	public double getHigh_bottom()
	{
		return high_bottom;
	}
	
	public double getLow_bottom()
	{
		return low_bottom;
	}
}
