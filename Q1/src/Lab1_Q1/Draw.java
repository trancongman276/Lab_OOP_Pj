package Lab1_Q1;

import java.util.Scanner;

public class Draw {
	private int height,width;
	
	public Draw() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input height: "); 
		height=in.nextInt();
		if (height <0) {
			height =1;
			System.out.println("Error: Negative number inputted. Height now is equal 1.");
		}
		
		System.out.println("Input width: "); 
		width=in.nextInt();
		if (width <0) {
			width =1;
			System.out.println("Error: Negative number inputted. Width now is equal 1.");
		}
		
	}
	
	public void visualize() {
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=width;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
