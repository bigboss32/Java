package hilo_cuenta;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ActionListener{
	JButton boton1;
	JButton boton2;
	Hilo m ; 
 
	Ventana(){
		setLayout(new FlowLayout());
		boton1=new JButton("Generar ventana");
		boton2=new JButton("reinciar");
		
		boton1.addActionListener(this);
		
		boton2.addActionListener(this);

		add(boton1);
		add(boton2);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
 
	void tiempo(Hilo a,int b){
		a.a=b*1000;
	}
	 
	int a=0;
	@Override
	public void actionPerformed(ActionEvent e) {

		 if (e.getSource()==boton1) {
			 Ventana_conteo r = new Ventana_conteo();
			r.setVisible(true);
		}
		 if (e.getSource()==boton2) {
m.a=0;
		}
	}
	 
	}
	


