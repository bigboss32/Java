import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana_actualizar_vehiculo extends JFrame{
	JTextField Nit_empresa,nit_interno,placa,tipo,numerointer;
	JButton buscar,salir;
	TitledBorder borde;
	JLabel resulta;
	public Ventana_actualizar_vehiculo() {
		setBounds(300, 300, 500, 300);
		setTitle("Actualizar vehiculo");
		setLayout(new FlowLayout());
		Nit_empresa=new JTextField(9);
		nit_interno= new JTextField(9);
		placa=new JTextField(9);
		tipo= new JTextField(9);
		numerointer= new JTextField(9);
		nit_interno.setBorder(bord("Nit interno Veh"));
		Nit_empresa.setBorder(bord("Nit empresa"));
		placa.setBorder(bord("Placa N"));
		tipo.setBorder(bord("Tipo N"));
		resulta=new JLabel("                                             ");
		resulta.setBorder(bord("Busqueda"));
		numerointer.setBorder(bord("Numero N"));
		salir= new JButton("Salir");
		buscar=new JButton("Actualizar");
		add(Nit_empresa);
		add(nit_interno);
//		add(numerointer);
		add(tipo);
		add(placa);
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
