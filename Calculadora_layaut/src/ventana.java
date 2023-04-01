import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener{
	JTextField l1, l2,l3;
	JLabel L1,L2,L3;
	String [] operaciones={"Operaciones","+","-","*","/"};
	JComboBox lista=new JComboBox(operaciones);
	JButton boton,boton2;
	Operaciones a=new Operaciones();

	public ventana(){
		setLayout(new GridLayout(3, 3,6,6));
		setTitle("Calculadora");
		
		setResizable(true);
		this.getContentPane().setBackground(new Color(0,0,0));
		L1=new JLabel("Numero 1");
		l1=new JTextField();
		L1.setForeground(Color.BLUE);
		L1.setFont( new Font("Arial Black",0,12));
		//		add(l1);
		//		add(L1);
		L2=new JLabel("Numero 2");
		l2=new JTextField();
		L2.setForeground(Color.BLUE);
		L2.setFont( new Font("Arial Black",0,12));
		//		add(l2);
		//		add(L2);
		L3=new JLabel("Resultado");
		l3=new JTextField();
		L3.setForeground(Color.RED);
		L3.setFont( new Font("Arial Black",20,12));

		l3.setEditable(false);
		//		add(l3);
		//		add(L3);

		lista.addActionListener(this);
		//		add(lista);
		boton=new JButton("Operar");
		boton.addActionListener(this);
		//		add(boton);
		boton2=new JButton("Limpiar");
		boton2.addActionListener(this);
		//		add(boton2);
		boton.setEnabled(false);
		add(L1);
		add(L2);
		add(L3);
		add(l1);
		add(l2);
		add(l3);
		add(lista);
		add(boton);
		add(boton2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==lista || e.getSource()==boton) {
			boton.setEnabled(true);
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
				boton.setEnabled(false);
				l3.setText("---");
				break;

			}

		}else{

			if (e.getSource()==boton2) {
				l1.setText("");
				l2.setText("");
				l3.setText("");
				lista.setSelectedIndex(0);
			}
		}

	}

}



