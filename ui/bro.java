package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bro extends JFrame implements ActionListener{
	
	JButton j;
	JLabel k;
	
	Container c;

	public bro() {
		
		c = this.getContentPane();
		c.setLayout(null);
		
		j = new JButton("Login");
		j.setBounds(300, 200, 200, 200);
		
		k = new JLabel("login successfully");
		k.setBounds(350, 350, 200, 200);
		
		c.add(j);
		c.add(k);
		
		k.setVisible(false);
		
		j.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bro p =new bro();
		p.setVisible(true);
		p.setBounds(500, 500, 400, 400);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j) {
			k.setVisible(true);
		}
	}

}
