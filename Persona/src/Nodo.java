
public class Nodo {
	Persona info;
	Nodo sig,ant;
	public Nodo(Persona info) {
		this.info = info;
		this.sig = null;
		this.ant = null;
	}
	@Override
	public String toString() {
		return "Nodo [info=" + info + "]";
	}

}
