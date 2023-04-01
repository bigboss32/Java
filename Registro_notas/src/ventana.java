import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener ,KeyListener{
	JButton botonuno,botondos,botontres,resgistro;
	JPanel paneluno,paneldos;
	JTextArea areauno;
	JTextArea areados;
	JTextField texuno,texdos,textres,nombre,id,buscar;
	JLabel l1,l2,l3,n,c;
	JTabbedPane pestañas;
	ListaSimple m = new ListaSimple();
	public ventana() {
		setTitle("Notas");
		setLayout(new FlowLayout());
		pestañas=new JTabbedPane();
		botonuno=new JButton("Reinciar");
		botondos=new JButton("Eliminar");
		botontres=new JButton("Buscar");
		resgistro=new JButton("registro");
		paneluno=new JPanel();paneldos=new JPanel();
		areauno=new JTextArea(10,10);
		areauno.setEditable(false);
		areados=new JTextArea(10,10);
		areados.setEditable(false);
		paneluno.add(areauno);
		paneluno.add(areados);
		texuno=new JTextField("0",9);
		texdos=new JTextField("0",9);
		textres=new JTextField("0",9);
		buscar=new JTextField(9);
		texuno.enable(false);
		texdos.enable(false);
		textres.enable(false);
		l1=new JLabel("nota 1");
		l2=new JLabel("nota 2");
		l3=new JLabel("nota 3");
		paneluno.add(l1);
		paneluno.add(texuno);
		texuno.addKeyListener(this);
		paneluno.add(l2);
		paneluno.add(texdos);
		texdos.addKeyListener(this);
		paneluno.add(l3);
		paneluno.add(textres);
		textres.addKeyListener(this);
		nombre=new JTextField(9);
		id=new JTextField(9);
		n=new JLabel("Nombre");
		c=new JLabel("Identificacion");
		paneldos.add(n);
		paneldos.add(nombre);
		paneldos.add(c);
		paneldos.add(id);
		paneldos.add(resgistro);
		paneluno.add(botonuno);
		paneluno.add(botondos);
		paneluno.add(buscar);
		paneluno.add(botontres);
		botontres.addActionListener(this);
		botondos.addActionListener(this);
		botonuno.addActionListener(this);
		resgistro.addActionListener(this);
		pestañas.addTab("principal",paneluno);
		pestañas.addTab("resgistro",paneldos);
		add(pestañas);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== resgistro) {
			m.insertarCab(new Nodo(new estudiante(nombre.getText(),id.getText())));
			System.out.println(m.toString());
		}
		if (e.getSource()==botontres) {
			texuno.enable(true);
			texdos.enable(true);
			textres.enable(true);
			if (m.buscar(buscar.getText())==-1) {
				System.out.println(" esta");
				
				System.out.println(m.toString());
			}else{
				
				System.out.println("no esta");
			}
		}

	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.VK_ENTER==e.getKeyCode()) {
			if (texuno.getText()!=null && texdos.getText()!=null && textres.getText()!=null) {
				m.buscar(buscar.getText(), Double.parseDouble(texuno.getText()),Double.parseDouble(texdos.getText()),Double.parseDouble(textres.getText()));
System.out.println(m.toString());
				texuno.enable(false);
				texdos.enable(false);
				textres.enable(false);
			}
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
