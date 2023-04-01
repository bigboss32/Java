import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class Ventana extends JFrame implements KeyListener ,ActionListener{

	String [] operaciones={"Generos","infantil","Romántico","Acción","Terror","	 Drama"};
	JComboBox lista=new JComboBox(operaciones);
	TitledBorder borde;
	JTextField nombre,apellido;
	JFormattedTextField formato;
	MaskFormatter formatter;
	JPanel panel1;
	Validaciones m=new Validaciones();
	JButton confirmar;
	String a="Nombre",b="Apellido";
	int r=10000;
	Sus y=new Sus();
	public Ventana()  {
		setTitle("REGISTRO AFILIADO - TV CABLE");
		setBounds(400, 500, 400, 400);
		setLayout(new FlowLayout());
		confirmar=new JButton("confirmar");
		panel1=new JPanel();
		nombre=new JTextField(9);
		nombre.setBorder(bord("Nombre"));
		apellido=new JTextField(9);
		apellido.setBorder(bord("Apellido"));
		try {
			formatter = new MaskFormatter("UUUU-##-LL");
			formato = new JFormattedTextField(formatter);
			formato.setColumns(10);
			add(formato);
		} catch (Exception e) {
			System.out.println("error");
		}
		
		add(confirmar);
		panel1.setLayout(new GridLayout(8,3));
		panel1.add(nombre);
		panel1.add(apellido);
		panel1.add(lista);
		add(panel1);
		nombre.addKeyListener(this);
		apellido.addKeyListener(this);
		confirmar.addActionListener(this);
		y.confirmar.addActionListener(this);


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
		m.sololetras(e, nombre);
		m.sololetras(e, apellido);
		m.primeraletramayuscula(e, apellido);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==confirmar) {
		boolean c=m.vacio(nombre,a); 
		boolean x=m.vacio(apellido, b);
			if (c==true && x== true) {
				y.setVisible(true);
				y.setLocationRelativeTo(null);
			}
		}
		if (e.getSource()==y.confirmar) {
			if (y.slider1.getValue()<=20 && y.slider2.getValue()<=2 ) {
				y.tv.setText("valor basico "+r);
			}else{
				if (y.slider1.getValue()<=50 ) {
					y.tv.setText("valor basico "+(5000+r+(y.slider2.getValue()*2000)));
				}else{
					if (y.slider1.getValue()<=100 ) {
						y.tv.setText("valor basico "+(10000+r+(y.slider2.getValue()*2000)));
					}
				}
			}
		}
		
	}

}


