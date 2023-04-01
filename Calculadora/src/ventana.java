import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener{
	JTextField l1, l2,l3;
	JLabel L1,L2,L3;
	String [] operaciones={"Operaciones","+","-","*","/"};
	JComboBox lista=new JComboBox(operaciones);
	
	public ventana(){
		setLayout(null);
		setTitle("Calculadora");
		setBounds(400, 300, 300, 300);
		setResizable(true);
		this.getContentPane().setBackground(new Color(0,0,0));
		L1=new JLabel("Numero 1");
		l1=new JTextField();
		L1.setForeground(Color.BLUE);
		L1.setFont( new Font("Arial Black",0,12));
		L1.setBounds(20, 10, 70, 20);
		l1.setBounds(100, 10, 70, 20);
		add(l1);
		add(L1);
		L2=new JLabel("Numero 2");
		l2=new JTextField();
		L2.setForeground(Color.BLUE);
		L2.setFont( new Font("Arial Black",0,12));
		L2.setBounds(20, 40, 70, 20);
		l2.setBounds(100, 40, 70, 20);
		add(l2);
		add(L2);
		L3=new JLabel("Resultado");
		l3=new JTextField();
		L3.setForeground(Color.RED);
		L3.setFont( new Font("Arial Black",20,12));
		L3.setBounds(20, 80, 70, 20);
		l3.setBounds(100, 80, 70, 20);
		add(l3);
		add(L3);
		lista.setBounds(30, 120, 100, 30);
		lista.addActionListener(this);
		add(lista);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Operaciones a=new Operaciones();
		if (e.getSource()==lista) {
		switch (lista.getSelectedIndex()) {
		case 1:
			l3.setText(""+a.suma(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText())));
			break;
		case 2:
			l3.setText(""+a.resta(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText())));
			break;
		case 3:
			l3.setText(""+a.multipli(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText())));
			break;
		case 4:
			l3.setText(""+a.divis(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText())));
			break;
			
		default:
			l3.setText("---");
			break;
			
		}
		
		}

	}

}



