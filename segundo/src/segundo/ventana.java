package segundo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ventana extends JFrame implements ActionListener,KeyListener{
	JTextField nombre,apellido,numerodoc,estatura,icfes;
	TitledBorder borde;
	String [] operaciones={"Tipo de identificacion","Tarjeta de identidad","Cedeula"};
	String [] estudio={"nivel escolari","Primaria","bachiller","tecnico","profesiona"};
	JComboBox lista=new JComboBox(operaciones);
	JComboBox lista2=new JComboBox(estudio);
	JRadioButton b1,b2;
	JRadioButton soltero,casado;
	JRadioButton si,no;
	JLabel n;
	JButton confirmar;
	Validaciones vali= new Validaciones();
	ButtonGroup grupo = new ButtonGroup();
	ButtonGroup grupo2 = new ButtonGroup();
	ButtonGroup grupo3 = new ButtonGroup();
	public ventana() {
		setLayout(new FlowLayout());
		setBounds(400, 400, 800, 200);
		nombre= new JTextField(9);
		apellido= new JTextField(9);
		numerodoc= new JTextField(9);
		estatura= new JTextField(9);
		icfes= new JTextField(9);
		n= new JLabel("¿sabe nadar?");
		confirmar= new JButton("confirmar");
		ButtonGroup grupo = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		ButtonGroup grupo3 = new ButtonGroup();
		b1=new JRadioButton("Masculino");
		b2=new JRadioButton("Femenino");
		soltero= new JRadioButton("Soltero");
		casado= new JRadioButton("casado");
		si= new JRadioButton("si");
		no= new JRadioButton("no");
		grupo.add(b1);
		grupo.add(b2);
		grupo2.add(soltero);
		grupo2.add(casado);
		grupo3.add(si);
		grupo3.add(no);
		numerodoc.setBorder(bord("Numero de ide"));
		nombre.setBorder(bord("Nombre"));
		apellido.setBorder(bord("Apellido"));
		estatura.setBorder(bord("Estatura CM"));
		icfes.setBorder(bord("ICFS"));
		add(nombre);
		add(apellido);
		add(lista);
		add(numerodoc);
		add(b1);
		add(b2);
		add(lista2);
		add(casado);
		add(soltero);
		add(estatura);
		add(icfes);
		add(n);
		add(si);
		add(no);
		add(confirmar);
		nombre.addKeyListener(this);
		apellido.addKeyListener(this);
		confirmar.addActionListener(this);
		numerodoc.addKeyListener(this);
		estatura.addKeyListener(this);
		icfes.addKeyListener(this);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}
	@Override
	public void keyPressed(KeyEvent e) {

	}
	@Override
	public void keyReleased(KeyEvent e) {


	}
	@Override
	public void keyTyped(KeyEvent e) {
		vali.sololetras(e, nombre);
		vali.sololetras(e, apellido);
		vali.numeros(e, numerodoc);
		vali.numeros(e, estatura);
		vali.numeros(e, icfes);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==confirmar) {
			vali.vacio(nombre, "Nombre");
			vali.vacio(apellido, "Apellido");
			vali.vacio(numerodoc, "Numero de identificacion");
			if (vali.vacio(nombre, "Nombre")==true && vali.vacio(apellido, "Apellido")==true && 	vali.vacio(numerodoc, "Numero de identificacion")== true  ) {

				if (b1.isSelected()) {
					if (soltero.isSelected()) {
						if (si.isSelected()) {
							if (Integer.parseInt(estatura.getText())>165) {
								if (lista2.getSelectedIndex()!=1 && lista2.getSelectedIndex()!=0 ) {
									JOptionPane.showMessageDialog(null, "cumple requisitos");
								}
							}

						}
					}else {
						JOptionPane.showMessageDialog(null, "NO cumple requisitos");
					}
				}else {
					JOptionPane.showMessageDialog(null, "NO cumple requisitos");
				}

			}
		}else {

			JOptionPane.showMessageDialog(null, "NO cumple requisitos");
		}

	}
}
