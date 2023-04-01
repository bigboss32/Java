import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener,KeyListener{
	Validacion l=new Validacion();
	JTextField nombre,segundo,apellido,segunape,ide,celular;
	JPanel panel1,panel2,panel3,panel4;
	TitledBorder borde;
	JButton validar,limpiar;
	JRadioButton h,m;
	String [] colores={"Cedula ","Tarjeta de identidad","Cedula extrajera"};
	JComboBox lista=new JComboBox(colores);
	public Ventana() {
		setTitle("formato");
		setLayout(new GridBagLayout());
		GridBagConstraints conte= new GridBagConstraints();
		validar=new JButton("Validar");
		limpiar=new JButton("Limpiar");
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel1.setBackground(Color.BLACK);
		panel2.setBackground(Color.BLACK);
		panel3.setBackground(Color.BLACK);
		panel4.setBackground(Color.BLACK);
		nombre=new JTextField(9);
		segundo=new JTextField(9);
		apellido=new JTextField(9);
		segunape=new JTextField(9);
		ide=new JTextField(9);
		celular=new JTextField(9);
		h=new JRadioButton("Masculino");
		m=new JRadioButton("Femenino");
		borde=BorderFactory.createTitledBorder("Nombre");
		nombre.setBorder(borde);
		borde=BorderFactory.createTitledBorder("Segundo N");
		segundo.setBorder(borde);
		borde=BorderFactory.createTitledBorder("Apellido");
		apellido.setBorder(borde);
		borde=BorderFactory.createTitledBorder("Segundo A");
		segunape.setBorder(borde);
		borde=BorderFactory.createTitledBorder("Numero de ide");
		ide.setBorder(borde);
		borde=BorderFactory.createTitledBorder("Celular");
		celular.setBorder(borde);
		panel1.add(nombre);
		panel1.add(segundo);
		panel1.add(apellido);
		panel1.add(segunape);
		panel2.add(validar);
		panel2.add(limpiar);
		panel3.add(h);
		panel3.add(m);
		panel3.add(celular);
		panel4.add(lista);
		panel4.add(ide);
		conte.gridx=2;
		conte.gridy=0;
		conte.gridwidth=1;
		conte.gridheight=1;
		conte.weightx=1.0;
		conte.weighty=1.0;
		conte.fill= GridBagConstraints.BOTH;
		add(panel1,conte);
		conte.gridx=0;
		conte.gridy=0;
		conte.gridwidth=1;
		conte.gridheight=2;
		conte.weightx=1.0;
		conte.weighty=1.0;
		conte.fill= GridBagConstraints.BOTH;
		add(panel2,conte);
		conte.gridx=2;
		conte.gridy=1;
		conte.gridwidth=1;
		conte.gridheight=0;
		conte.weightx=1.0;
		conte.weighty=1.0;
		conte.fill= GridBagConstraints.BOTH;
		add(panel3,conte);
		conte.gridx=1;
		conte.gridy=0;
		conte.gridwidth=1;
		conte.gridheight=2;
		conte.weightx=1.0;
		conte.weighty=1.0;
		conte.fill= GridBagConstraints.BOTH;
		add(panel4,conte);
		validar.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==validar) {
			l.isvacio(nombre);
			l.isvacio(apellido);
		}

	}
}
