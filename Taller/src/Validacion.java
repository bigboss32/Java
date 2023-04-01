

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Validacion {
	boolean isvacio(JTextField a){
		
		if (!a.getText().trim().isEmpty()) {
			a.setBorder(BorderFactory.createTitledBorder( ""+a.getName()));
		}else{
				a.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), a.getName()));
			}

	
		return false;
	}
}
