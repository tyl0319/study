class Point{
	int x;
	int y;
	int z;
	Point(int x_, int y_, int z_){
	  x=x_;
	  y=y_;
	  z=z_;
	}
	int getLength()
	{
	  return x*x+y*y+z*z;
	}
	
}

public class TestPoint{
	
	public static void main(String[] args)
	{
		Point point = new Point(1,2,3);
		System.out.println(point.getLength());
	}
}