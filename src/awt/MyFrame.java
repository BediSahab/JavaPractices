package awt;

import java.awt.*;

public class MyFrame extends Frame{

	Label l;
	TextField tf;
	Button b;
	
	MyFrame()
	{
		super("My App");
		
		setLayout(new FlowLayout());
		
		l = new Label("Name");
		tf = new TextField(20);
		b = new Button("OK");
		
		add(l);
		add(tf);
		add(b);
	}
}
