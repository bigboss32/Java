package mariapa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ListaSimple m=new ListaSimple();
		Scanner leer=new Scanner(System.in);
		int x;
		double n;
		int cant=leer.nextInt();

		for (int i = 0; i < cant; i++) {

			m.insertar(new Nodo((int)(Math.random() *100 )));
		}
		System.out.println(m.toString());
		System.out.println(m.Impar(m));
		System.out.println(m.par(m));

		
		if (m.par(m)==m.Impar(m)) {
		
			
		}else {
			if (m.par(m)>m.Impar(m)){
				while (m.par(m)!=m.Impar(m)) {
					x=(int)(Math.random() *100 );
					if (x%2!=0) {
						m.insertar(new Nodo(x));
					}
				}
			}else{
				while (m.Impar(m)!=m.par(m)) {
					x=(int)(Math.random() *100 );
					if (x%2==0) {
						m.insertar(new Nodo(x));
					}
				}
			}
		}
		
		System.out.println(m.toString());
		System.out.println(m.par(m)+" pares");
		System.out.println(m.Impar(m) +" impares");
	}

}
