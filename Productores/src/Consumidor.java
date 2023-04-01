

public class Consumidor extends Thread{
private Buffer bufer;

public Consumidor(Buffer bufer) {

	this.bufer = bufer;
}
public void run(){
	char valor;
	for (int i = 0; i < 10; i++) {
		valor=bufer.recoger();
		System.out.println(i+"Consumidor"+valor);
try {
	 sleep(400);
} catch (Exception e) {
	// TODO: handle exception
}
	}
}


}
