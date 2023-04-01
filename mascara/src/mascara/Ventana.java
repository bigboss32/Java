package mascara;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class Ventana extends JFrame implements KeyListener{
	JLabel label;
	JFormattedTextField texto;
	JPanel panel;
	MaskFormatter formatter;
	String b;
	public Ventana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(layout);

		try {
			label = new JLabel("SSN");
			formatter = new MaskFormatter("UUUUL-##-LL");
			texto = new JFormattedTextField(formatter);
			texto.setColumns(10);
			panel = new JPanel();
			panel.add(label);
			panel.add(texto);
			add(panel);
		} catch (ParseException e) {
			System.err.println("");
		}
		pack();
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		char car = e.getKeyChar();
//		if (e.getSource()==tex3) {
//			if(Character.isLetter(car)){
//			}else{
//				e.consume();
//				getToolkit().beep();
//			}}
//		if (e.getSource()==tex4) {
//			if(Character.isDigit(car)){
//			}else{
//				e.consume();
//				getToolkit().beep();
//			}
//		}
//		if (e.getSource()==tex3) {
//			char charecter = e.getKeyChar();
//			if (Character.isLowerCase(charecter)) {
//				e.setKeyChar(Character.toUpperCase(charecter));
//			}
//		}
//		


	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
