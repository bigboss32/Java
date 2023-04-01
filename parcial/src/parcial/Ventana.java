package parcial;

 
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

 

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Apellido;
	JButton btn1;
	private JTextField Fecha;
	private JLabel fecha2;
	private JTextField identificac;
	private JLabel Idet2;
	JComboBox genero;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nombre = new JTextField();
		Nombre.setBounds(29, 34, 86, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(29, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		Apellido = new JTextField();
		Apellido.setBounds(29, 87, 86, 20);
		contentPane.add(Apellido);
		Apellido.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(27, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		 btn1 = new JButton("Registar");
		btn1.setBounds(29, 171, 89, 23);
		contentPane.add(btn1);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(29, 205, 89, 23);
		contentPane.add(btnNewButton_1);
		
		 genero = new JComboBox();
		genero.setModel(new DefaultComboBoxModel(new String[] {"Genero", "Femenino", "Masculino"}));
		genero.setBounds(29, 133, 86, 22);
		contentPane.add(genero);
		
		Fecha = new JTextField();
		Fecha.setBounds(140, 34, 86, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		fecha2 = new JLabel("Fecha");
		fecha2.setBounds(140, 11, 46, 14);
		contentPane.add(fecha2);
		
		identificac = new JTextField();
		identificac.setBounds(140, 87, 86, 20);
		contentPane.add(identificac);
		identificac.setColumns(10);
		
		Idet2 = new JLabel("Idetificacion");
		Idet2.setBounds(140, 65, 86, 14);
		contentPane.add(Idet2);
		btn1.addActionListener(this);
		identificac.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
		Estudiante a = new Estudiante(Nombre.getText(),Apellido.getText(), Fecha.getText(),genero.getSelectedIndex(),Integer.parseInt((identificac.getText())));
		System.out.println(a.toString());
		Ruleta f = new Ruleta();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		setVisible(false);
		}
		
		
	}
}
