package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class first extends JFrame implements ActionListener{

	JButton j,j1,j2;
	JLabel k,k2;
	
	Container c;
	
	
	public first() {
		
	c= this.getContentPane();
	c.setLayout(null);
	
	j= new JButton("login");
	j.setBounds(200, 200, 200, 400);
	
	j1= new JButton("regisration");
	j1.setBounds(400, 200, 200, 400);
	
	j2= new JButton("hello");
	j2.setBounds(600, 200, 200, 400);
	
	k=new JLabel("login successfully");
	k.setBounds(350, 450, 300, 500);
	
	k2=new JLabel("hello successfully");
	k2.setBounds(350, 450, 300, 500);
	
	k.setVisible(false);
	k2.setVisible(false);
	
	j.addActionListener(this);
	j1.addActionListener(this);
	j2.addActionListener(this);
	
	
	c.add(j);
	c.add(j1);
	c.add(k);
	c.add(j2);
	c.add(k2);
	}
	
	/*
	 * ui- desktop
	 * 
	 * Jframe- class for ui
	 * 
	 * button - action
	 * 
	 * interface - action listner 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f = new first();
		f.setVisible(true);
		f.setBounds(200, 400, 200, 400);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j) {
k.setVisible(true);		}
		
	}

	
}
