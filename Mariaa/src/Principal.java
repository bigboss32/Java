import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Ingeniero y;
		casos j;
		int a= leer.nextInt();
		String b;
		Lista lista=new Lista();
		for (int i = 0; i < a; i++) {
			
			b=leer.next();
			y=new Ingeniero(i, b);
			lista.insertar(new Nodo_lista(y));
		}
		String casos;
	
		Cola c= new Cola();
		for (int i = 0; i < 10; i++) {
			casos=leer.nextLine();
			j=new casos(i, casos);
			c.insertar(new Nodo_cola(j));
		}
		
		int ramdon= (int)(Math.random()*10+1);
		
		for (int i = 0; i < a; i++) {
			lista.getNodo(lista.buscar(i)).info.pil.insertar(new Nodo_pila(""+c.buscar(ramdon)));;
		}
	}
}
