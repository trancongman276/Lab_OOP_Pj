package Lab1_Q3;
import java.util.Scanner;
public class Point {
	private float x,y;
	
	public Point() {
		Scanner s = new Scanner(System.in);
		System.out.println("x=");
		x= s.nextFloat();
		System.out.println("y=");
		y= s.nextFloat();
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
}

