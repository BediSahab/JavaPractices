package awt;

import java.awt.*;

public class Demo1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("First AWT App");
		f.setLayout(new FlowLayout());
		
		
		Button b = new Button("OK");
		Label l = new Label("Name");
		TextField tf = new TextField(20);
		
		f.add(b);
		f.add(l);
		f.add(tf);
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
