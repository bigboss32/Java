import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cantidad_gtup,cant_de_estu,nit,nit_p;
		int nota1 = 0;
		Scanner leer= new Scanner(System.in);
		String nombre;
		int opcion=0;
		double notauno,notados,notatres;
		Estudiante estu = null;
		System.out.println("Cantidad de grupos");
		cantidad_gtup=leer.nextInt();
		LIsta_doble lista[]= new LIsta_doble[cantidad_gtup];
		for (int i = 0; i < cantidad_gtup; i++) {
			lista[i]=new LIsta_doble();
			System.out.println("cantidad de estudiantes en el grupo " +( i+1));
			cant_de_estu=leer.nextInt();
			for (int j = 0; j < cant_de_estu; j++) {
				System.out.println("Nombre");
				nombre=leer.next();


				System.out.println("Nit");
				nit=leer.nextInt();


				estu= new Estudiante(nombre, nit);				

				lista[i].agregarPrincipio(new Nodo(estu));

			}

		}
		Profesor p[]= new Profesor[cantidad_gtup];
		for (int i = 0; i < p.length; i++) {
			System.out.println("Nombre del profesor");
			nombre=leer.next();
			System.out.println("Nit del profesor");
			nit=leer.nextInt();
			p[i]=new Profesor(nombre, nit, lista[i]);


		} 
		//		System.out.println(lista[0].toString());
		System.out.println(p[0].toString());
		while (opcion!=10) {
			System.out.println("________________________________");
			System.out.println("1)Añadir notas");
			System.out.println("2)Buscar estudiante");
			System.out.println("3)Mostrar un grupo");
			System.out.println("4)mostrar cantidad total");
			System.out.println("5)eliminar todo");
			System.out.println("6)añadir un nuevo estudiante");
			System.out.println("8)Modificar nombre");
			System.out.println("7)salir");
			System.out.println("________________________________");
			opcion=leer.nextInt();
			switch (opcion) {
			case 1:
				try {


					System.out.println("Nit de profesor");
					nit_p=leer.nextInt();
					System.out.println("Nit estudiante");
					nit=leer.nextInt();
					for (int i = 0; i < p.length; i++) {
						if (p[i].id==nit_p) {
							System.out.println("Estudiante " + p[i].l.BuscarElementoEsp(nit));
						}
					}
					boolean bandera=true;
					System.out.println("notas 1");
					while (bandera!=false) {
						nota1=leer.nextInt();
						if (nota1>5 || nota1<0) {
							System.out.println("error en las nota");
						}else{
							bandera=false;
						}
					}
					bandera=true;
					System.out.println("notas 2");
					int nota2 = 0;
					while (bandera!=false) {
						nota2=leer.nextInt();
						if (nota1>5 || nota1<0) {
							System.out.println("error en las nota");
						}else{
							bandera=false;
						}
					}
					System.out.println("notas 3");
					int nota3 = 0;
					bandera=true;
					while (bandera!=false) {
						nota3=leer.nextInt();
						if (nota1>5 || nota1<0) {
							System.out.println("error en las nota");
						}else{
							bandera=false;
						}
					}
					for (int i = 0; i < p.length; i++) {
						if (p[i].id==nit_p) {
							p[i].l.BuscarElementoEsp(nit,nota1,nota2,nota3);

						}
					}
					break;
				} catch (Exception e) {
					System.out.println("error en la base de datos");				}
			case 2:
				try {
					System.out.println("Nit del estudiante");
					nit = leer.nextInt();
					System.out.println("Nit del profesor");
					nit_p=leer.nextInt();
					for (int i = 0; i < p.length; i++) {
						if (p[i].id==nit_p) {
							System.out.println(p[i].l.BuscarElementoEsp(nit));
						}					
					}

				} catch (Exception e) {
					System.out.println("Base de datos eliminada");				}


				break;

			case 3:
				System.out.println("Nit del porfesor");
				nit_p=leer.nextInt();
				for (int i = 0; i < p.length; i++) {
					if (p[i].id==nit_p){

						System.out.println(p[i].l.toString());
					}
				}
				break;
			case 4:
				int a=0;
				try {
					for (int i = 0; i < p.length; i++) {
						a=a+p[i].l.cantidad();
					}
					System.out.println("Cantidad total de estudiantes "+ (a) );
					break;	
				} catch (Exception e) {
					System.out.println("no hay base de datos")
					;}

			case 5:
				for (int i = 0; i < p.length; i++) {

					p[i]=null;

				}
				System.out.println("Base de datos eliminada");
				break;
			case 6:
				System.out.println("Nit del porfesor");
				nit_p=leer.nextInt();
				for (int i = 0; i < p.length; i++) {
					if (p[i].id==nit_p){
						System.out.println("Nombre del nuevo");
						nombre=leer.next();
						System.out.println("Nit");
						nit=leer.nextInt();
						p[i].l.agregarPrincipio(new Nodo(new Estudiante(nombre, nit)));
						System.out.println("Estudiante agregado");
					}
				}
				break;
			case 8:
				System.out.println("Nit del profesor");
				nit_p=leer.nextInt();
				System.out.println("Nit del estudiante");
				nit=leer.nextInt();
				for (int i = 0; i < p.length; i++) {
					if (p[i].id==nit_p) {
						System.out.println("nuevo nombre");
						nombre=leer.next();
						p[i].l.actualizar(nit, nombre);
					}
				}
				break;
			default:
				opcion=10;
				break;
			}	
		}


	}

}
