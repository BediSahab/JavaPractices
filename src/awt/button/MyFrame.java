package awt.button;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int count =0;
	Label l;
	Button b;
	
	public MyFrame()
	{
		super("Button Demo");
		
		l= new Label(" "+count);
		b= new Button("Click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(l);
		add(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		count++;
		l.setText(" "+count);
	}
}
