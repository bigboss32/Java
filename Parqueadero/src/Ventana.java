import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame{

	JLabel a[]=new JLabel[8];
	JLabel b[]=new JLabel[8];
	JPanel panel[]=new JPanel[8];
	JLabel tiempo[]=new JLabel[8];
	JLabel poscion[]=new JLabel[8];
	Auto w []= new Auto[8];
	JLabel timepotolta=new JLabel("Tiempo de ejecucion");
	JLabel noingresaron=new JLabel("vehiculos que no ingresaron: ");
	int y;
	JTextArea area;
	JScrollPane s;
	ListaSimple lista=new ListaSimple();
	
	public Ventana() {

		this.getContentPane().setBackground(new Color(81,209,246));
		setTitle("Parqueadero");
		setLayout(new GridBagLayout());
		GridBagConstraints conte= new GridBagConstraints();

		area=new JTextArea(10,10);
		area.setEditable(false);
		s=new JScrollPane(area);



		for (int i = 0; i < a.length; i++) {
			panel[i]=new JPanel();
			a[i]=new JLabel();
			b[i]=new JLabel();
			tiempo[i]=new JLabel("Tiempo:");
			poscion[i]=new JLabel("Baiha " +(i+1));
			b[i].setIcon(new ImageIcon("verde.png"));
			a[i].setIcon((new ImageIcon ("espacio.png")));
			add(poscion[i],layaut(i, 0, 1, 1, 1, 0));
			add(a[i],layaut(i, 1, 1, 1, 1, 0));
			add(b[i],layaut(i,2 , 1, 1, 1, 0));
			add(tiempo[i],layaut(i,3 , 1, 1, 1, 0));

		}
		add(timepotolta,layaut(0, 4, 0, 0, 0, 0));
		add(s,layaut(2, 9, 2, 0, 0, 0));
		add(noingresaron,layaut(5, 9, 0, 0, 0, 0));
		Tiempo k=new Tiempo(5000, true, timepotolta);
		Carros j= new Carros(w, a, b,tiempo,area,lista,noingresaron,y);

		j.start();
		k.start();



		pack();

		setLocationRelativeTo(null);
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


}
