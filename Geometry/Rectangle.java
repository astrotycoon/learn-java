public class Rectangle 
{
	double x;
	double y;
	double width;
	double height;

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

	public void setWidth(double width)
	{
		if (width > 0)
		{
			this.width = width;
		}
	}

	public double getWidth()
	{
		return width;
	}

	public void setHeight(double height)
	{
		if (height > 0)
		{
			this.height = height;
		}
	}

	public double getHeight()
	{
		return height;
	}
}
