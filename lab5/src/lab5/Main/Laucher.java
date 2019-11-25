package lab5.Main;

import java.awt.Insets;

import javax.swing.JFrame;

import lab5.gfx.gui;
import lab5.iouput.editor;

public class Laucher {
	
	public static void main(String arg[]) {
		editor edit = new editor();
		try {	
			edit.Read("D:\\Java_workspace\\Lab\\lab5\\res\\input.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gui GUI = new gui();
		
		JFrame jframe = new JFrame("Test");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		GUI.addRemove(jframe.getContentPane());
		GUI.Search(jframe.getContentPane());
		
//		jframe.setLayout(null);
		Insets insets = jframe.getInsets();
		jframe.setSize(600 + insets.left + insets.right,
				600 + insets.top + insets.bottom);
		jframe.setVisible(true);
		jframe.setResizable(false);
		
		edit.closeAndWrite(jframe, "D:\\Java_workspace\\Lab\\lab5\\res\\input.txt", GUI);
	}
}
