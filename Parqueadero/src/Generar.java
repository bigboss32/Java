import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Generar extends Thread {
	Auto[] au=new Auto[8];
	JLabel[] a=new JLabel[8];
	JLabel[] b=new JLabel[8];
	JLabel [] tiempo= new JLabel[8];
	Auto m;
	int l,n,y;
	int tiempototal;
	JTextArea area;
	ListaSimple w;
	Historial t=new Historial();
	JLabel noingresaron;
	public Generar(Auto[] au, JLabel[] a, JLabel[] b, JLabel[] tiempo,int v,JTextArea area,ListaSimple w,JLabel noingresaron,int y) {
		this.au = au;
		this.a = a;
		this.b = b;
		this.tiempo = tiempo;
		this.tiempototal=v;
		this.area=area;
		this.w=w;
		this.noingresaron=noingresaron;
		this.y=y;
	}

	public void run(){
		while(tiempototal!=0){
			try {
				sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			tiempototal--;
			n=(int)(Math.random()*100);
			m=new Auto("segundo"+(l++),n);
			for (int i = 0; i < au.length; i++) {
				if (au[i]==null) {
					
					au[i]=m;
					a[i].setIcon(new ImageIcon("amarrilo.png"));
					b[i].setIcon(new ImageIcon("rojo.jpg"));
					tiempo[i].setText("Tiempo: "+n);
					Tiempo n= new Tiempo(au[i], a[i], b[i], tiempo[i],au,i,area,w);
					n.start();
					t.histo(w, au, i);
					area.setText(w.toString());
					break;
				}else{
					noingresaron.setText("vehiculos que no ingresaron: " +(y++));
				}
			}	

			
		}
	}
}
