package nata;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import segundo.Validaciones;

public class ventana extends JFrame implements ActionListener,KeyListener{
	JTextField r,g,b;
	JPanel panel,paneldos;
	JButton bonton;
	TitledBorder borde;
	Validaciones nata= new Validaciones();
	Mensage m= new Mensage();

	public ventana() {
		setBounds(400, 400, 400, 400);
		
		setLayout(new FlowLayout());
		r= new JTextField(9);	
		g= new JTextField(9);
		b= new JTextField(9);
		panel=new JPanel();
		paneldos= new JPanel();
		bonton=new JButton("enviar");
		panel.add(r);
		panel.add(g);
		panel.add(b);
		r.setBorder(bord("R"));
		g.setBorder(bord("G"));
		b.setBorder(bord("B"));
		r.addKeyListener(this);
		g.addKeyListener(this);
		b.addKeyListener(this);
		add(panel);
		add(bonton);
		bonton.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bonton) {
			nata.vacio(r, "R");
			nata.vacio(g, "G");
			nata.vacio(b, "B");
			try {
				this.getContentPane().setBackground(new Color(Integer.parseInt(r.getText()),Integer.parseInt(g.getText()),Integer.parseInt(b.getText())));
				
			} catch (Exception s) {
				System.out.println("error");
				m.setVisible(true);
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		nata.numeros(e, r);
		nata.numeros(e, g);
		nata.numeros(e, b);
		
	}
}
