package hilos;

public class hilo {
    public static void main(String[] args) {
//        Proceso hilo1 = new Proceso("Hilo 1");
//        Proceso hilo2 = new Proceso("Hilo 2");
//        hilo1.setMensaje("Este es el mensaje del hilo 1");
//        hilo2.setMensaje("Mensaje hilo 2");
//
//        hilo1.start();
//        hilo2.start();
//    	 Proceso t = new  Proceso();
//        t.start();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Proceso de siempre Principal:" + i);
//        }
    	   Proceso12 t1;
           Proceso13 t2;

           t1 = new Proceso12("Thread 1");
           t2 = new Proceso13("Hilito      2");

           t1.start();
           t2.start();
    }
}




