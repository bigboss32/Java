import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ChangeListener,ActionListener{
	String [] operaciones={"Clase","Tirador","Asesino","Mago","Caballero"};
	JComboBox lista=new JComboBox(operaciones);
	JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	JSlider slider3 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	JPanel panel1,panel2,panel3,panel4;
	JButton continuar,inicioturno;
	TitledBorder borde;
	JTextField Nombre;
	JTabbedPane pestañas;
	Clases p=new Clases();
	Clases x=new Clases();			
	int fuerza,agilidad,inteligencia;
	JLabel uno,dos,atriburos,ps,ps2;
	JTextArea q=new JTextArea(9,5); 

	public Ventana() {
		setTitle("Juego de rol");
		setBounds(400,400, 1300, 600);
		setLayout(new FlowLayout());
		continuar=new JButton("Continuar");
		inicioturno=new JButton("Inicio turno");
		Nombre=new JTextField(9);
		Nombre.setBorder(bord("Nombre"));
		pestañas=new JTabbedPane();
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		uno=new JLabel();
		dos=new JLabel();
		ps=new JLabel("100");
		ps2=new JLabel("100");
		barra(slider1, 100, 1);
		barra(slider2, 100, 1);
		barra(slider3, 100, 1);

		slider1.setBorder(bord("Agilidad"));
		slider2.setBorder(bord("Fuerza"));
		slider3.setBorder(bord("Inteligencia"));
		slider1.addChangeListener(this);
		slider2.addChangeListener(this);
		slider2.addChangeListener(this);
		continuar.addActionListener(this);
		inicioturno.addActionListener(this);
		panel1.add(lista);
		panel1.add(Nombre);
		panel1.add(slider1);
		panel1.add(slider2);
		panel1.add(slider3);
		panel1.add(continuar);
		panel2.add(panel3);
		panel2.add( panel4);
		pestañas.addTab("Personaje",panel1);
		add(pestañas);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	void barra(JSlider a,int mostra,int paso){
		a.setPaintTicks(true);
		a.setMajorTickSpacing(mostra);
		a.setMinorTickSpacing(paso);
		a.setPaintLabels(true);
		a.addChangeListener(this);
	}
	TitledBorder bord(String a){
		borde=BorderFactory.createTitledBorder(a);
		return borde;
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource()==slider1) {
			agilidad=slider1.getValue();
		}
		if (e.getSource()==slider2) {
			fuerza=slider2.getValue();
		}
		if (e.getSource()==slider3) {
			inteligencia=slider3.getValue();
		}
	}
	Clases m=x.heroeala("lucho");
	@Override
	public void actionPerformed(ActionEvent e) {
		p.Clases(Nombre.getText(), fuerza, agilidad, inteligencia);
		if (e.getSource()==continuar) {

			panel3.add(inicioturno);
			int j=x.heroeala();
			continuar.setEnabled(false);
		
			pestañas.addTab("Personaje",panel2);


			switch (lista.getSelectedIndex()) {
			case 1:
				uno.setIcon(new ImageIcon ( "1.jpg" ) ) ; 
				panel3.add(uno);
				atriburos=new JLabel(p.toString()+" ps="+ps.getText());
				panel3.add(atriburos);
				break;
			case 2:
				uno.setIcon(new ImageIcon ( "3.jpg" ) ) ; 
				panel3.add(uno);
				atriburos=new JLabel(p.toString()+" ps="+ps.getText());
				panel3.add(atriburos);
				break;
			case 3:
				uno.setIcon(new ImageIcon ( "4.jpg" ) ) ; 
				panel3.add(uno);
				atriburos=new JLabel(p.toString()+" ps="+ps.getText());
				panel3.add(atriburos);
				break;
			case 4:
				uno.setIcon(new ImageIcon ( "2.jpg" ) ) ; 
				panel2.add(uno);
				atriburos=new JLabel(p.toString()+" ps="+ps.getText());
				panel2.add(atriburos);
				break;
			default:
				break;
			}
			switch(j){
			case 1:
				dos.setIcon(new ImageIcon ( "1.jpg" ) ) ; 
				panel4.add(dos);
				atriburos=new JLabel(m.toString()+" ps="+ps2.getText());
				panel4.add(atriburos);
				break;
			case 2:
				dos.setIcon(new ImageIcon ( "3.jpg" ) ) ; 
				panel4.add(dos);
				atriburos=new JLabel(m.toString()+" ps="+ps2.getText());
				panel4.add(atriburos);
				break;
			case 3:
				dos.setIcon(new ImageIcon ( "4.jpg" ) ) ; 
				panel4.add(dos);
				atriburos=new JLabel(m.toString()+" ps="+ps2.getText());
				panel4.add(atriburos);
				break;
			case 4:
				dos.setIcon(new ImageIcon ( "2.jpg" ) ) ; 
				panel4.add(dos);
				atriburos=new JLabel(m.toString()+" ps="+ps2.getText());
				panel4.add(atriburos);
				break;
			default:
				break;
			}


		}	
		if (e.getSource()==inicioturno) {

			boolean bandera=true;
			String historial[]= new String[10];
			int a=100;
			int b=100;
			int	atque=(int)(p.agilidad*0.4),defenza=(int)(p.fuerza*0.2);
			int	atque2=(int)(x.agilidad*0.4),defenza2=(int)(x.fuerza*0.2);
			int turno=0;
			int toal1,toal2;
			toal1=atque2-defenza;
			toal2=atque-defenza2;
			while (a!=0 || b!=0) {
				turno++;
				System.out.println("Turno "+turno);
				if (bandera==true) {
					if (a<=0) {
						a=0;
						System.out.println("ganador "+Nombre.getText()); 
						break;
					
					}
				
					if (toal1<=0) {
						toal1=1;
					}
					a=a-(atque2);
					System.out.println("numero 1 "+ a);
					
					bandera=false;

				}
				if (bandera==false) {
					if (b<=0) {
						b=0;
						System.out.println("ganador lucho");
						break;
					}
					if (toal2<=0) {
						toal2=1;
					}
					b=b-(atque);
					System.out.println("numero 2 "+ b);
					bandera=true;
				}
			
			}
		
		}
	}
}









