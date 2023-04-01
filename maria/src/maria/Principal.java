package maria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ListaSimple a = new ListaSimple();
		Scanner leer=new Scanner(System.in);
		String nombre,pro,empleado;
		String cc;
		int salir=1;
		while (salir!=0) {
			System.out.println("Digte la cedula ");
			cc=leer.next();
			System.out.println("Digte su nombre ");
			nombre=leer.next();
			System.out.println("Digte lugar de procedencia ");
			pro=leer.next();
			System.out.println("Digte nombre del empleado ");
			empleado=leer.next();
			
			if (a.buscar(cc)!=-1) {
				System.out.println("ya esta registrado");
			}else{
				a.insertar(new Nodo(new estudiante(cc, nombre, pro,empleado)));
				System.out.println("resgistrado");
				System.out.println("ingresar otro cliente si=1 no=0");
				salir=leer.nextInt();
			}
			
		}
		
		System.out.println(a.toString());
		
	
		

	}

}
