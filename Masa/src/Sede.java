import java.util.Scanner;

public class Sede {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		System.out.println("1)estudiante");
		System.out.println("2)Profesores");
		System.out.println("3)Particulares");
		System.out.println("4)Salir");
	 
	    int	Opciones= leer.nextInt();
	    int a;
	
	    System.out.println("ingrese la cantidad");
	    a=leer.nextInt();
	
	 	switch (Opciones) {
		case 1: {
			 
			 System.out.println("total "+ a*1000);
			 break;
			 
		}
		case 2: {
			
			System.out.println("tota " + a*5000);
	 
			 
			 break;
		}
		case 3: {
			System.out.println("total " + a*10000);
		 
			 break;
		}
	
		default:
			
		}
	}

}