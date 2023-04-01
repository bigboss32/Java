
public class Princiapl {

	public static void main(String[] args) {
		Cola_doble c=new Cola_doble();
		Cola_doble a=new Cola_doble();
		Persona p = new Persona("miguel",12,12);
		Persona n = new Persona("miguel",12,12);
		Persona pz= new Persona("miguel",12,12);
		Persona pb= new Persona("miguel",12,12);
		c.insertar(new Nodo(p));
		c.insertar(new Nodo(n));
		c.insertar(new Nodo(pz));
		c.insertar(new Nodo(pb));
		a.insertar(new Nodo(c.atender()));
		a.insertar(new Nodo(c.atender()));
		a.insertar(new Nodo(c.atender()));

		System.out.println("1)"+a.toString());
		System.out.println("2)"+c.toString());

	}

}
