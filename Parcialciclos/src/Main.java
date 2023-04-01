
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int contadorvoca = 0,opertunidades = 3,nota1 = 0,nota2 = 0,nota3 = 0,pre2=0,pre3=0;
		char uno;
		double promedio=0;
		String numerouno,numerodos;
		System.out.println("cantidad de estudiantes");
		int can=leer.nextInt();
		for (int i = 0; i < can; i++) {
			opertunidades=3;
			System.out.println("escriba una palabra con vovales");
			String palabra=leer.next();
			System.out.println("esriba el numero");
			String numero= leer.next();
			while (opertunidades!=0) { 
				System.out.println("escriba un numero impar");
				int numeroimpar=leer.nextInt();
				if (numeroimpar%2!=0) {
					System.out.println("impar gano el punto 2.0");
					nota3=2;
					opertunidades=0;
				}else {
					opertunidades--;
					System.out.println("oprtunidades restantes "+ opertunidades);
					nota3=0;
					if (opertunidades==0) {
						pre3++;
					}

				}
			}

			for (int i1 = 0; i1 <palabra.length(); i1++) {
				uno=palabra.charAt(i1);
				if (uno=='a') {

					contadorvoca++;
				}
				if (uno=='e') {

					contadorvoca++;
				}
				if (uno=='i') {

					contadorvoca++;
				}
				if (uno=='o') {
					contadorvoca++;
				}
				if (uno=='u') {
					contadorvoca++;
				}

			}
			if (contadorvoca>=2) {
				System.out.println("punto ganado 2.0");
				nota1=2;
			}else {
				System.out.println("punto perdido");
				nota1=0;
			}
			if (numero.length()>=5) {
				numerouno=""+numero.charAt(0)+""+""+numero.charAt(1);
				numerodos=""+numero.charAt(numero.length()-2)+""+""+numero.charAt(numero.length()-1);
				if (numerouno.equals(numerodos)) {
					System.out.println("gano el punto 1.0");
					nota2=1;
				}else {
					System.out.println("punto perdido");
					nota2=0;
					pre3++;
				}


			}else {
				System.out.println("numero no cumple 5 cifras perdio");
			}
			promedio=promedio+nota1+nota2+nota3;
			System.out.println("notal final del estudiante "+(i+1)+"= "+(nota1+nota2+nota3));
			if (nota1+nota2+nota3<3) {
				System.out.println("perdio");
				if (pre3==2) {
					pre2++;
					pre3=0;
				}
			}else {
				System.out.println("felicidades paso");
			}
			
		}

		System.out.println("promedio del curso es"+promedio/can);
		System.out.println("Personas que contestaron MAL las preguntas 2 y 3 "+pre2);
		System.out.println("porcetaje que perdio "+(pre2*100/can));
		

}
}
