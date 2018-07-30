package classes;

public class TestClass {
	public static void main(String []args)
	{
		RectangleClass rect1=new RectangleClass();
		RectangleClass rect2=new RectangleClass();
		/*rect1.length=10;
		rect1.breadth=20;
		rect2.length=10;
		rect2.breadth=20;*/
		int area1=0,area2=0;
		area1=rect1.area(/*rect1.length,rect1.breadth*/3,4);
		area2=rect2.area(/*rect2.length,rect2.breadth*/4,5);
		if(area1==area2)
		{
			System.out.println("both rectangles are equal");
		}
		else
		{
			System.out.println("both rectangles are not equal");
		}
	}

}
