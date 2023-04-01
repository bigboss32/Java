
public class Productores extends Thread {

	private Buffer bufeer;
	private final String letras="abcdegfhijklmnopqrs";
	public Productores(Buffer bufeer) {
		
		this.bufeer = bufeer;
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			char c=letras.charAt((int)Math.random()*letras.length());
			bufeer.poner(c);
			System.out.println(i +"Productor"+ c);
			try {
				sleep(400);
			} catch (Exception e) {
			}
		}
	}
	
}
