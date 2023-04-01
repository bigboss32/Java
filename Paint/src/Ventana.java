import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Ventana extends JFrame implements ActionListener{

	JButton pintar;
	boolean a=false;

	Ventana(){

		setLayout(null);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(true);
		setTitle("PRIMER GRAFICO PINTADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pintar=new JButton("pintar");
		pintar.setBounds(300, 400, 200,200);
		add(pintar);
		pintar.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		if (a) {
			g.drawRect(400, 250, 50, 50);
			g.fillOval(300, 100, 50, 50);
			g.setColor(Color.yellow);
			g.fillOval(500, 100, 100, 100);
			g.setColor(Color.red);
			g.drawString("CARITA", 600, 350);
			g.drawLine(700, 400, 200, 350);
			g.drawOval(150, 50, 600, 600);
		}

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==pintar) {
			a=true;
			repaint();
		}		
	}

}


