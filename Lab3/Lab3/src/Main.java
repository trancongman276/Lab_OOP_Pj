import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]) {
		int a;
		System.out.println("Select 5 shapes from list below:");
		System.out.println("1.Line.");
		System.out.println("2.Square.");
		System.out.println("3.Rectangle.");
		System.out.println("4.Oval.");
		System.out.println("5.Circle.");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		MyShape ms = new MyLine();
		ms.Draw(a);
		}
	
	
}

