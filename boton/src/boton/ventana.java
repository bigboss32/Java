package boton;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana extends JFrame {
JButton botno;
JLabel et1;
public ventana() {
	setBounds(0, 0, 400, 300);
//	Container pane=new Getcon
	setLayout(null);
botno=new JButton(new ImageIcon("2.png"));
botno.setBounds(0, 0, 50, 60);
add(botno);

et1 = new JLabel();
et1.setSize(300, 300);
et1.setLocation(25,25);
et1.setIcon(new ImageIcon ( "2.png" ) ) ; 
add(et1);
setVisible(true);
}
}
