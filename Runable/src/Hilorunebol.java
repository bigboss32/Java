
public class Hilorunebol implements Runnable{
	private Bancaria cb= new Bancaria();

	public Hilorunebol() {

	}

	  synchronized void HacerRetiro(int cantidad) throws InterruptedException {
		if (cb.getSaldo()>=cantidad) {
			Thread.sleep(1000);
			cb.retirobanco(cantidad);
		}else{
			System.out.println("no hay suficiente dinero");
			System.out.println("saldo actual es "+ cb.getSaldo());
			Thread.sleep(2000);

		}
	}

	@Override
	public void run() {
	for (int i = 0; i <5; i++) {
		try {
		this.HacerRetiro(10);
		if (cb.getSaldo()<0) {
			System.out.println("la cuenta esta sobregirada");
		}
		} catch (Exception e) {
			System.out.println("alerta");
		 
		}
	}

	}



}
