package shurban;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int a,b,c,re;
		boolean bandera=false;
		a=leer.nextInt();
		b=leer.nextInt();
		while (!bandera) {
			System.out.println("Numeros actuales "+a+ " " + b );
			System.out.println("1)Sumar");
			System.out.println("2)restar");
			System.out.println("3)multiplicar");
			System.out.println("4)divdir");
			System.out.println("5)nuevos numeros");
			System.out.println("6)salir");
			int opcion =leer.nextInt();
			switch (opcion) {
			case 1:
				re=a+b;
				if (re>50) {
					System.out.println((double)(re/2));
				}else{
					c=leer.nextInt();
					System.out.println(c*re);
				}
				break;
			case 2:
				re=a-b;
				System.out.println(re);
				if (re>=0) {
					c=leer.nextInt();
					System.out.println(re-c);
				}else{
					c=leer.nextInt();
					System.out.println(re*c);
				}
				break;
			case 3:
				re=a*b;
				if (re>=500) {
					c=leer.nextInt();
					System.out.println(re-c);
				}else{
					c=leer.nextInt();
					System.out.println(re+c);
				}
				break;
			case 4:
				re=a/b;
				if (re>=850) {
					c=leer.nextInt();
					System.out.println(re/c);
				}else{
					c=leer.nextInt();
					System.out.println(re*c);
				}
				break;
			case 5:
				a=leer.nextInt();
				b=leer.nextInt();
				break;
			default:
				bandera=true;
				break;
			}

		}

	}

}
