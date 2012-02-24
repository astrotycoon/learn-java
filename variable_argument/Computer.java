public class Computer {
	public double getResult(double a, int ... x) {	//x是可变参数的参数代表
		double result = 0;
		int sum = 0;
		
	/*	for (int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}*/
		for (int number: x)
		{
			sum += number;
		}
		result = a * sum;

		return result;
	}
}
