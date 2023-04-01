import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener,KeyListener{
	JTextField usuario,contra;
	JLabel login;
	JButton inciar;
	TitledBorder borde;
	JPanel paneluno;
	String [] operaciones={"Seleccion        ","Entradas","Salidas"};
	JComboBox lista=new JComboBox(operaciones);
	Entrada ente = new Entrada();
	Salida sali= new Salida();
	Menuprincipal menu= new Menuprincipal();
	Ventana_buscar_vehiculo ven= new Ventana_buscar_vehiculo();
	Metodos metodo= new Metodos();
	Empresa empre[]= new Empresa[10];
	Ventana_actualizar_vehiculo vena= new Ventana_actualizar_vehiculo();
	parqueadero er= new parqueadero();
	int y=0,u=0,p,r=0,z=0;
	String salida="",entrda="";
	String par;

	Validaciones vali= new Validaciones();
	Ventana_registro ben= new Ventana_registro();
	public Ventana() {
		menu.setLocationRelativeTo(null);
		menu.placa.setEditable(false);
		menu.tipo.setEditable(false);
		menu.numerointerno.setEditable(false);
		sali.actualiza.setEnabled(false);
		sali.buscarve.setEnabled(false);
		sali.zona.setEnabled(false);
		sali.imprimir.setEnabled(false);
		ente.actualiza.setEnabled(false);
		ente.zona.setEnabled(false);
		ente.buscarve.setEnabled(false);
		ente.imprimir.setEnabled(false);
		ven.Nit_empresa.addKeyListener(this);
		ven.nit_interno.addKeyListener(this);
		vena.Nit_empresa.addKeyListener(this);
		vena.nit_interno.addKeyListener(this);
		vena.numerointer.addKeyListener(this);
		vena.placa.addKeyListener(this);
		vena.tipo.addKeyListener(this);
		setTitle("Proyecto");

		setBounds(700, 700, 650, 500);
		setLayout(new GridBagLayout());
		this.getContentPane().setBackground(new Color(81,134,246));
		login= new JLabel();
		inciar= new JButton("Inciar");
		usuario= new JTextField(10);
		contra= new JTextField(10);
		paneluno= new JPanel();
		contra.setBorder(bord("Contraseña"));
		lista.setBorder(bord("Usuario"));
		login.setIcon(new ImageIcon("1.png"));
		add(login,layaut(0,0,0,1,1,0));
		add(lista,layaut(0,1,0,1,1,0));
		add(contra,layaut(0,2,0,1,1,0));
		add(inciar,layaut(0,3,0,0,0,0));
		menu.add(menu.placa,menu.layaut(0, 2, 1, 0, 0, 0, false));
		menu.add(menu.tipo,menu.layaut(1, 2, 1, 0, 0, 0, false));
		menu.add(menu.numerointerno,menu.layaut(2, 2, 1, 0, 0, 0, false));
		menu.add(menu.agregarv,menu.layaut(3, 2, 1, 0, 0, 0, false));
		sali.historial.setEditable(false);
		ente.historial.setEditable(false);
		menu.agregarv.setEnabled(false);
		lista.addActionListener(this);
		inciar.addActionListener(this);
		ente.salir.addActionListener(this);
		ente.menuprinci.addActionListener(this);
		sali.salir.addActionListener(this);
		sali.menuprinci.addActionListener(this);
		menu.registare.addActionListener(this);
		menu.agregarv.addActionListener(this);
		menu.salir.addActionListener(this);
		ente.buscarve.addActionListener(this);
		sali.buscarve.addActionListener(this);
		ven.salir.addActionListener(this);
		ven.buscar.addActionListener(this);
		ente.actualiza.addActionListener(this);
		sali.actualiza.addActionListener(this);
		vena.salir.addActionListener(this);
		vena.buscar.addActionListener(this);
		ente.zona.addActionListener(this);
		sali.zona.addActionListener(this);
		er.salir.addActionListener(this);
		er.setLocationRelativeTo(null);
		er.tu.setEditable(false);
		menu.nombre.addKeyListener(this);
		menu.nit.addKeyListener(this);
		menu.numerodevehiculos.addKeyListener(this);
		menu.numerointerno.addKeyListener(this);
		ente.imprimir.addActionListener(this);
		sali.imprimir.addActionListener(this);
		ben.Nit_empresa.addKeyListener(this);
		ben.nit_interno.addKeyListener(this);
		ben.salir.addActionListener(this);
		ben.buscar.addActionListener(this);
		


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}
	GridBagConstraints layaut(int x,int y,int anchura,int altura,int anchurax,int alturay){
		GridBagConstraints conte=new GridBagConstraints();
		conte.insets=new Insets(10, 200, 0, 200);
		conte.gridx=x;
		conte.gridy=y;
		conte.gridwidth=anchura;
		conte.gridheight=altura;
		conte.weightx=anchurax;
		conte.weighty=alturay;
		//		conte.fill= GridBagConstraints.BOTH;
		return conte;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==inciar) {
			if (contra.getText().equals("123")) {
				switch (lista.getSelectedIndex()) {
				case 1:
					ente.setLocationRelativeTo(null);
					ente.setVisible(true);
					setVisible(false);
					break;
				case 2:
					sali.setLocationRelativeTo(null);
					sali.setVisible(true);
					setVisible(false);
					break;
				case 3:
					menu.setLocationRelativeTo(null);
					menu.setVisible(true);
					setVisible(false);
					break;
				default:
					break;
				}
			}
		}	
		try {
			if (e.getSource()==menu.registare) {
				vali.vacio(menu.nombre,"Nombre" );
				vali.vacio(menu.nit,"Nit" );
				vali.vacio(menu.numerodevehiculos,"Numero de vehiculos" );
				Empresa n= new Empresa(menu.nombre.getText(), Integer.parseInt(menu.nit.getText()), 
						Integer.parseInt(menu.numerodevehiculos.getText()));
				p= Integer.parseInt(menu.nit.getText());
				menu.agregarv.setEnabled(true);
				menu.placa.setEditable(true);
				menu.tipo.setEditable(true);
				menu.numerointerno.setEditable(true);
				sali.actualiza.setEnabled(true);
				sali.buscarve.setEnabled(true);
				sali.zona.setEnabled(true);
				sali.imprimir.setEnabled(true);
				ente.actualiza.setEnabled(true);
				ente.zona.setEnabled(true);
				ente.buscarve.setEnabled(true);
				ente.imprimir.setEnabled(true);
				for (int i = 0; i < empre.length; i++) {
					if (empre[i]==null) {
						empre[i]=n;
						r++;
						break;
					}
				}
				menu.setVisible(false);
				menu.setVisible(true);
				System.out.println(Arrays.toString(empre));
			}
		} catch (Exception e2) {

		}
		if (e.getSource()== menu.agregarv) {
			try {
				for (int i = 0; i < empre.length; i++) {
					if (empre[i]==null) {
					}else {
						if (empre[i].nit== p) {
							empre[i].lista.agregarPrincipio(new Nodo(new Vehiculo(menu.placa.getText(), menu.tipo.getText(), Integer.parseInt(menu.numerointerno.getText()))));
							y++;
							if (y>=empre[i].numerodevehiculos) {
								y=0;
								menu.agregarv.setEnabled(false);
							}
						}
					}
				}
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		if (e.getSource()==ente.salir) {
			setVisible(true);
			ente.setVisible(false);
		}
		if (e.getSource()==ente.menuprinci) {
			menu.setVisible(true);
			ente.setVisible(false);
			u=1;
		}
		if (e.getSource()==sali.salir) {
			setVisible(true);
			sali.setVisible(false);
		}
		if (e.getSource()==sali.menuprinci) {
			menu.setVisible(true);
			sali.setVisible(false);
			u=2;
		}
		if (e.getSource()==menu.salir) {
			menu.setVisible(false);
			menu.numerointerno.setText("");
			menu.nombre.setText("");
			menu.nit.setText("");
			menu.placa.setText("");
			menu.tipo.setText("");
			menu.numerodevehiculos.setText("");

			if (u==1) {
				ente.setVisible(true);
				u=0;
			}
			if (u==2) {
				u=0;
				sali.setVisible(true);
			}
		}
		if (e.getSource()==sali.buscarve || e.getSource()==ente.buscarve) {
			ven.setVisible(true);
		}
		if (e.getSource()==ven.salir) {
			ven.setVisible(false);
			ven.Nit_empresa.setText("");
			ven.nit_interno.setText("");
			ven.resulta.setText("");

			ven.resulta.setText("                                   ");
			ven.resulta.setBorder(bord("Busqueda"));

		}
		if (e.getSource()==ven.buscar) {
			try {
				ven.resulta.setText(metodo.buscarvehiculo(Integer.parseInt(ven.Nit_empresa.getText()), Integer.parseInt(ven.nit_interno.getText()), empre));

			} catch (Exception e2) {

			}
		}
		if (e.getSource()==ente.actualiza || e.getSource()==sali.actualiza) {
			vena.setVisible(true);
		}
		if (e.getSource()==vena.salir) {
			vena.setVisible(false);
			vena.nit_interno.setText("");
			vena.numerointer.setText("");
			vena.tipo.setText("");
			vena.placa.setText("");
			vena.Nit_empresa.setText("");
			vena.resulta.setText("");
			vena.resulta.setText("                                             ");

			vena.resulta.setBorder(bord("Busqueda"));

		}
		if (e.getSource()==vena.buscar) {

			vena.resulta.setText(metodo.actualizarvehiculo(Integer.parseInt(vena.Nit_empresa.getText()), Integer.parseInt(vena.nit_interno.getText())
					, vena.placa.getText(), vena.tipo.getText(), empre));
		}

		if (e.getSource()==sali.zona) {
			System.out.println("hola");	
			er.setVisible(true);

		}
		if (e.getSource()==ente.zona) {
			System.out.println("hola");
			er.setVisible(true);
		}
		if (e.getSource()==er.salir) {
			er.setVisible(false);
		}
		if (e.getSource()==ente.zona || e.getSource()==sali.zona) {
			par="";
			for (int i = 0; i < empre.length; i++) {

				if (empre[i]==null) {

				}else{
					par+=empre[i].lista.parqueadero();
					er.tu.setText(par);

				}
			}
		}

		if (e.getSource()==ente.imprimir ) {
			z=1;
			ben.setVisible(true);
		}
		if (e.getSource()== sali.imprimir) {
			z=2;
			ben.setVisible(true);
		}
		if (e.getSource()== ben.buscar) {


			if (z==1) {
				entrda+="\n"+metodo.entradaysalida(Integer.parseInt(ben.Nit_empresa.getText()), Integer.parseInt(ben.nit_interno.getText()),false,empre);
				ente.historial.setText(entrda);
			}
			if (z==2) {
				metodo.entradaysalida(Integer.parseInt(ben.Nit_empresa.getText()), Integer.parseInt(ben.nit_interno.getText()),true,empre);
				salida+="\n"+metodo.entradaysalida(Integer.parseInt(ben.Nit_empresa.getText()), Integer.parseInt(ben.nit_interno.getText()),false,empre);
				sali.historial.setText(salida);
			}
		}
		if (e.getSource()==ben.salir) {
			ben.setVisible(false);
			ben.Nit_empresa.setText("");
			ben.nit_interno.setText("");
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
		vali.sololetras(e, menu.nombre);
		vali.numeros(e, menu.nit);
		vali.numeros(e, menu.numerodevehiculos);
		vali.numeros(e, menu.numerointerno);
		vali.numeros(e, ven.Nit_empresa);
		vali.numeros(e, ven.nit_interno);
		vali.numeros(e, vena.Nit_empresa);
		vali.numeros(e, vena.nit_interno);
		vali.numeros(e, vena.numerointer);
		vali.numeros(e, ben.Nit_empresa);
		vali.numeros(e, ben.nit_interno);
	}

}



