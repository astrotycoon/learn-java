public class Circle
{
	double x;
	double y;
	double radius;

	public void setX(double arg)
	{
		x = arg;
	}
		
	public double getX()
	{
		return x;
	}

	public void setY(double arg)
	{
		y = arg;
	}

	public double getY()
	{
		return y;
	}

	public void setRadius(double r)
	{
		if (r > 0)
		{
			radius = r;
		}
	}

	public double getRadius()
	{
		return radius;
	}
}
