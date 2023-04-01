import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Menuprincipal extends JFrame  {
	JTextArea historial;
	TitledBorder borde;
	JButton salir,registare,agregarv;
	JLabel entrada;
	JPanel pane;
	JTextField nombre,nit,numerodevehiculos,placa,tipo,numerointerno;

	public Menuprincipal() {
		setTitle("Menu Principal");
		setBounds(700, 700, 1000, 500);
		setLayout(new GridBagLayout());
		pane= new JPanel();
		salir= new JButton("Salir");
		nombre= new JTextField(9);
		nombre.setBorder(bord("Nombre"));
		nit= new JTextField(9);
		nit.setBorder(bord("Nit"));
		numerodevehiculos=new JTextField(9);
		numerodevehiculos.setBorder(bord("Numero de vehiculos"));
		registare= new JButton("Registrar empresa");
		agregarv= new JButton("Vehiculo");
		placa= new JTextField(9);
		placa.setBorder(bord("Placa"));
		tipo= new JTextField(9);
		tipo.setBorder(bord("Tipo"));
		numerointerno=new JTextField(9);
		numerointerno.setBorder(bord("Numero interno"));
		entrada= new JLabel();
		entrada.setIcon(new ImageIcon("1.png"));
		add(nombre,layaut(0, 0, 1, 1, 0, 0,true));
		add(numerodevehiculos,layaut(1, 0, 1, 1, 0, 0,true));
		add(nit,layaut(2, 0, 1, 1, 0, 0,true));
		add(registare,layaut(3, 1, 2, 1, 0, 0,false));




		add(salir,layaut(4,2, 2, 1, 0, 0,false));

		add(entrada,layaut(5,1, 0, 0, 0, 0,false));
		setVisible(false); 
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

