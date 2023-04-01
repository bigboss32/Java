import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame{
	Ventana(){
		setTitle("hola");
//		setSize(800, 800);
		setBounds(500, 500, 700, 400);
		setBackground(Color.BLACK);
		setResizable(false);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}

}
