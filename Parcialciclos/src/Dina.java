import java.util.Scanner;

public class Dina {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char uno;
		int mal = 0,maltotal = 0,estudiante=0;
		int bandera=0;
		double nota1,nota2 = 0,nota3,promedio=0;;
		while (bandera!=1) {
			System.out.println("digite 1 para poder terminar la ejecucion");
			bandera=leer.nextInt();
			System.out.println("escriba una palabra con letra u");
			String palabra=leer.next();
			System.out.println("resultado de la multi 5X5");
			int multi=leer.nextInt();
			System.out.println("numero divisible entre 3");
			int numero3=leer.nextInt();
			estudiante++;
		
			for (int i1 = 0; i1 <palabra.length(); i1++) {
				uno=palabra.charAt(i1);

				if (uno=='u') {
					System.out.println("punto ganado 1.5");	 
					nota2=1.5;
				}else {
					mal++;
					nota2=0;
				}

			}
			if (multi==25) {
				System.out.println("punto ganado"+1.5);
				nota3=1.5;
			}else {
				mal++;
				nota3=0;
			}

			if (numero3%3==0) {
				System.out.println("numero divisible entre 3");
				nota1=2.0;
			}else {
				nota1=0;
			}
			promedio=promedio+nota1+nota2+nota3;
			System.out.println("nota del estudiante "+ estudiante+"es" +(nota1+nota2+nota3));
			if (nota1+nota2+nota3<3) {
				System.out.println("perdio");
			}else {
				System.out.println("gano felicidades");
			}
			
			if (mal==2) {
				maltotal++;
				mal=0;
			}
			
			
		}
	
		System.out.println("Personas que contestaron MAL las preguntas 2 y 3="+maltotal);
		int por=(maltotal*100)/estudiante;
		System.out.println("porcetaje que perdieron= "+por);
		System.out.println("promedio del curso es="+promedio/estudiante);
	}
}