package Lab1_Q2;
import java.util.Scanner;

public class ip {
	public static void main(String arg[]) {
		Scanner s= new Scanner(System.in);
		float a,b,c;
		System.out.print("a= "); a=s.nextFloat(); System.out.println();
		System.out.print("b= "); b=s.nextFloat(); System.out.println();
		System.out.print("c= "); c=s.nextFloat(); System.out.println();
		
		Triangle t = new Triangle();
		t.setA(a);
		t.setB(b);
		t.setC(c);
		System.out.println(t.verify());
	}
}
