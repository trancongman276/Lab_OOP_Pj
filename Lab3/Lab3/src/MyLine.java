import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyLine extends MyShape{
	public static int x1,x2,y1,y2,w,h,i;
	@Override
	public void Draw(int i) {
		// TODO Auto-generated method stub
		MyBoundedShape mb;
		Scanner sc = new Scanner(System.in);
		this.i = i;
		switch(i) {
		case 1:
			System.out.println("Input x1,y1,x2,y2"); 
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			break;
		case 2:
			System.out.println("Input x,y,w"); 
			x1=sc.nextInt();
			y1=sc.nextInt();
			w=sc.nextInt();
			break;
		case 3:
			System.out.println("Input x,y,w,h"); 
			x1=sc.nextInt();
			y1=sc.nextInt();
			w=sc.nextInt();
			h=sc.nextInt();
			break;
		case 4:
			System.out.println("Input x,y,w,h"); 
			x1=sc.nextInt();
			y1=sc.nextInt();
			w=sc.nextInt();
			h=sc.nextInt();
			break;
		case 5:
			System.out.println("Input x,y,r"); 
			x1=sc.nextInt();
			y1=sc.nextInt();
			w=sc.nextInt();
			break;
		}
		
		canvas canvas = new canvas();
		JFrame jframe = new JFrame();
		jframe.setBounds(400,400,400,400);
		jframe.getContentPane().add(canvas);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		switch(i) {
		case 3:
			mb = new MyRectangle();
			System.out.println(mb.GetArea(x1, y1, w, h));
			break;
		case 4:
			mb = new MyOval();
			System.out.println(mb.GetArea(x1, y1, w, h));
		}
	}
}

class canvas extends JComponent{
	public void paint(Graphics g) {
		switch(MyLine.i) {
		case 1:
			g.drawLine(MyLine.x1, MyLine.y1, MyLine.x2, MyLine.y2);
			break;
		case 2:
			g.drawRect(MyLine.x1, MyLine.y1, MyLine.w, MyLine.w);
			break;
		case 3:
			g.drawRect(MyLine.x1, MyLine.y1, MyLine.w, MyLine.h);
			break;
		case 4:
			g.drawOval(MyLine.x1, MyLine.y1, MyLine.w, MyLine.h);
			break;
		case 5:
			g.drawOval(MyLine.x1, MyLine.y1, MyLine.w, MyLine.w);
			break;
		}
		
	}
}
