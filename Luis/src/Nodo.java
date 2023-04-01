
public class Nodo {
	Estudiante dato;
	Nodo sig;
	Nodo ant;
	public Nodo( Estudiante d) {
		this.dato = d;
		this.sig = null;
		this.ant = null;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + "]";
	}
	
	


}
