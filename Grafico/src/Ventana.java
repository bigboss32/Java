import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame  implements ActionListener{
	JButton inciar,limpiar;
	boolean a=false;
	public Ventana() {
		setLayout(new FlowLayout());
		setSize(800, 800);
		setLocationRelativeTo(null);
		setResizable(true);
		setTitle("PRIMER GRAFICO PINTADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inciar=new JButton("pintar");
		limpiar=new JButton("limpiar");
		add(inciar);
		add(limpiar);
		
		inciar.addActionListener(this);
		setVisible(true);

	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (a) {
			
				
				for (int i = 0; i < 5; i++) {
					g.drawOval((int)(Math.random()*500), (int)(Math.random()*500), 100, 100);
				}
			

		}

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==inciar) {
			a=true;
			repaint();
		}		
	}

}
