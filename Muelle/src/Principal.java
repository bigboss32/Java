import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cola_doble c = new Cola_doble();
		Cola_doble s = new Cola_doble();
		Cola_doble l = new Cola_doble();
		Cola_doble plataforma = new Cola_doble();
		Scanner leer =new Scanner(System.in);
		int ram=leer.nextInt();
		String codigo;
		boolean contenido = false;
		for (int i = 0; i < ram; i++) {
			codigo=leer.next();
			contenido=leer.nextBoolean();
			c.insertar(new Nodo(new Contenedor(contenido,codigo)));
		}
		while (c.isVacia()!=true) {
			Contenedor a=c.atender();
			if (a.isCarga()==true) {
				s.insertar(new Nodo(a));
			}else{
				plataforma.insertar(new Nodo(a));
			}
			while (plataforma.isVacia()!=true) {
				Contenedor b=c.atender();
				if (b.isCarga()==false) {
					l.insertar(new Nodo(b));
				}
			}
			System.out.println("orginal"+c.toString());
			System.out.println("tren solido " + s.toString());
			System.out.println("tren liquido " + l.toString());
			
		}}}




