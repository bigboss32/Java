package dos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		try {
			int a=leer.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("incorrecto");
		}
		
	}

}
