package hilos;

public class Proceso12 extends Thread{
	   final private String s;

	    public Proceso12(String s) {
	        this.s = s;

	    }

	    public void run() {
	        for (int i = 0; i < 5000; i++) {
	            System.out.println(s + " " + i);
	           
	        }

	    }
}
