import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ventana extends JFrame implements ActionListener{
	JButton boton1;
	JTextArea area;
	JScrollPane s;
	ListaSimple m= new ListaSimple();
	public ventana() {
	
		setLayout(new FlowLayout());
		boton1=new JButton("Generar Numero");
		boton1.addActionListener(this);
		add(boton1);
		area=new JTextArea(10,10);
		area.setEditable(false);
		s=new JScrollPane(area);
	
		add(s);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==boton1) {
			m.insertarCab(new Nodo(""+(int)(Math.random() *100 )));
			area.setText(m.toString());
			
		}

	}
}
