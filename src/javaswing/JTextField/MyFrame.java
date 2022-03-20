package javaswing.JTextField;

import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class MyFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf;
	DateFormat df;
	NumberFormat nf;
	NumberFormatter nft;
	JFormattedTextField ft, ft1;

	MyFrame()
	{
		super("Swing Demo");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField(15);
		df = new SimpleDateFormat("dd/MMMM/yyyy");
		ft = new JFormattedTextField(df);
		
		nf= NumberFormat.getInstance();
		nft = new NumberFormatter(nf);
		nft.setAllowsInvalid(false);
		ft1 = new JFormattedTextField(nft);
		
		ft.setColumns(15);
		ft.setValue(new Date());
		
		ft1.setColumns(15);
		
		add(tf);
		add(ft);
		add(ft1);
		
	}

}
