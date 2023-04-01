import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener{
	JPanel paneluno,paneldos;
	JTextField Nodos,Datos;
	JButton iniciar,ingresar,detener;
	TitledBorder borde;
	LienzoParaArrastrarFiguras c = new LienzoParaArrastrarFiguras( );
	JLabel titulo,im;
	int salir=0;
	
	
	public Ventana() {
		setTitle("Lista Doblemente Enlazada");
		setLayout(new GridBagLayout());

		this.getContentPane().setBackground(new Color(0,0,0));
		paneldos= new JPanel();
		Nodos = new JTextField(11);
		Nodos.setText("0");

		iniciar= new JButton("Iniciar");
		detener= new JButton("Detener");
		titulo=new JLabel("Lista doblemente enlazadas");
		im= new JLabel();
		im.setIcon(new ImageIcon("gi.gif"));
		titulo.setFont( new Font("Arial Black",0,18));
		titulo.setForeground(Color.WHITE);
		Nodos.setBorder(bord("Cantidad de Nodos"));

		add(c,layaut(0, 0, 1, 1, 1, 1));

		paneldos.add(Nodos,layaut(0, 0, 0, 0, 0,0));
		paneldos.add(iniciar,layaut(0, 0, 0, 0, 0, 0));
		paneldos.add(detener,layaut(1, 0, 0, 0, 0, 0));
		//		add(paneluno,layaut(0, 0, 1, 1, 4, 4));
		//		paneluno.setBackground(new Color(81,209,246));
		add(titulo,layaut(1, 0, 0, 0, 0, 0));
		add(im,layaut(1, 0, 0, 0, 0, 0));
		add(paneldos,layaut(0, 1, 1, 1, 1, 0));
		paneldos.setBackground(new Color(0,0,0));


		
		detener.addActionListener(this);
		iniciar.addActionListener(this);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	GridBagConstraints layaut(int x,int y,int anchura,int altura,int anchurax,int alturay){
		GridBagConstraints conte=new GridBagConstraints();
		conte.insets=new Insets(0, 20, 0, 0);
		conte.gridx=x;
		conte.gridy=y;
		conte.gridwidth=anchura;
		conte.gridheight=altura;
		conte.weightx=anchurax;
		conte.weighty=alturay;
		conte.fill= GridBagConstraints.BOTH;
		return conte;
	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (Integer.parseInt(Nodos.getText())<c.poscion.length) {
			if (e.getSource()==iniciar) {
				int x,y,r,g,b;
				for (int i = 0; i < Integer.parseInt(Nodos.getText()); i++) {
					x=(int)(Math.random()*200+1);
					y=(int)(Math.random()*500+1);
					r=(int)(Math.random()*255);
					g=(int)(Math.random()*255);
					b=(int)(Math.random()*255);
					c.addFigura(new Rectangulo(300,100, 50, 50,new Color(r, g, b),""+ x));
					setVisible(false);
					setVisible(true);
				}
			}
			if (e.getSource()==detener) {
				c.publi(false);
				salir++;
				im.setIcon(new ImageIcon("detenida.jpg"));
				if (salir==2) {
					im.setIcon(new ImageIcon("gi.gif"));
					c.publi(true);
					salir=0;
				}
			}
		}
		


	}

}
