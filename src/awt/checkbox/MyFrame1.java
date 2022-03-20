package awt.checkbox;

import java.awt.*;
import java.awt.event.*;

public class MyFrame1 extends Frame implements ItemListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label l;
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	
	CheckboxGroup cbg;
	
	public MyFrame1()
	{
		super("Checkbox Demo");
		
		l= new Label("Nothing is Selected.");
		c1 = new Checkbox("Java",true,cbg);
		c2 = new Checkbox("Python",false,cbg);
		c3 = new Checkbox("C#",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String str ="";

		if(c1.getState())
			str=str+" "+c1.getLabel();
		if(c2.getState())
			str=str+" "+c2.getLabel();
		if(c3.getState())
			str=str+" "+c3.getLabel();
		if(str.isEmpty())
			str="Nothing is Selected.";
		l.setText(str);
	}


}
