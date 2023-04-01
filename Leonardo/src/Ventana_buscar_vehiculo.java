import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana_buscar_vehiculo extends JFrame{
	JTextField Nit_empresa,nit_interno;
	JButton buscar,salir;
	TitledBorder borde;
	JLabel resulta;
	public Ventana_buscar_vehiculo() {
		setBounds(300, 300, 300, 300);
		setTitle("Buscar vehiculo");
		setLayout(new FlowLayout());
		Nit_empresa=new JTextField(9);
		nit_interno= new JTextField(9);
		nit_interno.setBorder(bord("Nit interno Veh"));
		Nit_empresa.setBorder(bord("Nit empresa"));
		resulta=new JLabel("                                             ");
		resulta.setBorder(bord("Busqueda"));
		salir= new JButton("Salir");
		buscar=new JButton("Buscar");
		resulta.setBorder(bord("Busqueda"));
		add(Nit_empresa);
		add(nit_interno);
		add(salir);
		add(buscar);
		add(resulta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}

}
