import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener{
	JTabbedPane pesta�as;
	JPanel panel1,panel2,panel3;
	TextArea tex;
	JButton boton1;
	JLabel num;
	String a[]= new String[10];
	ImageIcon imagen;
	Icon icono;
	public Ventana() {
		setLayout(new FlowLayout());
		setTitle("varios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pesta�as=new JTabbedPane();
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		tex=new TextArea();

	
	
		boton1=new JButton("general numero");
		boton1.setBounds(0, 0, 50, 100);

		

		panel1.add(boton1);
		panel1.add(tex);
		boton1.addActionListener(this);

		pesta�as.addTab("multiplicar", panel1);
		pesta�as.addTab("color", panel2);
		pesta�as.addTab("acciones", panel3);
		

		add(pesta�as);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			int b=(int)(Math.random()*10+10);
			for (int i = 0; i < a.length; i++) {
				a[i]=""+b*i;
			}
			tex.setText("numero alatorio "+ b + " "+Arrays.toString(a));

		}

	}
}
