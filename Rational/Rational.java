/*
	有理数的封装
	成员变量： 分子 分母	
	类方法： 四则运算
*/
import java.lang.Math;
public class Rational
{
	//成员变量
	int numerator;		//分子
	int denominator;	//分母

	//构造方法
	public Rational(int numerator_arg, int denominator_arg)
	{
		if (numerator_arg == 0)
		{
			this.numerator = 0;
			this.denominator = 1;
		}
		else
		{
			setNumeratorAndDenominator(numerator_arg, denominator_arg);
		}
	}

	//设置分子分母
	public void setNumeratorAndDenominator(int numerator_arg, int denominator_arg)
	{
		int c = gcd(Math.abs(numerator_arg), Math.abs(denominator_arg));
//		System.out.println("最大公约数: "+ c);
		this.numerator = numerator_arg / c;
		this.denominator = denominator_arg / c;
		if (this.numerator < 0 && this.denominator < 0)
		{
			this.numerator = -this.numerator;
			this.denominator = -this.denominator;
		}
	}

	//求两整数的最大公约数（递归方法）
	public int gcd(int a, int b)
	{
		if (a % b == 0)
		{
			return b;
		}
		else
		{
			return gcd(b, a%b);
		}
	}
	
	//获得分子
	public int getNumerator()
	{
		return this.numerator;
	}

	//获得分母
	public int getDenominator()
	{
		return this.denominator;

	}

	//加法元素
	public Rational add(Rational r)
	{
		int a = r.getNumerator();
		int b = r.getDenominator();
//		System.out.println("a = "+ a +", b = "+ b);
		int newNumerator = this.numerator * b + this.denominator * a;
		int newDenominator = this.denominator * b;
		Rational result = new Rational(newNumerator, newDenominator);

		return result;		
	}

	//减法运算
	public Rational sub(Rational r)
	{
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = this.numerator * b - this.denominator * a;
		int newDenominator = this.denominator * b;
		Rational result = new Rational(newNumerator, newDenominator);
		
		return result;
	}
	
	//乘法运算
	public Rational muti(Rational r)
	{
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = this.numerator * a;
		int newDenominator = this.denominator * b;
		Rational result = new Rational(newNumerator, newDenominator);

		return result;
		
	}

	//除发运算
	public Rational div(Rational r)
	{
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = this.numerator * b;
		int newDenominator = this.denominator * a;
		Rational result = new Rational(newNumerator, newDenominator);		

		return result;
	}
}
