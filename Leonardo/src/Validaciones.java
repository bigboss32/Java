import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validaciones {
	
	
	void sololetras(KeyEvent e,JTextField a){
		JFrame r =new JFrame();
		char car = e.getKeyChar();
		if (e.getSource()==a) {
			if(Character.isLetter(car)){
			}else{
				e.consume();
				r.getToolkit().beep();
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
	void numerosoloimpares(KeyEvent e,JTextField a){
		int m;
//		Ventanados l=new Ventanados();
		if (e.getSource()==a) {
			String tex=a.getText();
			if (tex.length()>0) {
				for (int i = 0; i < tex.length(); i++) {
					char numero=tex.charAt(i);
					m=Integer.parseInt(""+numero);
					if (m==0) {
						
					}else{
						if (m%2==0) {
//							l.setVisible(true);
//							l.setLocationRelativeTo(null);
							a.setText("");
							
						}
						
					}
					
				}
				
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
	void numeros(KeyEvent e,JTextField a){
		JFrame r =new JFrame();
		char car = e.getKeyChar();
		if (e.getSource()==a) {
			if(Character.isDigit(car)){
			}else{
				e.consume();
				r.getToolkit().beep();
			}
		}
	}
}
