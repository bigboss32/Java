import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sus extends JFrame implements ChangeListener{
	JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
	JLabel numero,tv;
	JTextField num,tvw;
	JButton confirmar;
	public Sus() {
		setTitle("REGISTRO AFILIADO - TV CABLE");
		setBounds(400, 500, 400, 400);
		setLayout(new FlowLayout());
		numero=new JLabel("Numero de caneles");
		barra(slider1,10,1);
		barra(slider2, 1, 1);
		num=new JTextField(4);
		num.setEditable(false);
		confirmar= new JButton("confirmar");
		tv = new JLabel();
		add(slider1);
		
		add(numero);
		add(num);
		add(slider2);
		add(confirmar);
		add(tv);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource()==slider1) {
			num.setText(""+slider1.getValue());
		}		
	}
	void barra(JSlider a,int mostra,int paso){
		a.setPaintTicks(true);
		a.setMajorTickSpacing(mostra);
		a.setMinorTickSpacing(paso);
		a.setPaintLabels(true);
		a.addChangeListener(this);
	}
}
