package hilos;

	public class Proceso extends Thread {
		

//	    
//
//	    public Proceso(String msg) {
//	        super(msg);
//	    }

//	    public void run() {
//	        for (int i = 0; i < 1500; i++) {
//	            System.out.println(mensaje);
//	        }
//	        System.out.println("Este proceso ha terminado:" + this.getName());
//	    }
			   public void run() {
			        for (int i = 1; i <= 10; i++) {
			            System.out.println("Hilo: " + i);
			        }

			    }
//	    public void setMensaje(String msj) {
//	        this.mensaje = msj;
//	    }
	}
	
	
