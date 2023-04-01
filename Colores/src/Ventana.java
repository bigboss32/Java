import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame implements ActionListener{
	JButton boton,boton2,boton3;
	String [] colores={"verde","amarrillo","rojo"};
	JComboBox lista=new JComboBox(colores);
	JRadioButton b1,b2,b3,b4;
	JLabel L1;
	JPanel l1;
	


	public Ventana(){

		setLayout(new GridLayout(3, 1,2,1));
		setTitle("colores");
		setBounds(400, 400, 500, 400);
		l1=new JPanel();
		L1=new JLabel("");
		ButtonGroup grupo = new ButtonGroup();
		b1=new JRadioButton("verde");
		b2=new JRadioButton("rojo");
		b3=new JRadioButton("amarrilo");
		b4=new JRadioButton("azar");
		grupo.add(b1);
		grupo.add(b2);
		grupo.add(b3);
		grupo.add(b4);
	

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		//		lista.addActionListener(this);
		//		add(lista);
		boton=new JButton("");
		boton2=new JButton("");
		add(boton);
		add(l1);
		l1.add(L1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//		if (e.getSource()==lista) {
		//			switch (lista.getSelectedIndex()) {
		//			case 0:
		//				boton.setBackground(Color.GREEN);
		//				break;
		//			case 1:
		//				boton.setBackground(Color.yellow);
		//				break;
		//			case 2:
		//				boton.setBackground(Color.RED);
		//				break;
		//			default:
		//				
		//				break;
		//			}
		if (b1.isSelected()==true) {
			boton.setBackground(Color.GREEN);

		}

		if (b2.isSelected()==true) {
			boton.setBackground(Color.yellow);
		}
		if (b3.isSelected()==true) {
			boton.setBackground(Color.RED);
		}
		if (b4.isSelected()==true) {
			int a=(int)(Math.random() *255 ) ;
			int b=(int)(Math.random() *255 ) ;
			int c=(int)(Math.random() *255 ) ;
			L1.setText("R= "+a+" G=  "+b+" B= "+c);

			l1.setBackground(new Color(a,b,c));
		}

	}

}

