import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cola_doble c1 =new Cola_doble();
		Cola_doble c2=new Cola_doble();

		Cola_doble c3=new Cola_doble();
		Scanner leer=new Scanner(System.in);
		String a;
		int tam=leer.nextInt();
		String destino,vehiculo;
		for (int i = 0; i < tam; i++) {
			System.out.println("cola 1");
			destino=leer.next();vehiculo=leer.next();
			c1.insertar(new Nodo(new Vehiculo(destino,vehiculo)));
			System.out.println("cola 2");
			vehiculo=leer.next();
			c2.insertar(new Nodo(new Vehiculo(vehiculo)));
		}
		
		
		System.out.println(c1.subCola(1,"oriente"));
//		System.out.println(c1.toString() +" cola orginal (1)");
//		System.out.println(c2.toString()+ " cola orginal (2)");
//		System.out.println(c3.unficar(c1.subCola(1, "oriente"), c2.subCola(2, "carro")));
//	}
}
}
