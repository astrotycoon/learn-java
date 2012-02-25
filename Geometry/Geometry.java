public class Geometry
{
	Rectangle rect;
	Circle circle;

	//构造方法
	public Geometry(Rectangle rect, Circle circle)
	{
		this.rect = rect;
		this.circle = circle;
	}	

	public void setCirclePosition(double x, double y)
	{
		circle.setX(x);
		circle.setY(y);
	}

	public void setCircleRadius(double radius)
	{
		circle.setRadius(radius);
	}

	public void setRectanglePosition(double x, double y)
	{
		rect.setX(x);
		rect.setY(y);
	}

	public void setRectangleWidthAndHeight(double width, double height)
	{
		rect.setWidth(width);
		rect.setHeight(height);
	}

	public void showState()
	{
		double circleX = circle.getX();
		double circleRadius = circle.getRadius();
		double rectX = rect.getX();
		double rectWidth = rect.getWidth();

		if ((rectX - rectWidth) >= (circleX + circleRadius))
		{
			System.out.println("矩形在圆的右侧");
		}

		if ((rectX + rectWidth) <= (circleX - circleRadius))
		{
			System.out.println("矩形在圆的左侧");
		}
	}
}

