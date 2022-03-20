package javaswing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	JButton b;
	int count = 0;
	
	MyFrame()
	{
		super("Swing Demo");
		
		setLayout(new FlowLayout());
		
		b=new JButton("Click");
		l= new JLabel("Clicked "+count+" Times.");
		
		add(l);
		add(b);
		
		b.addActionListener(this);
		b.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\javaswing\\images.jpg"));
		getRootPane().setDefaultButton(b);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("Clicked "+count+" Times.");
		
	}
}
