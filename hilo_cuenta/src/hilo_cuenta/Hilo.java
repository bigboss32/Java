package hilo_cuenta;


import javax.swing.JTextArea;

public class Hilo extends Thread{


	JTextArea area;
	int a ;

	public Hilo(JTextArea s) {
		area = s;

	}
	public void run( ) {
		for (a = 0; a < 1000; a++) {
			area.setText(a+"");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}

	}
 public void reinciar(){
	a=0;
	area.setText(""+a);
 }


}


