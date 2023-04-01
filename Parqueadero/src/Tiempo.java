import java.awt.geom.Area;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Tiempo extends Thread{
	JLabel tiempo;
	Auto orginal[];
	Auto au;
	JLabel a;
	JLabel b;
	int pos,tiempototal;
	boolean v;
	JLabel n;
	JTextArea area;
	ListaSimple l;
	Historial t= new Historial();
	public Tiempo(Auto au, JLabel a, JLabel  b,JLabel tiempo,Auto orginal[],int poscion, JTextArea area,ListaSimple l) {
		this.au = au;
		this.a = a;
		this.b = b;
		this.tiempo = tiempo;
		this.orginal=orginal;
		this.pos=poscion;
		this.area=area;
		this.l=l;

	}
	public Tiempo(int tiempo,boolean v,JLabel n) {
		this.tiempototal=tiempo;
		this.v=v;
		this.n=n;
	}
	public void run(){

		if (v) {
			for (int i = tiempototal; i >=0 ; i--) {
				n.setText("Tiempo de ejecucion: "+i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			suspend();
		}else{
			for (int i = au.tiempo; i >= 0; i--) {
				tiempo.setText("Tiempo:"+i );

				try {
					sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			t.salir(l, orginal, pos);
			area.setText(l.toString());
			orginal[pos]=null;
			//			System.out.println(Arrays.toString(orginal));
			a.setIcon(new ImageIcon("espacio.png"));
			b.setIcon(new ImageIcon("verde.png"));
		}


	}

}
