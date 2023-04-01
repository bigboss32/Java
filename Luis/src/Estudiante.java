
public class Estudiante {
	String nombre;
	int nit,nota1=0,nota2=0,nota3=0,notat;
	Pila pila= new Pila();


	public Estudiante(String nombre, int nit, int nota1, int nota2, int nota3) {
		this.nombre = nombre;
		this.nit = nit;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	
	public Estudiante(String nombre, int nit) {
		this.nombre = nombre;
		this.nit = nit;
	}


	void notas (){
		pila.insertar(new Nodo_pila(nota1));
		pila.insertar(new Nodo_pila(nota2));
		pila.insertar(new Nodo_pila(nota3));
		notat= (nota1+nota2+nota3)/3;
		pila.insertar(new Nodo_pila(notat));
	
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", nit=" + nit + ", Notas=" + pila.toString() + "]";
	}

}
