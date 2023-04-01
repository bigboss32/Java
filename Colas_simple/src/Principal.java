
public class Principal {

	public static void main(String[] args) {
		Cola_Simple c=new Cola_Simple();
		Persona a = new Persona("alta","carlos",12);
		Persona b = new Persona("alta","estela",13);
		c.insertar(new Nodo(a));
		c.insertar(new Nodo(b));
		System.out.println(c.toString());
//		c.atender();
	
		System.out.println(c.buscar(13));
	}
}


