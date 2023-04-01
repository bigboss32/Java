import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		System.out.println("1)Sumar");
		System.out.println("2)Restar");
		System.out.println("3)Multip");
		System.out.println("4)Dividir");
		System.out.println("5)salir");
	    int	Opciones= leer.nextInt();
	    int a,b;
	
	    System.out.println("ingrese el primer numero");
	    a=leer.nextInt();
	    System.out.println("ingrese el segundo numero");
	    b=leer.nextInt();
	 	switch (Opciones) {
		case 1: {
			 
			System.out.println("el resultado es "+ (a+b));
			 break;
			 
		}
		case 2: {
			
			
	 
			System.out.println("el resultado es "+ (a-b));
			 break;
		}
		case 3: {
		 
			System.out.println("el resultado es "+ a*b);
			 break;
		}
		case 4: {
			
					System.out.println("el resultado es "+ a/b);
					 break;
		}
		default:
			
		}
	}

}
