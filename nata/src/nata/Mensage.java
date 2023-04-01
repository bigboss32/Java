package nata;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mensage extends JFrame {
	JLabel info;
	public Mensage() {
		setBounds(200,200,200,200);	

		info=new JLabel("falata de informacion");

		add(info);

	}

}
