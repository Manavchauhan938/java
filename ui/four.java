package ui;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class four extends JFrame implements ActionListener{

	JButton m,m1;
	JLabel k;
	
	Container a;
	
	public four()  {
		
		a=this.getContentPane();
		a.setLayout(null);
		
		m= new JButton("Login");
		m.setBounds(200, 250, 200, 250);
		
		m1= new JButton("new");
		m1.setBounds(450, 250, 200, 250);
		
		k= new JLabel("Login succesfully");
		k.setBounds(250, 300, 400, 500);
		
		a.add(m);
	    a.add(k);
	    a.add(m1);
	    
	    k.setVisible(false);
	    
	    m.addActionListener(this);
	    m1.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		four f = new four();
		f.setVisible(true);
		f.setBounds(400, 600, 400, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==m) {
			k.setVisible(true);
		}else {
			k.setVisible(false);
		}
	}

}
