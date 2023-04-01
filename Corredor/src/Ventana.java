import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener {
	JButton inico;
	JTextArea area,area2,area3,area4;
	Contadoruno uno,dos,tres,cuatro;
	JLabel poscion,u,d,r,c;
	JPanel paneluno,paneldos,peneltres,panelcuatro;
	public Ventana() {
		setLayout(new FlowLayout());
		inico=new JButton("Inicio");
		area=new JTextArea(9,8);
		area2=new JTextArea(9,8);
		area3=new JTextArea(9,8);
		area4=new JTextArea(9,8);
		poscion=new JLabel();
		u=new JLabel();
		d=new JLabel();
		r=new JLabel();
		c=new JLabel();
		panelcuatro=new JPanel();
		peneltres=new JPanel();
		paneldos=new JPanel();
		paneluno=new JPanel();
		setTitle("Corredor");
		setBounds(400, 400, 500, 600);
		add(inico);
		paneluno.add(area);
		paneluno.add(u);
		paneldos.add(area2);
		paneldos.add(d);
		paneldos.add(area3);
		paneldos.add(r);
		paneldos.add(area4);
		paneldos.add(c);
		
		inico.addActionListener(this);
		uno=new Contadoruno(area,"carlos",u);
		dos=new Contadoruno(area2,"miguel",d);
		tres=new Contadoruno(area3,"david",r);
		cuatro=new Contadoruno(area4,"lucho",c);
	add(paneluno);
	add(paneldos);
	add(peneltres);
	add(panelcuatro);
		setVisible(true);


		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==inico) {
			uno.start();
			dos.start();
			tres.start();
			cuatro.start();

			System.out.println(uno.total);

		}



	}
}

