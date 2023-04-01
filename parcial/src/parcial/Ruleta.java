package parcial;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ruleta extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton pregunta;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ruleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Ruleta.class.getResource("/parcial/ruleta.gif")));
		lblNewLabel.setBounds(10, 11, 214, 220);
		contentPane.add(lblNewLabel);
		
		JButton pregunta = new JButton("Pregunta");
		pregunta.setBounds(360, 38, 89, 23);
		contentPane.add(pregunta);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(360, 72, 89, 23);
		contentPane.add(btnNewButton_1);
		pregunta.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==pregunta) {
			
		}
		
	}

}
