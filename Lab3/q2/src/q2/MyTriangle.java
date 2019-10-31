package q2;

public class MyTriangle {
	MyPoint v1,v2,v3;
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.setX(x1);
		v1.setY(y1);
		v2.setX(x2);
		v2.setY(y2);
		v3.setX(x3);
		v3.setY(y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String ToString() {
		return "My Triangle[v1=("+v1.getX()+","+v1.getY()+"),"
				+ "v2=("+v2.getX()+","+v2.getY()+"),"
						+ "v3("+v3.getX()+","+v3.getY()+")]";
	}
	
	public double getPerimeter() {
		double a,b,c;
		a=Math.sqrt((v1.getX()-v2.getX())*(v1.getX()-v2.getX())
				+(v1.getY()-v2.getY())*(v1.getY()-v2.getY()));
		b=Math.sqrt((v1.getX()-v3.getX())*(v1.getX()-v3.getX())
				+(v1.getY()-v3.getY())*(v1.getY()-v3.getY()));
		c=Math.sqrt((v3.getX()-v2.getX())*(v3.getX()-v2.getX())
				+(v3.getY()-v2.getY())*(v3.getY()-v2.getY()));
		return a+b+c;
	}
	
	public String getType() {
		double a,b,c;
		a=Math.sqrt((v1.getX()-v2.getX())*(v1.getX()-v2.getX())
				+(v1.getY()-v2.getY())*(v1.getY()-v2.getY()));
		b=Math.sqrt((v1.getX()-v3.getX())*(v1.getX()-v3.getX())
				+(v1.getY()-v3.getY())*(v1.getY()-v3.getY()));
		c=Math.sqrt((v3.getX()-v2.getX())*(v3.getX()-v2.getX())
				+(v3.getY()-v2.getY())*(v3.getY()-v2.getY()));
		if(a==b && b==c)
			return "Equilateral";
		else
			if(a==b && a==c)
				return "Isosceles";
			else
				return "Scalene";
	}
}
