package lab5.gfx;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import lab5.iouput.editor;
import lab5.products.Products;

public class gui {
	
	private JButton addBt,removeBt;
	private JTextPane productList,decription,warning;
	private JTextField productName,productAmount;
	
	public gui() {
		
	}
	
	public void addRemove(Container addremove) {
		//LEFT Panel
		JLabel l1 = new JLabel("Product Name");
		l1.setBounds(50,10,l1.getPreferredSize().width,l1.getPreferredSize().height);
		addremove.add(l1);
		
		productName = new JTextField("",100);
		productName.setBounds(150,12,100,l1.getPreferredSize().height);
		addremove.add(productName);
		
		JLabel l2 = new JLabel("Amount");
		l2.setBounds(50,50,l2.getPreferredSize().width,l2.getPreferredSize().height);
		addremove.add(l2);
		
		productAmount = new JTextField("",100);
		productAmount.setBounds(150,52,100,l2.getPreferredSize().height);
		addremove.add(productAmount);
		
		JLabel l3 = new JLabel("Description");
		l3.setBounds(50,90,l3.getPreferredSize().width,l3.getPreferredSize().height);
		addremove.add(l3);
		
		decription = new JTextPane();
		JScrollPane decriptionScroll = new JScrollPane(decription);
		int decriptionH = l3.getPreferredSize().height*3;
		decriptionScroll.setBounds(150,92,200,decriptionH);
		addremove.add(decriptionScroll);
		
		//Buttons
		addBt = new JButton("Add");
		removeBt = new JButton("Remove");
		
		addBt.setBounds(150,92+decriptionH+20,addBt.getPreferredSize().width,addBt.getPreferredSize().height);
		removeBt.setBounds(220,92+decriptionH+20,removeBt.getPreferredSize().width,removeBt.getPreferredSize().height);
		addremove.add(addBt);
		addremove.add(removeBt);		
		
		//Right panel
		JLabel l4 = new JLabel("Product List");
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setBounds(400,10,l4.getPreferredSize().width,l4.getPreferredSize().height);
		addremove.add(l4);
		
		productList = new JTextPane();
		productList.setEditable(false);
		JScrollPane scroll = new JScrollPane(productList);
		scroll.setBounds(380,l4.getPreferredSize().height+20,180,150);
		addremove.add(scroll);
		
		warning = new JTextPane();
			warning.setBackground(addremove.getBackground());
		JScrollPane warningScroll = new JScrollPane(warning);
			warningScroll.setBorder(BorderFactory.createEmptyBorder());
		warningScroll.setBounds(380,200,180,80);
		addremove.add(warningScroll);
		
		addClick();
		update();
		
		addremove.setLayout(null);
	}
	
	public void Search(Container searchPanel) {
		JLabel productName = new JLabel("Product Name");
		JLabel amount = new JLabel("Amount");
		JLabel decription = new JLabel("Decription");
		
		JTextField productNameBox = new JTextField(100);
		JLabel amountOut = new JLabel();
		JTextPane decriptionOut = new JTextPane(); 
			decriptionOut.setBackground(searchPanel.getBackground()); 	
			decriptionOut.setEditable(false); 
			
		JScrollPane decriptionScroll = new JScrollPane(decriptionOut);
			decriptionScroll.setBorder(BorderFactory.createEmptyBorder());
		JButton searchBt = new JButton("Search");
		
		productName.setBounds(50,300,productName.getPreferredSize().width,productName.getPreferredSize().height);
		amount.setBounds(50,320,amount.getPreferredSize().width,amount.getPreferredSize().width);
		decription.setBounds(50,370,decription.getPreferredSize().width,decription.getPreferredSize().height);
		
		productNameBox.setBounds(150,300,150,productName.getPreferredSize().height+2);
		amountOut.setBounds(150,332,amount.getPreferredSize().width+2,amount.getPreferredSize().height);
		decriptionScroll.setBounds(150,370,200,
				decription.getPreferredSize().height*100);
		
		searchBt.setBounds(350,productName.getBounds().y,productName.getBounds().width,productName.getBounds().height);
		
		searchPanel.add(productName);
		searchPanel.add(amount);
		searchPanel.add(decription);
		searchPanel.add(productNameBox);
		searchPanel.add(amountOut);
		searchPanel.add(decriptionScroll);
		searchPanel.add(searchBt);
		
		setButton(searchBt, productNameBox, amountOut, decriptionOut);
		
		searchPanel.setLayout(null);
	}
	
	public void setButton(JButton bt, JTextField productNameBox, JLabel amountOut, JTextPane decriptionOut) {
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<editor.productls.size();i++) {
					if(productNameBox.getText().equals(editor.productls.get(i).getName())) {
						amountOut.setText(Integer.toString(editor.productls.get(i).getAmount()));
						decriptionOut.setText(editor.productls.get(i).getDecription());
						break;
					}
				}
			}
			
		});
	}
	
	public void update() {
		productList.setText("");
		for(int i=0;i<editor.productls.size();i++) {
			productList.setText(productList.getText()+(i+1)+". "+editor.productls.get(i).getName()
					+" "+editor.productls.get(i).getAmount()+"\n");
		}
	}
	
	public void addClick() {
		addBt.addActionListener(new ActionListener(){//add

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean foundbug = false;
				warning.setText("");
				if(productName.getText().isEmpty()) {
					warning.setText("Blank Product Name\n");
					foundbug = true;
					}
				if(productAmount.getText().isEmpty()) {
					warning.setText(warning.getText()+"Blank Product Amount");
					foundbug = true;
					}
				if(!foundbug) {
						warning.setText("");
						if(!find(1)) add();
						update();
					}
			}
		});
		
		removeBt.addActionListener(new ActionListener(){//remove

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean foundbug = false;
				warning.setText("");
				if(productName.getText().isEmpty()) {
					warning.setText("Blank Product Name\n");
					foundbug = true;
					}
				if(productAmount.getText().isEmpty()) {
					warning.setText(warning.getText()+"Blank Product Amount");
					foundbug = true;
					}
				if(!foundbug) {
						warning.setText("");
								if(!find(-1)) warning.setText("The given product is not existed");
								else update();
							}
			}
		});
	}
	
	public boolean find(int k) {
		for(int i=0;i<editor.productls.size();i++) {
			if(productName.getText().equals(editor.productls.get(i).getName())) {
				if(editor.productls.get(i).getAmount()+k*Integer.parseInt(productAmount.getText())<0) {
					warning.setText("Given amount is bigger than the storage amount");
				}else
				if(editor.productls.get(i).getAmount()+k*Integer.parseInt(productAmount.getText())>0) {
					editor.productls.get(i).setAmount(editor.productls.get(i).getAmount()+k*Integer.parseInt(productAmount.getText()));
				}else
					remove(i);
				return true;
			}
		}
		return false;
	}
	public void remove(int i) {
		editor.productls.remove(i);
	}
	
	public void add() {
		editor.productls.add(new Products(productName.getText(),Integer.parseInt(productAmount.getText())));
		editor.productls.get(editor.productls.size()-1).setDecription(decription.getText());
	}

	public JTextPane getProductList() {
		return productList;
	}
	
	
}
