
public class Nodo {
	Vehiculo dato;
	Nodo sig;
	Nodo ant;
	public Nodo( Vehiculo d) {
		this.dato = d;
		this.sig = null;
		this.ant = null;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + "]";
	}
	
	


}
