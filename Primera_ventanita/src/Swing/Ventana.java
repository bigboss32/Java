package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.xml.bind.ParseConversionEvent;

public class Ventana extends JFrame implements ActionListener {
	JLabel L1,L2,L3;
	JButton boton,boton2;
	JTextField l1, l2,l3;
	JComboBox lista;
	public Ventana(){

		setTitle("clase ventaa");
		setBounds(344, 300, 244, 200);
		//	setSize(400, 300);
		setResizable(true);

		this.getContentPane().setBackground(new Color(0, 0,0));
		setLayout(null);

		L1=new JLabel("numero 1");
		L2=new JLabel("numero 2");
		L3=new JLabel("resultado");
	

		//		L1.setBackground(Color.WHITE);
		L1.setForeground(new Color(134, 150, 50));//letras
		L1.setFont( new Font("Arial Black",20,12));
		L1.setBounds(20, 10, 70, 20);
		l1=new JTextField();
		l1.setBounds(100, 10, 70, 20);
		add(l1);
		add(L1);
		L2.setForeground(new Color(134, 1, 50));//letras
		L2.setFont( new Font("Arial Black",20,12));
		L2.setBounds(20, 30, 70, 20);
		l2=new JTextField();
		l2.setBounds(100, 30, 70, 20);
		add(l2);
		add(L2);
		L3.setForeground(new Color(134, 100, 50));//letras
		L3.setFont( new Font("Arial Black",20,12));
		L3.setBounds(20, 60, 70, 20);
		l3=new JTextField();
		l3.setBounds(100, 60, 70, 20);
		add(l3);
		add(L3);
		String [] operaciones={"operaciones","+","-","*","/"};
		lista=new JComboBox(operaciones);
		lista.setSelectedItem("");
		lista.setBounds(120, 100, 100, 30);
		add(lista);
		boton=new JButton("sumar");
		boton.setBounds(50, 100,100, 20);
		boton.addActionListener(this);
		add(boton);
		boton2=new JButton("");
		boton2.setBounds(200, 200, 70, 20);
		boton2.addActionListener(this);
		add(boton2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
				if (e.getSource()==boton) {
					System.out.println("boton 1 marcado");
					int a;
					a=Integer.parseInt(l1.getText())+Integer.parseInt(l2.getText());
					l3.setText(""+a);
					
					switch (lista.getSelectedIndex()) {
					case 0:
						
						break;

					default:
						break;
					}

				}
		
			}
}
