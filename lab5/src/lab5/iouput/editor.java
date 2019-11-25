package lab5.iouput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import lab5.gfx.gui;
import lab5.products.Products;

public class editor {
	
	public static ArrayList<String> st;
	public static ArrayList<Products> productls;
//	public static ArrayList<Integer> amount;
	public static ArrayList<String> decription;
	
	public editor(){
		productls = new ArrayList<>();
//		amount = new ArrayList<>();
		st = new ArrayList<>();
		decription = new ArrayList<>();
	}
	
	public void Read(String Path) throws Exception {
//		String t;
		
		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		int i=0;
//		while((t=br.readLine())!=null) {
//			st.add(t);
//			productls.add(st.get(i).substring(st.get(i).indexOf(". ")+2,st.get(i).lastIndexOf(" ")));
//			amount.add(Integer.parseInt(st.get(i).substring(st.get(i).lastIndexOf(" ")+1,st.get(i).length())));
//			decription.add("");
//			i++;
//		}
//		br.close();
		
		File file = new File(Path);
		FileInputStream f = new FileInputStream(Path);
		if(f!=null) {
			ObjectInputStream o = new ObjectInputStream(f);
			Products p1 = (Products) o.readObject();
			while(p1!=null) {
				productls.add(p1);
				p1 = (Products) o.readObject();
			}
			o.close();
			f.close();
		}
	}
	
	public void closeAndWrite(JFrame jframe, String Path,gui GUI) {
		jframe.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				try {
					Write(Path,GUI);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	private void Write(String Path,gui GUI) throws IOException{
//		FileWriter file;
//		try {
//			file = new FileWriter(Path);
//			BufferedWriter bw = new BufferedWriter(file);
//				bw.write(GUI.getProductList().getText());
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File file = new File(Path);
		FileOutputStream f = new FileOutputStream(Path);
		ObjectOutputStream o = new ObjectOutputStream(f);
//		for(int i=0;i<editor.productls.size();i++) {
			o.writeObject(productls.get(0));
//		}
		o.close();
		f.close();
	}
}
