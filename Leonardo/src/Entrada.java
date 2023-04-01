import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Entrada extends JFrame {
	JTextArea historial;
	TitledBorder borde;
	JButton salir,buscarve,actualiza,zona,imprimir,menuprinci;
	JLabel entrada;
	JPanel pane;
	public Entrada() {
		setTitle("Entradas");
		setBounds(700, 700, 1300, 750);
		setLayout(new GridBagLayout());
		this.getContentPane().setBackground(new Color(81,134,246));
		entrada=new JLabel();
		 
		pane= new JPanel();
		historial=new JTextArea(5,5);
		historial.setBorder(bord("Historial"));
		salir= new JButton("Salir");
		buscarve= new JButton("Buscar vehiculo");
		actualiza= new JButton("Actualizar");
		zona= new JButton("Parqueadero");
		imprimir= new JButton("registrar");
		menuprinci= new JButton("Menu principal");
		entrada= new JLabel();
	 
		pane.setBackground(Color.BLACK);
		entrada.setIcon( new ImageIcon("2.jpg"));
		add( historial,layaut(3, 1, 1, 1, 0, 0, true));
	 
		pane.add(buscarve,layaut(4, 1, 2, 1, 0, 0,false));
		pane.add(actualiza,layaut(3, 1, 2, 1, 0, 0,false));
		pane.add(zona,layaut(2, 1, 1, 1, 2, 0,false));
		pane.add(imprimir,layaut(0, 1, 1, 2, 0, 0,false));
		add(pane,layaut(0,0, 1, 1, 0, 0, true));
		
		
		add(salir,layaut(0, 1, 1, 0, 0, 0,false));
		add(menuprinci,layaut(0, 2, 1, 0, 0, 0,false));
	
		add(entrada,layaut(0, 0, 0, 0, 0, 0, false));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}
	GridBagConstraints layaut(int x,int y,int anchura,int altura,int anchurax,int alturay,boolean a){
		GridBagConstraints conte=new GridBagConstraints();
		conte.insets=new Insets(10, 20, 10, 20);
		conte.gridx=x;
		conte.gridy=y;
		conte.gridwidth=anchura;
		conte.gridheight=altura;
		conte.weightx=anchurax;
		conte.weighty=alturay;
		if (a) {
			conte.fill= GridBagConstraints.BOTH;

		}else{

		}
		return conte;
	}
}
