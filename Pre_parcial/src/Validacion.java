import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validacion extends JFrame implements ActionListener {
	String clave="NoFracking";
	JTextField uno;
	JLabel tx;
	Button boton1;
	Ventana a = new Ventana();
	public Validacion() {
		setLayout(new FlowLayout());
		setTitle("validacion");
		setResizable(true);
		boton1=new Button("confirmar");
		boton1.addActionListener(this);
		add(boton1);
		tx=new JLabel("contraseña");
		add(tx);
		uno=new JTextField(9);
		add(uno);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		clave=uno.getText();
		if (e.getSource()==boton1) {
//			if (clave.equalsIgnoreCase("NoFracking")) {
				a.setVisible(true);
				setVisible(false);
//			}
		}
		
	}
}
