package parcialwhile;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int Vb []= new int [4];
		String Vc []= new String [8];
		Scanner leer=new Scanner(System.in);
		System.out.println("digite una letra");
		int ban=1;
		String letra=leer.next();
		for (int i = 0; i < Vc.length; i++) {
			Vc [i]=letra;
		}

		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				matriz[x][y] = (int) (Math.random()*200+1);
			}
		}

		for (int i = 0; i < Vb.length; i++) {
			Vb [i]=(int)Math.floor(Math.random()*(10-25+1)+25); 
		}
		while (ban!=0) {




			System.out.println("1)Mostrar el contenido de las matrices MA, MB y el vector VC, como se muestra en la salida\r\n"
					+ "del ejemplo");
			System.out.println("2)En qué posición está el número más grande de la matriz MA");
			System.out.println("3)¿Cuánto suma cada columna de la matriz MA?");
			System.out.println("4)En el vector VC reemplazar por ** los datos ubicados en las posiciones impares del arreglo");
			System.out.println("5) ¿Cuántos múltiplos de 3 tiene la matriz MA en la fila 2?");
			System.out.println("6)salir");
			int opcion=leer.nextInt();

			switch (opcion) {
			case 1: {
				for (int x=0; x < matriz.length; x++) {
					for (int y=0; y < matriz[x].length; y++) {

						System.out.print (matriz[x][y]);
						if (y!=matriz[x].length-1) System.out.print("\t");
					}
					System.out.println("|");
				}
				System.out.println(Arrays.toString(Vb));
				System.out.println(Arrays.toString(Vc));
				break;
			}
			case 2: {

				int mayor = matriz[0][0], menor = matriz[0][0]; 


				for (int x = 0; x < matriz.length; x++) {
					for (int y = 0; y < matriz[x].length; y++) {
						int numeroActual = matriz[x][y];
						if (numeroActual > mayor)
							mayor = numeroActual;
					}
				}
				for (int x=0; x < matriz.length; x++) {
					for (int y=0; y < matriz[x].length; y++) {

						System.out.print (matriz[x][y]);
						if (y!=matriz[x].length-1) System.out.print("\t");
					}
					System.out.println("|");
				}
				System.out.println("numero mayo es "+ mayor);
				break;
			}
			case 3: {
				for (int x=0; x < matriz.length; x++) {
					for (int y=0; y < matriz[x].length; y++) {

						System.out.print (matriz[x][y]);
						if (y!=matriz[x].length-1) System.out.print("\t");
					}
					System.out.println("|");
				}


				for (int x = 0; x < matriz[0].length; x++) {
					System.out.print("_");
				}
				System.out.println();

				for (int x = 0; x < matriz[0].length; x++) {
					int suma = 0;
					for (int y = 0; y < matriz.length; y++) {
						suma += matriz[y][x];
					}
					System.out.printf("%d ", suma);
				}
				System.out.println();
			}

			break;

			case 4: {
				for (int i = 0; i < Vc.length; i++) {
					if (i%2!=0) {
						Vc[i]="**";
					}

				}
				System.out.println(Arrays.toString(Vc));
				break;
			}
			case 5: {
				int aumulador=0;
				for (int y = 0; y < matriz.length; y++) {
					int suma = 0;
					for (int x = 0; x < matriz[y].length; x++) {
						if (matriz[y][2]%3==0) {
							aumulador++;
						}


					}

				}
				System.out.println("cantidad de multiplos de 3 son "+ aumulador);
				break;

			}
			default:
				ban=0;
			}


		}
	}
}