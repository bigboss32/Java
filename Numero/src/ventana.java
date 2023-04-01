import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.concurrent.ThreadLocalRandom;
public class ventana extends JFrame implements ActionListener {
	JTextField ranuno,randos,entrada;
	JLabel uno,dos,tres,info;
	JButton boton,generar,continuar,finalizar;
	int a,errores=0;
	boolean bandera=true;
	ListaSimple lista = new ListaSimple();
	ventana(){

		setLayout(new FlowLayout());
		setBounds(300, 300, 100, 300);
		ranuno=new JTextField(9);
		uno=new JLabel("minimo");
		dos=new JLabel("maximo");
		tres=new JLabel("adivina");
		randos=new JTextField(9);
		boton= new JButton("Ingresar");
		generar=new JButton("Probar");
		continuar=new JButton("continuar");
		finalizar=new JButton("Finalizar");
		entrada=new JTextField(9);
		info=new JLabel("");
		add(uno);
		add(ranuno);
		add(dos);
		add(randos);
		continuar.addActionListener(this);
		boton.addActionListener(this);
		generar.addActionListener(this);
		finalizar.addActionListener(this);
		add(boton);
		add(tres);
		tres.setVisible(false);
		entrada.setVisible(false);
		add(entrada);
		generar.setVisible(false);
		add(generar);
		add(info);
		continuar.setVisible(false);
		add(continuar);
		finalizar.setVisible(false);
		add(finalizar);
		setVisible(true);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bandera=true;
		if (e.getSource()==boton) {  

			try {
				a=ThreadLocalRandom.current().nextInt(Integer.parseInt(ranuno.getText()), Integer.parseInt(randos.getText()) + 1);

				if (bandera) {
					lista.insertarCab(new Nodo(a));
					tres.setVisible(true);
					entrada.setVisible(true);
					generar.setVisible(true);
					ranuno.setEditable(false);
					randos.setEditable(false);
					boton.setEnabled(false);
					System.out.println(a);
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				bandera=false;
				errores++;
			}



		}
		if (e.getSource()==generar) {
			info.setVisible(true);
			try {
				if (Integer.parseInt(entrada.getText())>a) {
					info.setText("Mas poco");
				}else{
					if (Integer.parseInt(entrada.getText())<a){
						info.setText("Mas");
					}else{
						info.setText("exacto");
						continuar.setVisible(true);
						finalizar.setVisible(true);
					}
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				errores++;
			}

		}
		if (e.getSource()==continuar) {
			ranuno.setEditable(true);
			randos.setEditable(true);
			ranuno.setText("");
			randos.setText("");
			tres.setVisible(false);
			entrada.setVisible(false);
			generar.setVisible(false);
			info.setVisible(false);
			continuar.setVisible(false);
			finalizar.setVisible(false);
			boton.setEnabled(true);
			entrada.setText("");

		}
		if (e.getSource()==finalizar) {
			ranuno.setVisible(false);
			randos.setVisible(false);
			tres.setVisible(false);
			entrada.setVisible(false);
			generar.setVisible(false);

			continuar.setVisible(false);
			finalizar.setVisible(false);
			boton.setVisible(false);;
			uno.setText("Numero de errores =");
			tres.setText(""+errores);
			dos.setText("numero generados =");
			info.setText(lista.toString());

		}


	}

}
