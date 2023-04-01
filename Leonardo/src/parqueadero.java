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
import javax.swing.border.TitledBorder;

public class parqueadero extends JFrame {
	JTextArea tu;
	TitledBorder borde;
	JButton salir,buscarve,actualiza,zona,imprimir,menuprinci;
	JLabel entrada;
	JPanel pane;
	public parqueadero() {
		setTitle("Salidas");
		setBounds(700, 700, 500, 500);
		setLayout(new GridBagLayout());
		this.getContentPane().setBackground(new Color(81,134,246));
		entrada=new JLabel();
		entrada.setIcon(new ImageIcon("gif2.gif"));
		pane= new JPanel();
		tu=new JTextArea(20,20);
		tu.setBorder(bord("Parqueadero"));
		salir= new JButton("Salir");
		buscarve= new JButton("Buscar vehiculo");
	
		entrada= new JLabel();
		entrada.setIcon( new ImageIcon("3.jpg"));
		pane.setBackground(Color.BLACK);

		

//		pane.add(zona,layaut(2, 1, 1, 1, 2, 0,false));
		//	pane.add(imprimir,layaut(0, 1, 1, 2, 0, 0,false));
		 
		add( tu,layaut(3, 1, 1, 1, 4, 4, true));
		add(salir,layaut(1, 1, 1, 0, 0, 0,false));
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
	}}

