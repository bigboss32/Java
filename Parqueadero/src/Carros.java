import java.util.Arrays;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Carros extends Thread{
	Auto[] au=new Auto[8];
	JLabel[] a=new JLabel[8];
	JLabel[] b=new JLabel[8];
	JLabel [] tiempo= new JLabel[8];
	int z=0,y;
	JLabel noingresaron;
	JTextArea area;
	ListaSimple w;
	Historial t=new Historial();

	public Carros(Auto[] au, JLabel[] a, JLabel[] b,JLabel[] tiempo,JTextArea area,ListaSimple w,JLabel noingresaron,int y) {
		this.au = au;
		this.a = a;
		this.b = b;
		this.tiempo = tiempo;
		this.area=area;
		this.w=w;
		this.noingresaron=noingresaron;
		this.y=y;
	}
	public void run(){

		Random r = new Random();
		Integer [] arrayEnteros = {0, 1, 2, 3, 4, 5, 6, 7};
		for (int i=0; i<arrayEnteros.length; i++) {
			int posAleatoria = r.nextInt(arrayEnteros.length);
			int temp = arrayEnteros[i];
			arrayEnteros[i] = arrayEnteros[posAleatoria];
			arrayEnteros[posAleatoria] = temp;	
		}

		for (int j = 0; j < a.length; j++) {
			z=(int)(Math.random()*100);
			au[arrayEnteros[j]]=new Auto("m"+(j+1),z); 
			a[arrayEnteros[j]].setIcon(new ImageIcon("lleno.png"));
			b[arrayEnteros[j]].setIcon(new ImageIcon("rojo.jpg"));
			tiempo[arrayEnteros[j]].setText("Tiempo: "+z);
			
			
			Tiempo n= new Tiempo(au[arrayEnteros[j]], a[arrayEnteros[j]], b[arrayEnteros[j]], tiempo[arrayEnteros[j]],au,arrayEnteros[j],area,w);
			n.start();


			try {
				sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			t.histo(w,au, arrayEnteros[j]);
		
			area.setText(w.toString());
		}
		

		Generar l=new Generar(au, a, b, tiempo,100,area,w,noingresaron,y);
		l.start();
	}
	
}


//System.out.println(Arrays.asList(arrayEnteros));
//System.out.println(Arrays.toString(arrayEnteros));