import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ventana_slahs extends JFrame implements ChangeListener{
	JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider slider3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JPanel panel1;
	public ventana_slahs() {
		setLayout(new GridLayout(4, 1));
		panel1=new JPanel();
		//		slider1.addChangeListener(new ChangeListener() {
		//			public void stateChanged(ChangeEvent e) {
		//				System.out.println("Slider1: " + slider1.getValue());
		//			}
		//		});
		add(panel1);
		
		slider1.setPaintTicks(true);
		slider1.setMajorTickSpacing(50);
		slider1.setMinorTickSpacing(10);
		slider1.setPaintLabels(true);
		slider1.addChangeListener(this);
		add(slider1);

		slider2.setPaintTicks(true);
		slider2.setMajorTickSpacing(50);
		slider2.setMinorTickSpacing(10);
		slider2.setPaintLabels(true);
		slider2.addChangeListener(this);
		add(slider2);
		//		Hashtable ht = slider2.createStandardLabels(50);
		//		slider2.setLabelTable(ht);
		slider3.setPaintTicks(true);
		slider3.setMajorTickSpacing(50);
		slider3.setMinorTickSpacing(10);
		slider3.setPaintLabels(true);
		slider3.addChangeListener(this);
		add(slider3);
	
		//		slider2.addChangeListener(new ChangeListener() {
		//			public void stateChanged(ChangeEvent e) {
		//				System.out.println("Slider2: " + slider2.getValue());
		//			}
		//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource()==slider2 || e.getSource()==slider1 || e.getSource()==slider3) {
			int a=slider1.getValue() ;
			int b=slider2.getValue() ;
			int c=slider3.getValue() ;
			

			panel1.setBackground(new Color(a,b,c));
		}

	}


}


