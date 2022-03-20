package javaswing;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.*;
import java.awt.*;

public class JCheckboxFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JCheckBox cb1,cb2;
	JRadioButton rb1,rb2;
	
	JTextField tf;
	
	JCheckboxFrame()
	{
		super("Demo");
		
		tf = new JTextField("Demo Text",20);
		tf.setBounds(10,20,100,80);
		
		cb1 = new JCheckBox("Bold");
		cb1.setMnemonic(MenuKeyEvent.VK_B);
		
		cb2 = new JCheckBox("Italic");
		cb2.setMnemonic(MenuKeyEvent.VK_I);
		
		rb1 = new JRadioButton("lower");
		rb2 = new JRadioButton("UPPER");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		rb1.setActionCommand("lower");
		rb2.setActionCommand("UPPER");
		
		setLayout(new FlowLayout());
		
		add(tf);
		add(cb1);
		add(cb2);
		add(rb1);
		add(rb2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int b=0,i=0;
		
		if(cb1.isSelected())
			b=Font.BOLD;
		if(cb2.isSelected())
			i=Font.ITALIC;
		
		Font f = new Font("Times New Roman",b|i,15);
		tf.setFont(f);
		
		switch(e.getActionCommand())
		{
		case "lower":
			tf.setText(tf.getText().toLowerCase());
			break;
		case "UPPER":
			tf.setText(tf.getText().toUpperCase());
			break;
		}
	}
}
