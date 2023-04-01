import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Validaciones extends JFrame {

	void sololetras(KeyEvent e,JTextField a){
		char car = e.getKeyChar();
		if (e.getSource()==a) {
			if(Character.isLetter(car)){
			}else{
				e.consume();
				getToolkit().beep();
			}
		}
	}
	void mayusculas(KeyEvent e,JTextField a){
		if (e.getSource()==a) {
			char charecter = e.getKeyChar();
			if (Character.isLowerCase(charecter)) {
				e.setKeyChar(Character.toUpperCase(charecter));
			}
		}
	}
	void primeraletramayuscula(KeyEvent e,JTextField a){
		if (e.getSource()==a) {
			String tex=a.getText();
			if (tex.length()>0) {
				char letra=tex.charAt(0);
				tex=Character.toUpperCase(letra)+tex.substring(1, tex.length());
				a.setText(tex);
			}
		}
	}
	boolean vacio(JTextField a,String b){
		a.setBorder(BorderFactory.createTitledBorder(b));
		if (a.getText().trim().isEmpty()) {
			a.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red),b));
			return false;
		}else{
			return true;
		}


	}



}

