package areglo;


import java.util.Arrays;
import java.util.Scanner;

public class principal {


	public static void main(String[] args) {
		estudiante a[] =new estudiante[3];
		String nombre;
		int ide;
		double pro;
		Scanner leer=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			nombre=leer.next();
			pro=leer.nextDouble();
			ide=leer.nextInt();
			a[i]=new estudiante(ide, pro, nombre);
		}
		Arrays.sort(a);
		imprime(a);
	}
	static void imprime (estudiante[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1) + ". " + array[i].getNombre() + " - promedio: " + array[i].getPro() + " - ide: " + array[i].getIde());
		}}

}
