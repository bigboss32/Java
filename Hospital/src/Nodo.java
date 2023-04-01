
public class Nodo {
	Paciente info;
	Nodo sig;
	public Nodo(Paciente info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return  info+"";
	}




}
