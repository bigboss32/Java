
public class Principal {

	public static void main(String[] args) {
		Hilorunebol hilo1=new Hilorunebol();
		Thread tq = new Thread(hilo1,"miguel");
		Thread a = new Thread(hilo1,"darly");
		tq.start();
		a.start();
	}

}
