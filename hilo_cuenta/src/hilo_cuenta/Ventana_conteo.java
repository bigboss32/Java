package hilo_cuenta;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ventana_conteo extends JFrame{
	JTextArea area;
 public Ventana_conteo() {
	 setLayout(new FlowLayout());
	 area = new JTextArea(9,10);
	 add(area);
	Hilo h= new Hilo(area);
	setBounds(400, 400, 400, 400);
	 
	h.start();
	setLocationRelativeTo(null);
	
}
}
