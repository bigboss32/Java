import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cola_Simple b=new Cola_Simple();
		Cola_Simple x=new Cola_Simple();
		Scanner leer=new Scanner(System.in);
		String nombre;int coidgo,priorirdad;
		int flag=1,salir=0;

		while (flag!=0) {
			System.out.println("nombre/codigo/prioridad");
			b.inserta_paciente(nombre=leer.nextLine(),coidgo=leer.nextInt(),priorirdad=leer.nextInt());
			x.inserta_paciente(nombre,coidgo,priorirdad);
			System.out.println("desea ingresar otro paciente 1)si/2)no");
			salir=leer.nextInt();
			if (salir==0){
				flag=0;
			}		
		}
		int pos;
		Paciente ordene[]=new Paciente[b.tam];
		System.out.println("organizar por prioridad");
		for (int i = 0; i <5; i++) {
			while(flag!=1){
				pos=b.buscar(i+1);
				if (pos==-1) {
					flag=1;
				} else{
					for (int j = 0; j < pos+1; j++) {
						ordene[i]=x.atender();	
					}
	
				}
			}
			System.out.println(ordene[0]);
		}

	}

}
