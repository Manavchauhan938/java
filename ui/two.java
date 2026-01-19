package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class two extends JFrame implements ActionListener{

	JButton j,j1,j2;
	JLabel k,k2,k3;
	
	Container c;
	
	public two() {
		
		c= this.getContentPane();
		c.setLayout(null);
		
		j = new JButton("add to cart");
		j.setBounds(200, 200, 100, 200);
		
		j1 = new JButton("Buy");
		j1.setBounds(400, 200, 100, 200);
		
		j2 = new JButton("Sold");
		j2.setBounds(600, 200, 100, 200);
		
		k = new JLabel("successfully add to cart");
		k.setBounds(250, 350, 400, 500);
		
		k2 = new JLabel("successfully Buy");
		k2.setBounds(450, 350, 400, 500);
		
		k3 = new JLabel("successfully Sold");
		k3.setBounds(650, 350, 400, 500);
		
		c.add(j);
		c.add(k);
		c.add(j1);
		c.add(j2);
		c.add(k2);
		c.add(k3);

		
		
		k.setVisible(false);
		k2.setVisible(false);
		k3.setVisible(false);
		
		j.addActionListener(this);
		j1.addActionListener(this);
		j2.addActionListener(this);

		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		two t= new two();
		t.setVisible(true);
		t.setBounds(400, 500, 400, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j) {
			k.setVisible(true);
		}else if(e.getSource()==j1) {
			k.setVisible(true);
			k2.setVisible(true);
		}else {
			k.setVisible(false);
			k2.setVisible(false);
			k3.setVisible(true);
		}
	}

}
