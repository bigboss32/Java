
public class Principal {

	public static void main(String[] args) {
		Buffer a = new Buffer();
		Productores c = new Productores(a);
		Consumidor v= new Consumidor(a);
		c.start();
		v.start();

	}

}
