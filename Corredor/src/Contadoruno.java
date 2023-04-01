import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Contadoruno extends Thread {
	JTextArea area;
	int a =0;
	long tiempo2,total=0;
	String vec[]= new String[3];
	String nombre;
	JLabel m;

	public Contadoruno(JTextArea s,String r,JLabel d) {
		area = s;
		nombre=r;
		m=d;

	}

	long timpo1=System.currentTimeMillis();
	public void run( ) {

		for (int i = 0; i <= 20; i++) {
			area.setText(i+"");
			try {
				Thread.sleep((int)(Math.random()*1000+1));
			} catch (InterruptedException e) {
			}
		}

		tiempo2=System.currentTimeMillis();
		total=(tiempo2-timpo1)/1000;
		m.setIcon(new ImageIcon ( "RectaFinal.jpg" ) ) ; 
		if (vec[a]!=null) {
			vec[a]=nombre;
		}
		a++;

	}
}
