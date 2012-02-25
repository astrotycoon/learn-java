public class Example 
{
	public static void main(String[] args)
	{
		//创建对象	
		Rational r1 = new Rational(2, 5);
//		System.out.println("r1.numerator = "+ r1.getNumerator());
//		System.out.println("r1.denominator = "+ r1.getDenominator());
		Rational r2 = new Rational(3, 5);
		Rational result = r1.add(r2);

		int a = result.getNumerator();
		int b = result.getDenominator();
		System.out.println("2/5 + 3/5 = "+ a +"/"+ b);

		result = r1.sub(r2);
		a = result.getNumerator();
		b = result.getDenominator();
		System.out.println("2/5 - 3/5 = "+ a +"/"+ b);

		result = r1.muti(r2);
		a = result.getNumerator();
		b = result.getDenominator();
		System.out.println("2/5 * 3/5 = "+ a +"/"+ b);
	
		result = r1.div(r2);
		a = result.getNumerator();
		b = result.getDenominator();
		System.out.println("(2/5) / (3/5) = "+ a +"/"+ b);
		
		System.out.println("计算2/1 + 3/2 + 5/3+ 8/5...的前10项");
		int n = 10;
		int k = 0;
		Rational sum = new Rational(0, 10);	//分母无所谓什么值
		Rational item = new Rational(2, 1);	//第一个元素
		while (k < n)
		{
			sum = sum.add(item);
			k++;
			int numerator = sum.getNumerator();
			int denominator = sum.getDenominator();
			item.setNumeratorAndDenominator(numerator + denominator, denominator);
		}

		a = sum.getNumerator();
		b = sum.getDenominator();
		System.out.println("用分数表示:");
		System.out.println(a +"/"+ b);
		double doubleResult = (a*1.0) / b;
		System.out.println("用小数表示:");
		System.out.println(doubleResult);		
	}
}
