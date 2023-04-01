import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Censo c =new Censo(2);
		Persona p[]=new Persona[c.tmano];
		Scanner leer = new Scanner(System.in);
		int edad,cc;
		String nombre;
		boolean sexo;
		for (int i = 0; i < p.length; i++) {
			p[i]=c.registrac(edad=leer.nextInt(), cc=leer.nextInt(), nombre=leer.next(), sexo=leer.nextBoolean());
		}

		
			System.out.println(c.consulta(p[1]));
				
		for (int i = 0; i < p.length; i++) {
			nombre=" "+c.consulta(p[i]);	
		}
		
	}

}
